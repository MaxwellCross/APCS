import java.awt.*;

public class Car {
   int fuelEfficiency;
   int mileCap;
   int tankLimit;
   int mileage;
   

   public void setFuelEfficiency(int newFE) {
   fuelEfficiency = newFE;
   }
   
   public void setMileage(int newMlg) {
      this.mileage = newMlg;
   }
   
     public void getMileage() {
       return this.mileage;
   }
   public void setTankCap(int newTankLimit) {
      this.tankLimit = newTankLimit;
   }
}


