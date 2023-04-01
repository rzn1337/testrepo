import java.awt.Color;
import java.awt.Graphics;
/**
 * 
 * @author uakhan
 * This class creates a circle
 */
class Circle extends Shape {
    private int size;
    
    private Point p;
    private Color color;

    /**
     * This is the Circle constructor
     * @param iSize	defines the size
     * @param location defines the location
     * @param C	defines the color
     */
    Circle(int iSize, Point location, Color C)
    {
        setSize(iSize);
        setLocation(location);
        setColor(C);
    }

    void setSize(int iSize) {
        if (iSize > 1) {
            size = iSize;
        } else {
            size = 1;
        }
    }

    void setLocation(Point P) {
        p = P;
    }

    void setColor(Color Ccolor) {
        color = Ccolor;
    }

    int getSize()
    {
        return size;
    }

    Point getPoint()
    {
        return p;
    }

    Color getColor()
    {
        return color;
    }


    public void draw(Graphics g)
    {
        g.setColor(getColor());
        g.fillOval(getPoint().x, getPoint().y, getSize(),getSize());
    }
}