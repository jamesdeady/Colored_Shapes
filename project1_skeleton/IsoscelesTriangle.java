//James Deady
//February 6, 2025
//Project 1 Skeleton
//// This file defines the `IsoscelesTriangle` class, which extends SolidPolygon to represent an isosceles triangle.
//// The constructor initializes the triangle with a specified color, top vertex, height, and width.
//// It calculates and assigns the x and y coordinates to define the triangle's shape.


import java.awt.*;
class IsoscelesTriangle extends SolidPolygon{
    public IsoscelesTriangle(Color color, Point upperLeft, int height, int width) {
        super(color, 3);
        int[] x_points = {upperLeft.x, upperLeft.x - height, upperLeft.x + height};
        int[] y_points = {upperLeft.y, upperLeft.y + height, upperLeft.y + height};
        createPolygon(x_points, y_points);
    }
}

//  Isosceles Color (255, 0, 0) at (120, 120) Height 100 Width 200;

// The IsoscelesTriangle class must have a constructor that is supplied the color of the triangle,
// a point that specifies the location of the top vertex, and the height and width of the triangle. It
// must allocate the arrays of x and y coordinates that defines the triangle and it must compute their
// values.


