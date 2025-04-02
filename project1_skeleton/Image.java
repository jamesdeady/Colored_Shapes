//James Deady
//February 6, 2025
//Project 1 Skeleton
// This file defines the abstract Image class, which serves as the base for all image objects.
// It includes a Color attribute, a constructor for initializing color, and a colorDrawing method
// to set the drawing color. Subclasses must implement the abstract draw method.

import java.awt.*;

// Abstract base class that defines all image objects

abstract class Image {

    private Color color;

    // Constructor that can only be called by the subclasses to initialize the color

    public Image(Color color) {
        this.color = color;
    }

    // Sets the color of the image to be drawn. Must be called first by the draw function of the subclasses

    public void colorDrawing(Graphics graphics) {
        graphics.setColor(color);
    }

    abstract void draw(Graphics graphics);
}


