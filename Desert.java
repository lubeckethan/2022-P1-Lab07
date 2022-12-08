import java.awt.*;
import java.applet.*;

public class Desert {

    public static void drawDesert(Graphics g)
    {
        g.setColor(new Color( 145,235,231));
        g.fillRect(1,1,1000,500);

        g.setColor(new Color(246,190,71));
        g.fillRect(1,501,1000,500);

    }

    public static void drawSun(Graphics g)
    {
        g.setColor(new Color(249,250,73));
        g.fillOval(50,50, 100,100);

    }





}
