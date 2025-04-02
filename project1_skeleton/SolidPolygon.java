//James Deady
//February 6, 2025
//Project 1 Skeleton
//SolidPolygon class extends Polygon_ to create and draw filled polygons with outlined edges.
// It includes a constructor for setting color and vertex count, and overrides drawPolygon to
// fill and outline the shape.


import java.awt.*;

class SolidPolygon extends Polygon_ {
    public SolidPolygon(Color color, int vertexCount) {
        super(color, vertexCount);
    }

    @Override
    public void drawPolygon(Graphics graphics, Polygon polygon) {
        graphics.fillPolygon(polygon);        // Fill the shape
//        graphics.setColor(Color.BLACK);       // Set outline color (optional)
        graphics.drawPolygon(polygon);        // Draw the outline

    }
}

// The SolidPolygon class must contain a constructor that is passed the number of vertices in the
// polygon and its color. It must define the method drawPolygon because it is extends the abstract
// class Polygon_. It should call the fillPolygon method of the Graphics class to draw a solid
// polygon.
