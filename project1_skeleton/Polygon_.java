//James Deady
//February 6, 2025
//Project 1 Skeleton
// Abstract base class for all polygon classes

import java.awt.*;



abstract class Polygon_ extends Image {

    int vertexCount;
    private Polygon polygon;

    // Constructor that initializes color and vertexCount of a polygon

    public Polygon_(Color color, int vertexCount) {
        super(color);
        this.vertexCount = vertexCount;
    }

    // Creates a polygon object given its vertices

    public void createPolygon(int[] x_points, int[] y_points) {
        polygon = new Polygon(x_points, y_points, vertexCount);
    }

    // Draws polygon using polygon object

    @Override
    public void draw(Graphics graphics) {
        colorDrawing(graphics);
        drawPolygon(graphics, polygon);
    }

    abstract public void drawPolygon(Graphics graphics, Polygon polygon);
}
