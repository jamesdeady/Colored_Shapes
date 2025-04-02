
//James Deady
//February 6, 2025
//Project 1 Skeleton
//This file defines the Parallelogram class, which extends SolidPolygon to represent a parallelogram.
// The constructor takes the color, two points for the upper left and lower right vertices, and an
// offset value for the x-distance between the upper and lower left vertices. It calculates the x
// and y coordinates for the parallelogram and creates the polygon using these coordinates.
import java.awt.*;

class Parallelogram extends SolidPolygon {

    Parallelogram (Color color, Point upperLeft, Point lowerRight, int offset) {

        super(color, 4);

        int[] x_points = {upperLeft.x, lowerRight.x + offset, lowerRight.x, upperLeft.x - offset};

        int[] y_points = {upperLeft.y, upperLeft.y, lowerRight.y, lowerRight.y};

        createPolygon(x_points, y_points);

    }
}



// The Parallelogram class must have a constructor that is supplied the color of the parallelogram,
// two points that specifies the location of the upper left and lower right vertices in addition to
// an x offset value that specifies the x distance between the upper and lower left vertices. It must
// allocate the arrays of x and y coordinates that defines the parallelogram and it must compute their
// values.