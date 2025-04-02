
//James Deady
//February 6, 2025
//Project 1 Skeleton
// This file defines the HollowPolygon class, which extends Polygon_ to represent unfilled polygons.
// It calls the superclass constructor to set the color and vertex count and overrides drawPolygon
// to draw the polygon's outline using Graphics.drawPolygon().

import java.awt.*;

// Class that defines all hollow polygons

class HollowPolygon extends Polygon_ {

    // Constructor that calls super constructor

    public HollowPolygon(Color color, int vertexCount) {
        super(color, vertexCount);
    }

    // Draws hollow polygon

    @Override
    public void drawPolygon(Graphics graphics, Polygon polygon) {
        graphics.drawPolygon(polygon);
    }
}
