import java.awt.*;

public class Cell {
    protected Point topleft ;
    protected int width;
    protected int height;
    protected int stroke;
    protected Color cell_color;
    protected Color stroke_color;
    protected String text;

    protected int fontSize = 12;
    protected int fontStyle = Font.PLAIN;
    protected boolean hover = true;
    protected Rectangle boundary;

    public Cell(int x, int y, int width, int height, Color cell_color, Color stroke_color, int stroke, String text) {
        topleft = new Point(x, y);
        this.width = width;
        this.height = height;
        this.cell_color = cell_color;
        this.stroke_color = stroke_color;
        this.stroke = stroke;
        this.text = text;
        boundary = new Rectangle(topleft.x, topleft.y, topleft.x+width, topleft.y+height);
    }

    public Cell(Point p, int width, int height, Color cell_color, Color stroke_color, int stroke, String text) {
        this(p.x, p.y, width, height, cell_color, stroke_color, stroke, text);
    }

    public void paint(Graphics g) {
        g.setColor(stroke_color);
        g.fillRect(topleft.x - stroke , topleft.y - stroke, width + stroke*2, height + stroke*2);
        g.setColor(cell_color);
        g.fillRect(topleft.x , topleft.y, width, height);
        g.setColor(Color.BLACK);
        paintNormal(g);
        g.drawString(text, topleft.x + 10, topleft.y + (height + fontSize)/2);
    }

    public void paintNormal(Graphics g) {
        fontSize = 12;
        fontStyle = Font.PLAIN;
        Font font= new Font("Times", fontStyle, fontSize);
        //setting font by invoking the setFont() method
        g.setFont(font);
    }

    protected void paintHighlighted(Graphics g) {
        fontSize = 16;
        fontStyle = Font.BOLD;
        Font font= new Font("Courier", fontStyle, fontSize);
        g.setFont(font);
    }

    public Rectangle GetBoundary() {
        return boundary;
    }

    public void setHover(boolean hover) {
        this.hover = hover;
    }
}