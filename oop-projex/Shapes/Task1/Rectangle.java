import java.awt.*;

public class Rectangle {

    Point center;
    int height;
    int width;
    Color button_color;
    Color stroke_color;
    int stroke;

    public Rectangle(int x, int y, int width, int height, Color button_color, Color stroke_color, int stroke) {
        center = new Point(x, y);
        this.height = height;
        this.width = width;
        this.button_color = button_color;
        this.stroke_color = stroke_color;
        this.stroke = stroke;
    }

    public void paint(Graphics g) {
        g.setColor(stroke_color);
        g.fillRect(center.x - width/2 - stroke , center.y - height/2 - stroke, width + stroke*2, height + stroke*2);
        g.setColor(button_color);
        g.fillRect(center.x - width/2 , center.y - height/2, width, height);
        g.setColor(Color.magenta);
        int fontsize = ((width*height)/3000);
        Font f1 = new Font("TimesNewRoman", Font.BOLD, fontsize);
        g.setFont(f1);
        g.drawString("Sphinx of Black Quartz, Judge my Vow.", center.x-width/4, center.y);
    }
}
