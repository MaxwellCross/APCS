import java.util.*;
import java.awt.*;

public class PrintPowersOfN {
   
   public static void main(String[] args) {
      Scanner console = new Scanner(System.in);
      /*
      printPowersOfN(4,3);
      printPowersOfN(5,6);
      printPowersOfN(-2,8);
      quadratic(1, -7, 12);
      quadratic(1, 3, 2);
      inputBirthday(console);
      */
      DrawingPanel panel = new DrawingPanel(200,200);
      Graphics g = panel.getGraphics();
      placeCircles(g, console);
   }
   
   public static void printPowersOfN(int n, int x) { 
      
      for (int i = 0; i <= x; i++) {
         double a = Math.pow((double) n,(double) i);   
         System.out.print((int) a + " ");
      }
   System.out.println();
   }

   public static void quadratic(int a, int b, int c) {
         double  root = Math.sqrt(Math.pow((double)b,2) 
               - 4 * ((double)a * (double)c)); 
         double root_1 = (-1 * (double)b + root ) 
                  / (2 * (double)a);
         double root_2 = (-1 * (double)b - root ) 
                  / (2 * (double)a);
         System.out.println("First root = " + root_1);
         System.out.println("Second root = " + root_2);
      }
   public static void inputBirthday(Scanner console) {
      
      System.out.print("On what day of the month were you born? ");
      int day = console.nextInt();
      System.out.print("What is the name of the month in which you were born? ");
      String month = console.next();
      System.out.print("During what year were you born? ");
      int year = console.nextInt();
      System.out.print("You were born on " + month + " " + 
         day + ", " + year + ". You're mighty old!");
   }

   public static void placeCircles(Graphics g, Scanner console) {
      System.out.print("How many circles do you want? ");
      int circs = console.nextInt();
      for (int i = 0; i < circs; i++) {
         System.out.print("what radius circle do you want? ");
         int radius = console.nextInt();
         System.out.print("Circle's x coordinate: ");
         int circx = console.nextInt();
         System.out.print("Circle's y coordinate: ");
         int circy = console.nextInt();
         g.drawOval(circx, circy, radius, radius);
      }
   }
}
