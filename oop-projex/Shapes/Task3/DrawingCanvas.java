import java.awt.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class DrawingCanvas extends Canvas {

    public void paint(Graphics g) {

        File myObj = new File("shapesData.txt");
        Scanner myReader = null;
        try {
            myReader = new Scanner(myObj);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        while (myReader.hasNextLine()) {
            String x = myReader.nextLine();
            String[] arr = x.split(" ");
            switch(arr[0]) {
                case "triangle":
                    int[] a = {Integer.parseInt(arr[1]), Integer.parseInt(arr[2]), Integer.parseInt(arr[3])};
                    int[] b = {Integer.parseInt(arr[4]), Integer.parseInt(arr[5]), Integer.parseInt(arr[6])};
                    Triangle triangle = new Triangle(a, b, Color.DARK_GRAY);
                    triangle.paint(g);
                    break;
                case "quadrilateral":
                    int[] c = {Integer.parseInt(arr[1]), Integer.parseInt(arr[2]), Integer.parseInt(arr[3]), Integer.parseInt(arr[4])};
                    int[] d = {Integer.parseInt(arr[5]), Integer.parseInt(arr[6]), Integer.parseInt(arr[7]), Integer.parseInt(arr[8])};
                    Quadrilateral quadrilateral = new Quadrilateral(c, d, Color.MAGENTA);
                    quadrilateral.paint(g);
                    break;
                case "pentagon":
                    int[] e = {Integer.parseInt(arr[1]), Integer.parseInt(arr[2]), Integer.parseInt(arr[3]), Integer.parseInt(arr[4]), Integer.parseInt(arr[5])};
                    int[] f = {Integer.parseInt(arr[6]), Integer.parseInt(arr[7]), Integer.parseInt(arr[8]), Integer.parseInt(arr[9]), Integer.parseInt(arr[10])};
                    Pentagon pentagon = new Pentagon(e, f, Color.BLUE);
                    pentagon.paint(g);
                    break;
                case "hexagon":
                    int[] h = {Integer.parseInt(arr[1]), Integer.parseInt(arr[2]), Integer.parseInt(arr[3]), Integer.parseInt(arr[4]), Integer.parseInt(arr[5]), Integer.parseInt(arr[6])};
                    int[] j = {Integer.parseInt(arr[7]), Integer.parseInt(arr[8]), Integer.parseInt(arr[9]), Integer.parseInt(arr[10]), Integer.parseInt(arr[11]), Integer.parseInt(arr[12])};
                    Hexagon hexagon = new Hexagon(h, j, Color.BLUE);
                    hexagon.paint(g);
                    break;
                case "regularpentagon":
                    RegularPentagon regularPentagon = new RegularPentagon(Integer.parseInt(arr[1]),Integer.parseInt(arr[2]), Integer.parseInt(arr[3]), Color.BLACK);
                    regularPentagon.paint(g);
                    break;
                case "regularhexagon":
                    RegularHexagon regularHexagon = new RegularHexagon(Integer.parseInt(arr[1]),Integer.parseInt(arr[2]), Integer.parseInt(arr[3]), Color.RED);
                    regularHexagon.paint(g);
                    break;
                case "pentagram":
                    Pentagram pentagram = new Pentagram(Integer.parseInt(arr[1]),Integer.parseInt(arr[2]), Integer.parseInt(arr[3]), Color.BLUE);
                    pentagram.paintpentagram(g);
                    break;
            }
        }
        myReader.close();
    }
}
