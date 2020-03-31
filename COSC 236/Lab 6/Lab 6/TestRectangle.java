//Ted Smith III   Cosc 236 Section 003
//  Lab 6 Problem 2
import java.awt.*;

public class TestRectangle {
    public static void main(String[] args) {
      
        DrawingPanel ted = new DrawingPanel(150,100);
        Graphics t = ted.getGraphics();
        DrawingPanel ted1 = new DrawingPanel(100,100);
        Graphics t1 = ted1.getGraphics();
        DrawingPanel ted2 = new DrawingPanel(180,100);
        Graphics t2 = ted2.getGraphics();
     
        Rectangle r1 = new Rectangle(5, 4, 10, 17);
        Rectangle r2 = new Rectangle(10, 10, 20, 3);
        Rectangle r3 = new Rectangle(0, 1, 12, 15);
        Rectangle r4 = new Rectangle(10, 10, 20, 3);
        t1.drawRect(r1.x+60,r1.y,r1.width,r1.height);
        t1.drawRect(r3.x+30,r3.y,r3.width, r3.height);
       t1.drawRect(r1.x,r1.y,r1.width,r1.height);
       t2.drawRect(r2.x,r2.y,r2.width,r2.height);
       t2.drawRect(r2.x+50,r2.y,r2.width,r2.height);
        t1.drawRect(r3.x, r3.y, r3.width,r3.height);
        System.out.println("r1 = " + r1);
        System.out.println("r2 = " + r2);
        System.out.println("r3 = " + r3);
        
        System.out.println("r2 equals r1? " + r2.equals(r1));
        System.out.println("r2 equals r2? " + r2.equals(r2));
        System.out.println("r2 equals r3? " + r2.equals(r3));
        System.out.println("r2 equals r4? " + r2.equals(r4));

        System.out.println("r1 contains (6, 8)? = " + r1.contains(6, 8));
        System.out.println("r2 contains (6, 8)? = " + r2.contains(6, 8));
        System.out.println("r3 contains (6, 8)? = " + r3.contains(6, 8));
        System.out.println("r2 contains (30, 13)? = " + r2.contains(30, 13));
      
        r1.getIntersect(r3);
       t1.fillRect(r1.x,r1.y,r1.width,r1.height);
        System.out.println(r1);
        r2.getIntersect(r4);
        t2.fillRect(r2.x,r2.y,r2.width,r2.height);
        t2.setColor(Color.BLUE);
        t2.drawRect(r4.x,r4.y,r4.width,r4.height);
        t2.drawRect(r4.x+80,r4.y,r4.width,r4.height);
        t2.setColor(Color.BLACK);
        
          
        System.out.println("Intersection of both r1 and r3 = " + r1);
        System.out.println("Intersection of both r2 and r4 = " + r2);
    
     
        t.drawRect(r4.x,r4.y,r4.width,r4.height);
        t.drawRect(r4.x+80,r4.y,r4.width,r4.height);
        r1.getIntersect(r2);
        t.fillRect(r1.x,r1.y,r1.width,r1.height);
        t.setColor(Color.BLUE);
        
        t.drawRect(r1.x,r1.y,r1.width,r1.height);
        t.drawRect(r1.x+50,r1.y,r1.width,r1.height);
        System.out.println("Intersection of both r1 and r2 = " + r1);
        
        
    }
}
