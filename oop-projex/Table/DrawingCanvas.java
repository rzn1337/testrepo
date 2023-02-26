import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import javax.swing.*;

public class DrawingCanvas extends Canvas {
    Cell cell;
    Table table;
    public DrawingCanvas(String filepath, String header) throws IOException {
        cell = new Cell(400, 300, 100, 20, Color.GREEN, Color.CYAN, 3, "default");


        if (filepath == "") {
            table = new Table(100,100, 15, 5, "", "Data Table");
        } else {
            table = new Table(100,100, 15, 5, filepath, header);
        }


    }
    public void paint(Graphics g) {
        cell.paint(g);
        table.paint(g);
    }
}