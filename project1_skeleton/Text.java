//James Deady
//February 6, 2025
//Project 1 Skeleton
//The Text class extends Image, defining a constructor to store text, color, and position,
// and overrides the draw method to display the text at the specified location.

import java.awt.*;

class Text extends Image {
    private String text;  // Declare the missing field
    private Point point;


    public Text(Color color, Point point, String text) {
        super(color);
        this.text = text;  // Store the text parameter
        this.point = point;
    }

    @Override
    void draw(Graphics graphics) {

        colorDrawing(graphics); // Set the color first
        graphics.drawString(text, point.x, point.y);

        // You can implement drawing logic here later
    }
}

// The Text class must contain a constructor that is supplied the color that defines the text color, a
// point that specifies the text location and a string containing the text to be displayed. It must also
// contain a draw function because it is extends the abstract class Image. The draw function must
// draw the text using the method drawString in Graphics class.
