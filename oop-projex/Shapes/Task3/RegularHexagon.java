import java.awt.*;

public class RegularHexagon extends Hexagon {

    public RegularHexagon(int x, int y, int radius, Color sc) {

        super((x + (int) (radius * Math.cos(0 * 2 * Math.PI / 6))),
                (x + (int) (radius * Math.cos(1 * 2 * Math.PI / 6))),
                (x + (int) (radius * Math.cos(2 * 2 * Math.PI / 6))),
                (x + (int) (radius * Math.cos(3 * 2 * Math.PI / 6))),
                (x + (int) (radius * Math.cos(4 * 2 * Math.PI / 6))),
                (x + (int) (radius * Math.cos(5 * 2 * Math.PI / 6))),
                (y + (int) (radius * Math.sin(0 * 2 * Math.PI / 6))),
                (y + (int) (radius * Math.sin(1 * 2 * Math.PI / 6))),
                (y + (int) (radius * Math.sin(2 * 2 * Math.PI / 6))),
                (y + (int) (radius * Math.sin(3 * 2 * Math.PI / 6))),
                (y + (int) (radius * Math.sin(4 * 2 * Math.PI / 6))),
                (y + (int) (radius * Math.sin(5 * 2 * Math.PI / 6))),
                sc);
    }


}
