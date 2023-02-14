import java.awt.*;

public class RegularPentagon extends Pentagon {

    public RegularPentagon(int x, int y, int radius, Color sc) {

        super(x + (int) (radius*Math.cos(Math.toRadians(90))),
                (x + (int) (radius*Math.cos(Math.toRadians(90+72*1)))),
                (x + (int) (radius*Math.cos(Math.toRadians(90+72*2)))),
                (x + (int) (radius*Math.cos(Math.toRadians(90+72*3)))),
                (x + (int) (radius*Math.cos(Math.toRadians(90+72*4)))),
                (y - (int) (radius*Math.sin(Math.toRadians(90)))),
                (y - (int) (radius*Math.sin(Math.toRadians(90+72*1)))),
                (y - (int) (radius*Math.sin(Math.toRadians(90+72*2)))),
                (y - (int) (radius*Math.sin(Math.toRadians(90+72*3)))),
                (y - (int) (radius*Math.sin(Math.toRadians(90+72*4)))), sc);

    }

}
