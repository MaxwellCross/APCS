/*
Maxwell Cross
AP CS Period 3
Project 6: Baby Names
Jnauary 14th, 2019
Displays relative frequency of baby names over 20th Century
*/


import java.awt.*;
import java.util.*;
import java.io.*;

public class BabyNames {
   
   public static final int DEFAULTYEAR = 1900;
   public static final int DEFAULTWIDTH = 60;
   
   public static void main(String[] args) throws FileNotFoundException {
         
      Scanner console = new Scanner(System.in);
      printIntro();
      String name = takeInput(console);
      String names = findLine(name, "names.txt");
      String meanings = findLine(name, "meanings.txt");
      DrawingPanel panel = new DrawingPanel(720,560);
      Graphics g = panel.getGraphics();
      drawGraph(g, names, meanings, names);
   }
   
   //Scans a passed file to return the line of given name
   public static String findLine(String name, String fileN) 
         throws FileNotFoundException {
      Scanner input = new Scanner(new File(fileN));
      String line = "";
   	boolean nameFound = false; 
      while (!nameFound && input.hasNextLine()) {
         String thisLine = input.nextLine();
         Scanner lineScan = new Scanner(thisLine);
         String name1 = lineScan.next();
         if (name1.equalsIgnoreCase(name)) {
            nameFound = true; 
            line = thisLine;
         }
      }

      if (!nameFound) {
         System.out.println("\"" + name + "\"" + " not found.");       } 
      else {       
         System.out.println(line);
         
      }
      return line;
   }
   
   
   //Prints the intro
   public static void printIntro() {
      System.out.println("This program displays the popularity of a nanae");
      System.out.println("from statistics recorded since the year 1900.");
      System.out.println();
      }
   
   //Accepts a name through user input
   public static String takeInput(Scanner console) {
      System.out.print("Type a name: ");
      String name = console.next();
      return name;
   }
   
   
   //Displays bars ranking name popularity by decades (1900 - 2000)
   public static void drawGraph(Graphics g,  String names, String meanings, String line) {
      int width = 720;
      int height = 560;
      g.setColor(Color.YELLOW);
      g.fillRect(0, 0, 720, 30);
      g.fillRect(0, 530, 720, 560);
      g.setColor(Color.BLACK);
      g.drawString(meanings, 0, 16);
      int year = DEFAULTYEAR;
      int temp = 0;
      String yearS = "";
      for (int i = 0; i < 11; i++) {
         temp =  year + (i * 10);
         yearS = "" + temp;
         g.drawString(yearS, (DEFAULTWIDTH * i), 546);
      }
      g.setColor(Color.RED);
      String blank = "";
      Scanner sepYear = new Scanner(line);
      blank = sepYear.next();
      int i = 0;
      while (sepYear.hasNext() == true) {
         g.setColor(Color.RED);
         int blank2 = sepYear.nextInt();
         int h = (int) (30 + (blank2 / 2));
         g.fillRect((DEFAULTWIDTH * i), h, 30, 530 - h);
         g.setColor(Color.BLACK);
         g.drawString(("" + blank2), (DEFAULTWIDTH* i), h);
         i++;
      }
   }
}