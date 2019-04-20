
public class myCar {
   public static void main (String[] args) {
      /*
      Car c1 = new Car();
      c1.setMileage(25);
      System.out.println(c1.getMileage());
      System.out.println(c1.currentMileage);
      
      Car c2 = new Car(20, 1, 200, 5);
      c2.currentMileage = 20;
      c2.setMileage(19);
      System.out.println(c2.getMileage());
      
      
      c2.addGas(20);
      System.out.printf("Current gas level: %d\n", c2.getGasInTank());
      
      c2.drive(15);
      System.out.printf("Current gas level: %d, odometer: %d\n", 
         c2.getGasInTank(), c2.getMileage());
      */
      
      //  param order (int tankCap, int currentMileage, int mileCap, int mpg)
      Car c3 = new Car(10, 0, 100, 5);
      
      System.out.printf("gas: %d gallons\n", c3.getGasInTank());
      //c3.drive(10);
      
      c3.addGas(10);
      System.out.printf("gas: %d gallons\n", c3.getGasInTank());
      
      c3.drive(10);
      System.out.printf("gas: %d gallons, odometer: %d\n ",
         c3.getGasInTank(), c3.getMileage());
      
   }   
}
