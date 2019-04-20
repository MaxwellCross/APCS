/* Earl Bergquist, Garfield High School
   INSTRUCTIONS: Reduce redundancy using parameters and less Methods
	of the Code below.
	Taken from BJP Presentation for Parameters
*/

public class RedundantStars {
    public static void main(String[] args) {
        printLineOf(13);
        printLn_0(2);
        printLineOf(7);
        printLn_0(2);
        printLineOf(35);
        printLn_0(2);
        printBox(10, 3);
        printBox(5, 4);
    }
    
    public static void printLineOf(int a) {
        for (int i = 1; i <= a; i++) {
            System.out.print("*");
        }
    }
    
    public static void printLn_0(int a) {
      for (int i = 1; i <= a; i++) {
         System.out.println();
      }
   }
    
   public static void printBox(int width, int height) {
      printLineOf(width);
      System.out.println();
		for (int i = 1; i <= height - 2; i++) {
         System.out.print("*");
			for(int j = 1; j <= width - 2; j++) {
				System.out.print(" ");
			}
         System.out.print("*");
         System.out.println();
      }
      printLineOf(width);
      System.out.println();
	}
}

