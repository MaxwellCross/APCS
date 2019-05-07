public class ShoppingTest {

   public static void main(String[] args) {
   
   Item frisbee = new Item("CS Garfield Frisbee", 2);
   Item bBooks = new Item("CS Book", 2, 4, 5.0);
   
   //Item frisbeeBad = new Item( null,2, 4, 5);
   //Item bBooksbad = new Item("CS Book", 2, -5, 5.0);
   //Item legoBad = new Item("Lego Star Wars Toy", -10);
   
   /*
   System.out.println(frisbee);              //Should be CS Garfield Frisbbee, $2.00
   System.out.println(bBooks);               //Should be CS Book, $2.00 (4 for $5.00)
   System.out.println(frisbee.priceFor(5));  //Should be 10.0
   System.out.println(bBooks.priceFor(21));  //Should be 27.0
   */
   
   //System.out.println(frisbeeBad.priceFor(10));
   //System.out.println(frisbeeBad);
   //System.out.println(frisbee.priceFor(-1));
   
   /*
   Catalog springVol = new Catalog("Spring Catalog");
   System.out.println(springVol.size());    //Should be 0 
   springVol.add(frisbee);                  
   System.out.println(springVol.size());    //Should be 1
   springVol.add(bBooks);                   
   System.out.println(springVol.size());    //Should be 2
   //*/ 

   /*
   ItemOrder itemOrder = new ItemOrder(bBooks, 5);
   ItemOrder itemOrder1 = new ItemOrder(frisbee, 10);
   System.out.println(itemOrder.getPrice() + ", " + itemOrder1.getPrice()); 
                                           //Should be 2.0, 2.0
   //*/
   
   /*
   ShoppingCart shoppingCart = new ShoppingCart();
   shoppingCart.add(itemOrder);
   shoppingCart.add(itemOrder1);
   System.out.print(shoppingCart);        //Should be CS Book, $2.00 (4 for $5.00)
   shoppingCart.setDiscount(true);
   System.out.println(shoppingCart.getTotal());
                                         //Should be 24.3
   shoppingCart.setDiscount(false);
   System.out.println(shoppingCart.getTotal());
                                         //Should be 27.0 
   // */
   
   
   }


}
