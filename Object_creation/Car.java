import java.awt.*;

public class Car {
   int fuelEfficiency;
   int mileLimit;
   int tankLimit;
   int currentMileage;
   int currentFuelLevel;
   
   public Car() {
      this(0, 0, 0, 0);
   }

   public Car(int tankCap) {
      this(tankCap, 0, 0, 0);
   }

   public Car(int tankCap, int currentMileage) {
      this(tankCap, currentMileage, 0, 0);
   }
   
   public Car(int tankCap, int currentMileage, int mileCap) {
      this(tankCap, currentMileage, mileCap, 0);
   }

   public Car(int tankCap, int currentMileage, int mileCap, int mpg) {
      if (tankCap < 0) {
         throw new IllegalArgumentException("tank capacity must be greater than or equal to zero");
      } else {
        this.tankLimit = tankCap;
      }
      
      if (currentMileage < 0) {
         throw new IllegalArgumentException("current mileage must be greater than or equal to zero");
      } else {
         this.currentMileage = currentMileage;
      }
      
      this.fuelEfficiency = mpg;
      this.mileLimit = mileCap;
      this.currentMileage = currentMileage;
      this.currentFuelLevel = 0;
   }

   public void setFuelEfficiency(int newFE) {
      fuelEfficiency = newFE;
   }
   
   public void setMileage(int newMlg) {
      this.currentMileage = newMlg;
   }
   
   public int getMileage() {
      return this.currentMileage;
   }
   
   public int getGasInTank() {
      return this.currentFuelLevel;
   }
   
   public void setTankCap(int newTankLimit) {
      this.tankLimit = newTankLimit;
   }
   
   public void addGas(int gallons){
      if (gallons + this.currentFuelLevel > this.tankLimit) {
         throw new IllegalArgumentException("Can't over fill fuel tank");
      } else {
         this.currentFuelLevel += gallons;
      }
   }
   
   public void drive(int dist) {
      int gasUsage = dist / this.fuelEfficiency;
      if (this.currentFuelLevel - gasUsage < 0) {
         throw new IllegalStateException("car can't drive past current fuel level equaling zero");
      } else {
         this.addGas(-gasUsage);
      }
      
      //Mileage limit
      if (this.currentMileage + dist > this.mileLimit) {
         throw new IllegalStateException("car can't drive past mile limit");
      } else {
         this.currentMileage += dist;      
      }
   }
}

