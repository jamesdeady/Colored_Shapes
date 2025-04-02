// TEST CASE SQUARE SHAPE

//James Deady
//February 6, 2025
//Project 1 Skeleton
//The Square class extends SolidPolygon to create a square shape. It takes color, upper-left point,
// height, and width as input, calculates the square's vertex coordinates, and calls createPolygon
// to define the shape.

import java.awt.*;

public class Square extends SolidPolygon{

    public Square(Color color, Point upperLeft, int height, int width) {
        super(color, 4);

        int[] x_points = {upperLeft.x, upperLeft.x + width, upperLeft.x + width, upperLeft.x};
        int[] y_points = {upperLeft.y, upperLeft.y, upperLeft.y + width, upperLeft.y + width};


        createPolygon(x_points, y_points);
    }
}




//
//import java.awt.*;
//
//public class Square extends SolidPolygon{
//
//    public Square(Color color, Point upperLeft,int width) {
//        super(color, 4);
//
//        int[] x_points = {upperLeft.x, upperLeft.x + width, upperLeft.x + width, upperLeft.x};
//        int[] y_points = {upperLeft.y, upperLeft.y, upperLeft.y, upperLeft.y};
//
//
//        createPolygon(x_points, y_points);
//    }
//}
