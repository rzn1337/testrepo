import java.awt.*;

public class Pentagon extends Polygon {

    Color stroke_color;

    /*public Pentagon(int x, int y, int radius, Color sc) {

        int[] a = new int[5];
        int[] b = new int[5];
        int factorx = 1;
        int factory = 1;

        for (int i = 0; i < 5; i++, factorx++) {
            a[i] = x + (int) (radius * Math.cos(Math.toRadians(72 * factorx)));
        }

        for (int i = 0; i < 5; i++, factory++) {
            b[i] = y - (int) (radius * Math.cos(Math.toRadians(72 * factory)));
        }

        Pentagon regpent = new Pentagon(a, b, sc);
        regpent.paint(g);

    }*/
    public Pentagon(int[] c, int[] d, Color sc) {
        super(c, d, 5);
        stroke_color = sc;
    }

    public Pentagon(int x1, int x2, int x3, int x4, int x5, int y1, int y2, int y3, int y4, int y5, Color sc) {
        super(new int[] {x1, x2, x3, x4, x5}, new int[] {y1, y2, y3, y4, y5}, 5);
        stroke_color = sc;
    }

    public Pentagon(int x1, int x2, int x3, int x4, int x5, int x6, int x7, int x8, int x9, int x10, int y1, int y2, int y3, int y4, int y5, int y6, int y7, int y8, int y9, int y10, Color sc) {
        super(new int[] {x1, x2, x3, x4, x5, x6, x7, x8, x9, x10}, new int[] {y1, y2, y3, y4, y5, y6, y7, y8, y9, y10}, 10);
        stroke_color = sc;
    }



    public void paint(Graphics g) {
        g.setColor(stroke_color);
        g.drawPolygon(xpoints, ypoints, 5);
    }

    public void paintpentagram(Graphics g) {
        g.setColor(stroke_color);
        g.drawPolygon(xpoints, ypoints, 10);
    }

}
