import java.awt.*;
import java.util.Random;

public class Cactus {

    public static void drawStem(Graphics g) {
        g.setColor(new Color(165, 235, 69));
        g.fillRect(700, 300, 75, 300);
        g.setColor(new Color(201, 212, 51));
        g.fillOval(687, 270, 100, 50);
    }

    public static void drawBranches(Graphics g) {
        g.setColor(new Color(201, 212, 51));
        Polygon Branch = new Polygon();
        Branch.addPoint(775, 350);
        Branch.addPoint(775, 400);
        Branch.addPoint(850, 300);

        g.fillPolygon(Branch);

        g.setColor(new Color(201, 212, 51));
        Polygon Branch1 = new Polygon();
        Branch1.addPoint(650, 350);
        Branch1.addPoint(700, 420);
        Branch1.addPoint(700, 500);

        g.fillPolygon(Branch1);

        g.setColor(new Color(201, 212, 51));
        Polygon Branch2 = new Polygon();
        Branch2.addPoint(775, 500);
        Branch2.addPoint(775, 550);
        Branch2.addPoint(850, 450);

        g.fillPolygon(Branch2);

    }

    public static void drawSpikes(Graphics g) {
        // tl - 700,300 tr - 775, 600 bl 775, 300 br 775,600
        Random rand = new Random();


        for (int k = 1; k <= 20; k++) {

            int x1 = rand.nextInt(74) + 700;
            int y1 = rand.nextInt(299) + 300;
            int x2 = rand.nextInt(74) + 700;
            int y2 = rand.nextInt(299) + 300;


            g.setColor(Color.white);
           g.drawLine(x1,y1,x2,y2);
        }




    }


}









