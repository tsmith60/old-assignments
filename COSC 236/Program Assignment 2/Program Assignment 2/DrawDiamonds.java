// This program draws several diamond figures of size 50x50.

import java.awt.*;

public class DrawDiamonds {
    public static void main(String[] args) {
        DrawingPanel panel = new DrawingPanel(250, 150);
        Graphics g = panel.getGraphics();

        drawDiamond(g, 0, 0);
        drawDiamond(g, 78, 22);
        drawDiamond(g, 19, 81);
    }
        
    // draws a diamond in 50x50 box
    public static void drawDiamond(Graphics g, int x, int y) {
        g.drawRect(x, y, 50, 50);
        g.drawLine(x, y + 25, x + 25, y);
        g.drawLine(x + 25, y, x + 50, y + 25);
        g.drawLine(x + 50, y + 25, x + 25, y + 50);
        g.drawLine(x + 25, y + 50, x, y + 25);
    }
}
