import java.awt.*;

public class Triangle extends Shape{
     private Point[] p;
    private Color color;


    public Triangle(Point[] points, Color C) {
        p = points;
        setColor(C);
    }

    Color getColor()
    {
        return color;
    }


    void setColor(Color Ccolor) {
        color = Ccolor;
    }
    public void draw(Graphics g) {
        g.setColor(getColor());
        int[] xs = {p[0].x, p[1].x, p[2].x};
        int[] ys = {p[0].y, p[1].y, p[2].y};
        g.fillPolygon(xs, ys, 3);
    }
}
