import java.awt.*;
import java.util.Random;

public abstract class Shape {
    private Point[] coordinates;
    private int n;
    private Color color;
    private int size;

    public abstract void draw(Graphics g);

}
