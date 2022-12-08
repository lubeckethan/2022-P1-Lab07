import java.awt.*;
import java.util.*;
import java.applet.*;

public class Vagabond {

    public static void drawHead(Graphics g) {
        //Head
        g.setColor(new Color(250, 214, 135));
        g.fillOval(350, 350, 75, 75);
        //Eyes
        g.setColor(Color.red);
        g.fillOval(370, 375, 10, 10);
        g.fillOval(395, 375, 10, 10);
        //Mouth
        g.setColor(Color.black);
        g.fillArc(363, 395, 50, 15, 90, 360);
    }


    public static void drawBody(Graphics g) {
        //Main Body
        g.setColor(Color.white);
        g.fillRect(340, 425, 100, 150);

        //Arms/Legs
        g.setColor(Color.black);
        g.fillRect(240, 450, 100, 20);
        g.fillRect(440, 450, 100, 20);
        g.fillRect(350, 575, 20, 100);
        g.fillRect(410, 575, 20, 100);


    }

    public static void drawHat(Graphics g) {
        g.setColor(new Color(235, 118, 64));
        g.fillArc(340, 340, 100, 20, 90, 360);
        g.fillRect(360, 245, 60, 100);


    }

    public static void drawShoes(Graphics g)
    {
        g.setColor(new Color(252,8,18));
        g.fillRect(410,660,100,20);
        g.fillRect( 270,660, 100,20);
        //Heels
        g.setColor(Color.black);
        g.fillRect(410,678,15,15);
        g.fillRect(355,678,15,15);





    }



}
