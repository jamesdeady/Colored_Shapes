Colored_Shapes

This Java GUI project was created for CMSC 330: Advanced Programming Languages. The 
application reads a custom scene definition file, parses it according to a specified 
grammar, and displays a graphical scene with various colored shapes.

Project Overview

The starter program was expanded to support a broader grammar and display additional 
shapes including:

- Right Triangle
- Rectangle
- Parallelogram
- Isosceles Triangle
- Regular Polygon
- Text
- Custom Addition: A yellow square (not in the original spec)

The program processes scene definition files, creates shape objects based on the grammar, 
and renders them using Java AWT and Swing.

Technologies Used

- Java (Object-Oriented Programming)
- Java AWT & Swing (for GUI rendering)
- Custom Lexer & Parser
- Scene grammar based on an EBNF specification

How to Run the Program

1. Open the project in your IDE
   (Tested with IntelliJ IDEA and Eclipse)

2. Build the project
   Make sure all `.java` files are compiled. You may need to set the `src` folder as your 
   source directory.

3. Run the main class 
   The class containing the `main` method will read a scene definition file and launch the 
   GUI.

4. Use a valid scene input file  
   Example format:

Scene MyScene (500, 500) 
RightTriangle Color (255, 0, 0) at (50, 30) Height 100 Width 300; 
Rectangle Color (0, 128, 255) at (100, 100) Height 200 Width 100; 
End.


5. View your output. A window will display the generated shapes and text.

Sample Output

![Sample Output](Project%201-2.png)

(This image was captured from the actual running program.)

Testing

Test cases include all supported shapes and confirm correct rendering of:

- Shape positions and dimensions
- Colors
- Text labels
- Proper parsing from file input
