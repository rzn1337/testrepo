import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(800, 800);
        frame.setVisible(true);

        DrawingCanvas canvas = new DrawingCanvas();
        frame.add(canvas);
    }
}