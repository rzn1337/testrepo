import java.awt.*;

public class Hexagon extends Polygon {

    Color stroke_color;

    public Hexagon(int[] e, int[] f, Color sc) {
        super(e, f, 6);
        stroke_color = sc;
    }

    public Hexagon(int x1, int x2, int x3, int x4, int x5, int x6, int y1, int y2, int y3, int y4, int y5, int y6, Color sc) {
        super(new int[] {x1, x2, x3, x4, x5, x6}, new int[] {y1, y2, y3, y4, y5, y6}, 6);
        stroke_color = sc;
    }

    public void paint(Graphics g) {
        g.setColor(stroke_color);
        g.drawPolygon(xpoints, ypoints, 6);
    }
}
