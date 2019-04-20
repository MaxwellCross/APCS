/*
Maxwell Cross
AP CS Period 3
11/1/18
Project_3 Graphics
*/

//Imports all graphics files
import java.awt.*;

//Declares Class "CafeWall"
public class Doodle {

   //Draws a swimming pool
   public static void main(String[] args) {

   DrawingPanel panel = new DrawingPanel(500,300);
   panel.setBackground(Color.GRAY);
   Graphics g = panel.getGraphics();
         
   g.setColor(Color.CYAN);
   g.fillRect(25,30,450,240);
      for (int i = 1; i <= 5; i++) {
         g.setColor(Color.RED);
         g.fillRect(25, (30 + 40 * i), 450, 2);
         for (int a = 1; a <= 5; a++) {
            g.setColor(Color.WHITE);
            g.fillOval((15 + 75 * a), (25 + 40 * i), 20,10);
         }
      }
      
   }
}   
      
         