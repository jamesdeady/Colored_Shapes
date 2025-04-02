//James Dezdy
//February 6, 2025
//Project 1 Skeleton
//The SyntaxError class defines a custom exception for syntax errors with line and description details.

// Class that defines a syntax error

class SyntaxError extends Exception
{
    // Constructor that creates a syntax error object given the line number and error

    public SyntaxError(int line, String description) {
        super("Syntax Error on Line: " + line + " " + description);
    }
}