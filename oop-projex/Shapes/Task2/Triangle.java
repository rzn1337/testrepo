import java.awt.*;

public class Triangle extends Polygon {

    Color stroke_color;

    public Triangle(int[] x, int[] y, Color sc) {
        super(x, y, 3);
        stroke_color = sc;
    }

    public void paint(Graphics g) {
    g.setColor(stroke_color);
    g.drawPolygon(xpoints, ypoints, 3);
    }
}
