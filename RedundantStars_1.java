public class RedundantStars_1 {
    public static void main(String[] args) {
        printLineOf13();
		  System.out.println();
        printLineOf7();
		  System.out.println();
        printLineOf35();
		  System.out.println();
        printBox10x3();
		  System.out.println();
        printBox5x4();
    }
    
    public static void printLineOf13() {
        for (int i = 1; i <= 13; i++) {
            System.out.print("*");
        }
        System.out.println();
    }
    
    public static void printLineOf7() {
        for (int i = 1; i <= 7; i++) {
            System.out.print("*");
        }
        System.out.println();
    }
    
    public static void printLineOf35() {
        for (int i = 1; i <= 35; i++) {
            System.out.print("*");
        }
        System.out.println();
    }

	public static void printBox10x3() {
		for(int j = 1; j <= 10; j++) {
			System.out.print("*");
		}
		System.out.println();
		
		for (int i = 1; i <= 1; i++) {
			System.out.print("*");
			for(int j = 1; j <= 8; j++) {
				System.out.print(" ");
			}
			System.out.println("*");
		}
		
		for(int j = 1; j <= 10; j++) {
			System.out.print("*");
		}
		System.out.println();
	}
	
	public static void printBox5x4() {
		for(int j = 1; j <= 5; j++) {
			System.out.print("*");
		}
		System.out.println();
		
		for (int i = 1; i <= 2; i++) {
			System.out.print("*");
			for(int j = 1; j <= 3; j++) {
				System.out.print(" ");
			}
			System.out.println("*");
		}
		
		for(int j = 1; j <= 5; j++) {
			System.out.print("*");
		}
		System.out.println();
	}
}