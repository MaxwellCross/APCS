//max
import java.util.*;
public class StringPractice_1 {
   
   public static void main(String[] args) {
      Scanner console = new Scanner(System.in);
      //convertToPigLatin(console);  
      //printStrings("abc", 5);
      //System.out.print(padString("hello", 8));
      //vertical("hey there");
      cesarCypher(console);
   }
   
   public static void convertToPigLatin(Scanner console) {
      
      System.out.print("Give me a word to convert to Pig Latin: ");
      String word = console.next();
      char firstLetter = word.charAt(0);
      int wordLen = word.length();
      word = word.substring(1, wordLen);
      String letter1 = "" + firstLetter;
      letter1 = letter1.toUpperCase();
      word +=  letter1 + "AY";
      System.out.println(word);
   }
   
   public static void printStrings(String s, int n) {
      for (int i = 1; i<= n; i++) {
         System.out.print(s);
      }
   }
   
   public static String padString(String s, int n) {
      String result = "";
      String spaces = "";
      for (int i = 0; i < n - s.length(); i++) {
         spaces += " ";
      }
      result = spaces + s;
   return result;
   }
   
   public static void vertical(String s) {
      for (int i = 0; i < s.length(); i++) {
         char c = s.charAt(i);
         System.out.println(c);
      }
   }
   public static void cesarCypher(Scanner console) {
      System.out.print("Your secret message: ");
      String inputMsg = console.nextLine();
      String inputMsgLower = inputMsgLower.toLowerCase();
      System.out.print("Your secret code: ");
      int inputCode = console.nextInt();
      int msgLength = inputMsg.length();
      int charPlace = 0;
      String outMsg = "";
      for (int i = 0; i < msgLength; i++) {
         charPlace = (char) inputMsgLower.substring(0 + i, 1 + i);
         if (charPlace <= 122 && charPlace >= 97) {   
            outMsg += inputMsgLower.charAt(97 + i);
         } else if (charPlace < 97) {
            outMsg = "Invalid character input";
         } else {
            outMsg += inputMsgLower.charAt(97 + (charPlace - 122) % 26);
         }
      }
      System.out.print("The encoded message: " + outMsg);
   } 
            
}