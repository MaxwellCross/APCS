import java.awt.*;
import java.util.*;

public class Point{ 
   int x;
   int y;
   Color rgb;
   
   public Point(int xValue, int yValue){
      x = xValue;
      y = yValue;
      rgb = Color.BLACK;
   }
   
   public void translate(int dx, int dy) {
      x += dx;
      y += dy;
   }

   public void draw(Graphics g) {
      Color temp = g.getColor();
      g.setColor(rgb);
      g.fillOval(x, y, 3, 3);
      g.drawString("(" + x + ", " + y + ")", x, y);
      g.setColor(temp);
   
   }
   
   public boolean isVertical(Point other){
      if (x == other.x) 
         return true;
      else 
         return false;
   }
      
   public void setColor(Color myColor){
      rgb = myColor;
   }
      
   public double distance(Point other) {
      int x2 = other.x;
      int y2 = other.y;
      double dist = Math.sqrt( Math.pow((x2 - x), 2) + Math.pow((y2 - y), 2));
      return dist;
   }
}
