import java.awt.*;

public class DrawingCanvas extends Canvas {

    public void paint(Graphics g) {
        Rectangle r = new Rectangle(300, 100, 500, 100, Color.cyan, Color.GREEN, 3);
        r.paint(g);
    }
}
