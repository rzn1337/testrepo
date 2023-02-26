import java.awt.*;
import java.awt.Color;
import java.io.*;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class Table {

    File datafile;
    String filepath;

    private int rows;
    private int columns;
    private int x;
    private int y;

    private Cell[] cells;
    private TitleBar titleBar;

    public Table() {
    }

    public void noFileInput(int x, int y, int rows, int columns, String header) {
        titleBar = new TitleBar(x, y, 500, header);
        this.x = x;
        this.y = y+30;
        this.rows = rows;
        this.columns = columns;

        cells = new Cell[rows * columns];

        for(int i = 0; i < rows; i++)
        {
            for(int j = 0; j < columns; j++)
            {
                if(i == 0)
                cells[i*columns + j] = new Cell(this.x + 100 * j , this.y + i * 20, 100, 20, new Color(251,96,127), Color.PINK, 3, "Data");
                else
                    cells[i*columns + j] = new Cell(this.x + 100 * j , this.y + i * 20, 100, 20, new Color(241,221,207), Color.PINK, 3, "default");
            }
        }
    }

    public void fileInput(int x, int y, int r, int c, String filepath, String header) throws FileNotFoundException {
        datafile = new File(filepath);

        Scanner sc = new Scanner(datafile);
        String str = "";


        int temprows = 0;
        int tempcolumns = 0;
        while (sc.hasNext()) {
            str = sc.nextLine();
            temprows++;
            String strarr[] = str.split(" ");
            tempcolumns = Math.max(tempcolumns, strarr.length);
        }

        sc.close();

        this.x = x;
        this.y = y+30;
        this.rows = temprows;
        this.columns = tempcolumns;

        titleBar = new TitleBar(x, y, 500+((columns-5)*100), header);

        String[] dataarr = new String[rows*columns];

        Scanner sc2 = null;
        try {
            sc2 = new Scanner(new FileReader(filepath)).useDelimiter(" ");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        List<String> list = new ArrayList<String>();


        while (sc2.hasNext()) {

            String[] strx = sc2.nextLine().split(" ");
            for (int i = 0; i < strx.length; i++) {
                list.add(strx[i]);
            }
        }

        String[] dataarray = list.toArray(new String[0]);
        sc2.close();

        cells = new Cell[rows * columns];

        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < columns; j++) {
                if(i == 0)
                    cells[i*columns + j] = new Cell(this.x + 100 * j , this.y + i * 20, 100, 20, new Color(251,96,127), Color.PINK, 3, dataarray[i*columns + j]);
                else
                    cells[i*columns + j] = new Cell(this.x + 100 * j , this.y + i * 20, 100, 20, new Color(241,221,207), Color.PINK, 3, dataarray[i*columns + j]);
            }
        }
    }

    public Table(int x, int y, int r, int c, String filepath, String header) throws FileNotFoundException {

        if (filepath != "") {
            fileInput(x,y, r, c , filepath, header);
        } else {
          noFileInput(100,100, 15, 5, header);
        }
    }

    //C:\Users\Syed Ali Rizwan\IdeaProjects\Assignment1\tableData.txt
    public void paint(Graphics g)
    {
        titleBar.paint(g);
        for(int i = 0; i < rows * columns; i++)
        {
            cells[i].paint(g);
        }
    }
}