// shopping cart with quantity and price 
import java.net.SocketPermission;
import java.util.*;

public class Shoppingcart{
    public static void main(String[] args) {
        Map<String,Integer> cart = new HashMap<>();
        Map<String,Double> ItemPrices = new HashMap<>();
        double TotalPrice = 0.0;
        Scanner obj = new Scanner(System.in);

        while(true){
            System.out.println("1.Display items in the cart: ");
            System.out.println("2.Add items in the cart: ");
            System.out.println("1.Remove items in the cart: ");
            System.out.println("1.Show items in the cart: ");
            System.out.println("exit");
            System.out.println("1.Enter your choice: ");
            int choice = obj.nextInt();
            switch(choice){
                case 1:
                  Displaycart(cart);
                  break;
                case 2:
                System.out.print("1.Add items in the cart: ");
                String ItemtoAdd = obj.nextLine();
                System.out.print("quantity of the item: ");
                int quantity = obj.nextInt();
                System.out.print("Enter price "+ ItemtoAdd + ": ");
                double price = obj.nextDouble();
                Addtocart(cart,ItemtoAdd,quantity);
                ItemPrices.put(ItemtoAdd, price);
                TotalPrice += price * quantity;
                System.out.println(quantity + " " + ItemtoAdd + "(s) added to the cart.");
                break;
                case 3:
                System .out.println("Enter the item to remove: ");
                String ItemtoRmv = obj.nextLine();
                if(cart.containsKey(ItemtoRmv)){
                    System.out.println("Enter item to remove: ");
                    int quantityRmv = obj.nextInt();
                    int currQuantity = cart.get(ItemtoRmv);
                    if(quantityRmv<=currQuantity){
                        cart.remove(ItemtoRmv);
                        TotalPrice -= ItemPrices.get(ItemtoRmv)*currQuantity;
                        System.out.println(currQuantity + " " + ItemtoRmv + "(s) removed from the cart.");
                    }
                    else{
                        cart.put(ItemtoRmv, currQuantity - quantityRmv);
                        TotalPrice -= ItemPrices.get(ItemtoRmv)*quantityRmv;
                        
                    }
                }

            }
        }
    }
}