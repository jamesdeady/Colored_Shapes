//James Deady
//February 6, 2025
//Project 1 Skeleton
// This file defines the DrawingPanel class, which extends JPanel to render images.
// It maintains an ArrayList<Image> to store images, provides an addImage method to
// add images, and overrides paintComponent to draw them on the panel.

import java.awt.*;
import java.util.*;
import javax.swing.*;

// Class that defines the panel for drawing the images

class DrawingPanel extends JPanel {

    private ArrayList<Image> images = new ArrayList<>();

    // Adds a graphic object to the drawing panel



    public void addImage(Image image) {

        images.add(image);
      }

    // Draws all the images on the drawing panel

    @Override
    protected void paintComponent(Graphics graphics) {
        super.paintComponent(graphics);
        for (Image image : images)
            image.draw(graphics);
    }
}
