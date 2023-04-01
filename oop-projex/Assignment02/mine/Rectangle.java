import java.awt.*;

public class Rectangle extends Shape{
    private int width;
    private int height;
    private Point center;
    private Color color;

    Rectangle(int height, int width, Point location, Color C)
    {
        setHeight(height);
        setWidth(width);
        setLocation(location);
        setColor(C);
    }

    void setHeight(int h) {
        if (h > 1) {
            height = h;
        } else {
            h = 1;
        }
    }

    void setWidth(int w) {
        if (w > 1) {
            width = w;
        } else {
            w = 1;
        }
    }
    void setLocation(Point Pcenter) {
        center = Pcenter;
    }

    void setColor(Color Ccolor) {
        color = Ccolor;
    }

    int getHeight()
    {
        return height;
    }

    int getWidth()
    {
        return width;
    }
    Point getCorner()
    {
        return center;
    }

    Color getColor()
    {
        return color;
    }
    public void draw(Graphics g)
    {
        g.setColor(getColor());
        g.fillRect(getCorner().x, getCorner().y, getWidth(), getHeight());
    }

}
