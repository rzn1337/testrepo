import java.awt.Color;
import java.awt.Graphics;

public class TitleBar extends Cell
{
    Cell closingButton;

    public TitleBar(int x, int y, int width, String header)
    {
        super(x, y, width, 30, Color.BLACK, Color.GRAY, 3, header);
        closingButton =  new Cell(x + width - 24 , y + 3, 20, 20, Color.RED, Color.GRAY, 2, "");
    }

    public void paint(Graphics g)
    {
        g.setColor(stroke_color);
        g.fillRect(topleft.x - stroke , topleft.y - stroke, width + stroke*2, height + stroke*2);
        g.setColor(cell_color);
        g.fillRect(topleft.x , topleft.y, width, height);
        g.setColor(Color.WHITE);
        paintHighlighted(g);
        g.drawString(text, topleft.x + 10, topleft.y + (height + fontSize)/3);
        closingButton.paint(g);
    }
}