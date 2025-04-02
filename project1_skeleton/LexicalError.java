//James Dezdy
//February 6, 2025
//Project 1 Skeleton
//This file defines the LexicalError class, which extends Exception to represent lexical errors.
// It includes a constructor that takes the line number and an error description, and it passes
// a formatted error message to the Exception class.
// Class that defines a lexical error

class LexicalError extends Exception
{
    // Constructor that creates a lexical error object given the line number and error

    public LexicalError(int line, String description)    {
        super("Lexical Error on Line: " + line + " " + description);
    }
}