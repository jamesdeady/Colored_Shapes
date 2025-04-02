//James Dezdy
//February 6, 2025
//Project 1 Skeleton
//Defines `RegularPolygon`, which creates polygons with a specified number of sides, center, and radius.

import java.awt.*;
class RegularPolygon extends SolidPolygon {

    public RegularPolygon(Color color, int sides, Point center, int radius) {
        super(color, sides);

        int[] x_points = new int[sides];
        int[] y_points = new int[sides];

        for (int i = 0; i < sides; i++) {
            double angle = 2 * Math.PI * i / sides; // Evenly space vertices around the circle
            x_points[i] = center.x + (int) (radius * Math.cos(angle));
            y_points[i] = center.y + (int) (radius * Math.sin(angle));
        }

        createPolygon(x_points, y_points);
    }
}

//  The RegularPolygon class must contain a constructor that is supplied the color of the polygon,
//  the number of sides, a point that specifies the location of its center, and the radius, which defines
//  the distance between the center and each of the vertices. It must allocate the arrays of x and y
//  coordinates that defines the regular polygon and it must compute their values.
