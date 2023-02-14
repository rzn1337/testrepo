import java.awt.*;

public class DrawingCanvas extends Canvas {

    public void paint(Graphics g) {

        int[] x = {110, 0, 210};
        int[] y = {300, 350, 350};

        Triangle triangle = new Triangle(x, y, Color.DARK_GRAY);
        triangle.paint(g);

        int[] a = {250, 350, 350, 250};
        int[] b = {300, 300, 400, 400};

        Quadrilateral quadrilateral = new Quadrilateral(a, b, Color.MAGENTA);
        quadrilateral.paint(g);

        int[] c = {500, 600, 550, 450, 400 };
        int[] d = {300, 350, 425, 425, 350};

        Pentagon pentagon = new Pentagon(c, d, Color.BLUE);
        pentagon.paint(g);

        int[] e = {650, 750, 850, 850, 750, 650 };
        int[] f = {350, 300, 350, 400, 450, 400};

        Hexagon hexagon = new Hexagon(e, f, Color.ORANGE);
        hexagon.paint(g);

        RegularPentagon regularPentagon = new RegularPentagon( 1000,400, 100, Color.BLACK);
        regularPentagon.paint(g);

        RegularHexagon regularHexagon = new RegularHexagon(1250, 400, 100, Color.RED);
        regularHexagon.paint(g);

        pentagon.reset();
        regularPentagon.reset();

        Pentagram pentagram = new Pentagram(700, 600, 100, Color.BLUE);
        pentagram.paintpentagram(g);

    }
}
