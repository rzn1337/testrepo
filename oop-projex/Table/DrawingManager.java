import javax.swing.JFrame;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

//import drawing.DrawingCanvas;

public class DrawingManager {
    public static void main(String[] args) throws IOException {
        String header = "";
        System.out.println("Enter your File Path without the quotation marks.\nIn case there isn't a data file, press Enter.");
        Scanner sc = new Scanner(System.in);
        String filepath = sc.nextLine();
        if (filepath != "") {
            System.out.println("TitleBar Heading: ");
            header= sc.nextLine();
        }
        DrawingCanvas canvas = new DrawingCanvas(filepath, header);
        JFrame frame=new JFrame();
        frame.add(canvas);
        frame.setSize(1920,1080);
        //frame.setLayout(null);
        frame.setVisible(true);
    }

}