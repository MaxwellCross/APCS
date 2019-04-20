/*
Maxwell Cross
AP CS Period 3
11/1/18
Project_3 Graphics
*/

//Imports all graphics files
import java.awt.*;

//Declares Class "CafeWall"
public class CafeWall {
   
   //Creates Class Constant for Mortar
   public static final int MORTAR = 2;
   
   //Draws the desired output into DrawingPanel
   public static void main(String[] args) {
  	DrawingPanel panel = new DrawingPanel(650,400);
  	panel.setBackground(Color.GRAY);
 	 
  	Graphics g = panel.getGraphics();
  	makeRow(g,0,0,4,20);
  	makeRow(g,50,70,5,30);
 	 
  	makeGrid(g,10,150,4,25,0,4);
  	makeGrid(g,250,200,3,25,10,3);
  	makeGrid(g,425,180,5,20,10,5);
  	makeGrid(g,400,20,2,35,35,2); 
   }
   
   //Draws a row of black and white squares with given size and pairs
   public static void makeRow(Graphics g, int startingX, int startingY, 
      int pairs, int size) {
 
     	for (int r = 0; r < pairs; r++) {
        	g.setColor(Color.BLACK);
        	g.fillRect(startingX + size * 2 * r,startingY, size, size);
        	g.setColor(Color.BLUE);
        	g.drawLine(startingX + size * 2 * r, startingY, startingX + 
            size * (2 * r + 1), startingY + size);
        	g.drawLine(startingX + size * 2 * r, startingY + size, startingX + 
            size * (2 * r + 1), startingY);
        	g.setColor(Color.WHITE);
        	g.fillRect(startingX + size * (2 * r + 1), startingY, size, size);
  	   }
   }
   
   //Draws a given amount of rows with parameters for 
   //position, size, offset, and amount of pairs
   public static void makeGrid(Graphics g, int startingX, int startingY, 
      int pairs, int size, int offSet, int rows) {
     	for (int r = 0; r < rows; r++) {
        	makeRow(g, startingX, startingY + (size + MORTAR) * 2 * r, pairs, size);
        	makeRow(g, startingX + offSet, startingY + (size + MORTAR) * 2 * r + 
            size + MORTAR, pairs, size);
  	   }
   }
}
