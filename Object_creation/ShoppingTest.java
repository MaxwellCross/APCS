public class TestShoppingCart {

   public static void main(String[] args) {
   
   Item bubbles = new Item("Bottle of Bubbles", .99);
   Item frisbee = new Item("CS Garfield Frisbee", 2);
   Item bBooks = new Item("CS Book", 2, 4, 5.0);
   System.out.println(bubbles);
   System.out.println(frisbee);
   System.out.println(bBooks);
   System.out.println(frisbee.priceFor(5));
   System.out.println(frisbee.priceFor(1));
   System.out.println(bubbles.priceFor(5));
   System.out.println(bBooks.priceFor(5)); // should be 7.00
   Item bBooksbad = new Item("CS Book", 2, -5, 5.0);

   
   
   
   }


}
