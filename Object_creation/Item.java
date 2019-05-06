import java.text.*;
public class Item {
   
   public String name;
   private double price;
   private int bulkQuantity;
   private double bulkPrice;
   
   public Item(String name, double price) {
      if (name == null || name.length() <= 0)
         this.name = "Undifined Name";
      else
      this.name = name; 
      if (price <= 0) 
         throw new IllegalArgumentException("price must be greater than zero");
      else
      this.price = price;
      this.bulkQuantity = 0;
      this.bulkPrice = 0 ;
   }      

   public Item(String name, double price, int bulkQuantity, double bulkPrice) {
      this(name, price);  
      if (bulkQuantity < 0) {
         throw new IllegalArgumentException("bulk quantity cannot be negative");
      } else if(bulkPrice < 0) {
         throw new IllegalArgumentException("bulk price cannot be negative");
      }
      this.bulkQuantity = bulkQuantity;
      this.bulkPrice = bulkPrice;
   }

   public double priceFor(int quantity) {
      double totalPrice = 0.0;
      if (quantity < 0) 
         throw new IllegalArgumentException("quantity must be greater than 0");
      else 
      
      if (bulkQuantity == 0 || bulkPrice == 0) {
         totalPrice = quantity * price;
      } else {
         totalPrice = ( (quantity / bulkQuantity) * bulkPrice) + 
            ( (quantity % bulkQuantity) * price) + .0; 
      }
      return totalPrice;
   }
   
   public String toString() {
      NumberFormat nf = NumberFormat.getCurrencyInstance();
      String toPrint = name + ", " + nf.format(this.price);
      if (bulkQuantity < 1 || bulkPrice < 1) { 
         
      } else { // bulk case
         toPrint += (" (" + bulkQuantity + " for " + nf.format(this.bulkPrice) + ")");
         
      }
      return toPrint;
   }
}
