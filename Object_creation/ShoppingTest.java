public class ShoppingTest {

   public static void main(String[] args) {
   
   Item frisbee = new Item("CS Garfield Frisbee", 2);
   Item bBooks = new Item("CS Book", 2, 4, 5.0);
   
   //Item frisbeeBad = new Item( null,2, 4, 5);
   //Item bBooksbad = new Item("CS Book", 2, -5, 5.0);
   //Item legoBad = new Item("Lego Star Wars Toy", -10);
   
   // /*
   System.out.println(frisbee);
   System.out.println(bBooks);
   System.out.println(frisbee.priceFor(5));
   System.out.println(bBooks.priceFor(21));
   // */
   
   //System.out.println(frisbeeBad.priceFor(10));
   //System.out.println(frisbeeBad);
   //System.out.println(frisbee.priceFor(-1));
   
   // /*
   Catalog springVol = new Catalog("Spring Catalog");
   System.out.println(springVol.size());
   springVol.add(frisbee);
   System.out.println(springVol.size());
   springVol.add(bBooks);
   System.out.println(springVol.size());
   // */ 


   ItemOrder itemOrder = new ItemOrder(bBooks, 5);
   ItemOrder itemOrder1 = new ItemOrder(frisbee, 10);
   
   
   //Checking ItemoOrder Class Methods
   /*
   System.out.println(itemOrder.getPrice());
   System.out.println(itemOrder.getItem());
   */

   //Checking ShoppingCart Class Construction
   /*
   ShoppingCart shoppingCart = new ShoppingCart();
   */
   //Checking ShoppingCart Class Methods
   
   /*
   shoppingCart.add(itemOrder);
   shoppingCart.add(itemOrder1);
   shoppingCart.add(itemOrder2);
   System.out.print(shoppingCart);
   shoppingCart.setDiscount(true);
   System.out.println(shoppingCart.getTotal());
   shoppingCart.setD
   */
    
    
    
   
   }


}
