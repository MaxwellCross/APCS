n/*
Maxwell Cross
AP CS Period 3
Project 4: Birthday
November 21st, 2018
Prints days until user's birthday
*/
import java.util.*;

public class Birthday {
   
   public static void main(String[] args) {
      Scanner console = new Scanner(System.in);
      sayIntro();
      userBirthday(console);
   }
   
   public static void sayIntro() {
      System.out.println("This program will tell you how many days");
      System.out.println("it will be until your birthday.");
   }
   
   public static int userBirthday(Scanner console) {
      
      System.out.println("Please enter today's date: ");
      System.out.println("What is the month (1-12)? ");
      int tMonth = console.nextInt();
      int tDay = 0;
      if (tMonth == 1 || tMonth == 3 || tMonth == 5 || tMonth == 7 
         || tMonth == 8 || tMonth == 10 || tMonth == 12) {
         System.out.print("What is the day (1-31)? ");
         tDay = console.nextInt();
      } else if (tMonth == 4 || tMonth == 6 || tMonth == 9 || tMonth == 11) {
         System.out.print("What is the day (1-30)? ");
         tDay = console.nextInt();
      } else {
         System.out.print("What is the day (1-28)? ");
         tDay = console.nextInt();
      }
      return tDay;
   }
   
   public static int tDay
}   
         
         