import java.awt.*;

public class Quadrilateral extends Polygon {

    Color stroke_color;

    public Quadrilateral(int[] a, int[] b, Color sc) {
        super(a, b, 4);
        stroke_color = sc;
    }

    public void paint(Graphics g) {
        g.setColor(stroke_color);
        g.drawPolygon(xpoints, ypoints, 4);
    }
}


