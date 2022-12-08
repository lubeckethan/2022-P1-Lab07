import java.awt.*;
import java.util.*;
import java.applet.*;



public class MainPicture extends Applet{

    public void paint(Graphics g){

        Desert.drawDesert(g);
        Desert.drawSun(g);

        Vagabond.drawHead(g);
        Vagabond.drawBody(g);
        Vagabond.drawHat(g);
        Vagabond.drawShoes(g);

        Cactus.drawStem(g);
        Cactus.drawBranches(g);
        Cactus.drawSpikes(g);
    }





}
