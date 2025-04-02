//James Deady
//February 6, 2025
//Project 1 Skeleton
// This file defines the `Lexer` class, which serves as a lexical analyzer for Project 1.
// It tokenizes an input file using `StreamTokenizer`, identifies different token types,
// and provides methods to retrieve lexemes, numeric values, and line numbers.

import java.io.*;

// This class provides the lexical analyzer for project 1

class Lexer {

    private StreamTokenizer tokenizer;
    private String punctuation = ",;.()";
    private Token[] punctuationTokens = {Token.COMMA, Token.SEMICOLON, Token.PERIOD, Token.LEFT_PAREN, Token.RIGHT_PAREN };

    // Constructor that creates a lexical analyzer object given the source file

    public Lexer(File file) throws FileNotFoundException {
        tokenizer = new StreamTokenizer(new FileReader(file));
        tokenizer.ordinaryChar('.');
        tokenizer.quoteChar('"');
    }

    // Returns the next token in the input stream

    public Token getNextToken() throws LexicalError, IOException {
        int token = tokenizer.nextToken();
        switch (token) {
            case StreamTokenizer.TT_NUMBER:
                return Token.NUMBER;
            case StreamTokenizer.TT_WORD:
                for (Token aToken : Token.values())
                    if (aToken.name().replace("_","").equals(tokenizer.sval.toUpperCase()))
                        return aToken;
                return Token.IDENTIFIER;




            case '"':  // If the token is a quoted string
                return Token.STRING;




            case StreamTokenizer.TT_EOF:
                return Token.EOF;
            default:
                for (int i = 0; i < punctuation.length(); i++)
                    if (token == punctuation.charAt(i))
                        return punctuationTokens[i];
        }
        return Token.EOF;
    }

    // Returns the lexeme associated with the current token

    public String getLexeme() {
        if (tokenizer.ttype == StreamTokenizer.TT_WORD || tokenizer.ttype == '"') {
            return tokenizer.sval;
        }
        return null;
    }

    // Returns the numeric value of the current token for numeric tokens

    public int getNumber() {
        return (int) tokenizer.nval;
    }

    // Returns the current line of the input file

    public int getLineNo() {
        return tokenizer.lineno();
    }
}
