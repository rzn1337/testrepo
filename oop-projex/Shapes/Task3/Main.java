import javax.swing.*;
import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        JFrame frame = new JFrame();
        frame.setSize(1920, 1080);
        frame.setVisible(true);

        DrawingCanvas canvas = new DrawingCanvas();
        frame.add(canvas);
    }
}