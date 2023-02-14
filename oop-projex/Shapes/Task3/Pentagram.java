import java.awt.*;

public class Pentagram extends Pentagon {

    public Pentagram(int x, int y, int radius, Color sc) {
        super ((x + (int) (radius*Math.cos(Math.toRadians(90)))),
                (x + (int) ((radius/2)*Math.cos(Math.toRadians(126)))),
                (x + (int) (radius*Math.cos(Math.toRadians(90+72*1)))),
                (x + (int) ((radius/2)*Math.cos(Math.toRadians(126+72*1)))),
                (x + (int) (radius*Math.cos(Math.toRadians(90+72*2)))),
                (x + (int) ((radius/2)*Math.cos(Math.toRadians(126+72*2)))),
                (x + (int) (radius*Math.cos(Math.toRadians(90+72*3)))),
                (x + (int) ((radius/2)*Math.cos(Math.toRadians(126+72*3)))),
                (x + (int) (radius*Math.cos(Math.toRadians(90+72*4)))),
                (x + (int) ((radius/2)*Math.cos(Math.toRadians(126+72*4)))),
                (y - (int) (radius*Math.sin(Math.toRadians(90)))),
                (y - (int) ((radius/2)*Math.sin(Math.toRadians(126)))),
                (y - (int) (radius*Math.sin(Math.toRadians(90+72*1)))),
                (y - (int) ((radius/2)*Math.sin(Math.toRadians(126+72*1)))),
                (y - (int) (radius*Math.sin(Math.toRadians(90+72*2)))),
                (y - (int) ((radius/2)*Math.sin(Math.toRadians(126+72*2)))),
                (y - (int) (radius*Math.sin(Math.toRadians(90+72*3)))),
                (y - (int) ((radius/2)*Math.sin(Math.toRadians(126+72*3)))),
                (y - (int) (radius*Math.sin(Math.toRadians(90+72*4)))),
                (y - (int) ((radius/2)*Math.sin(Math.toRadians(126+72*4)))), sc);
    }


}
