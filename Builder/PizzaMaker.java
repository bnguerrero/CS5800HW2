package CS5800HW2.Builder;
import java.util.Scanner;
public class PizzaMaker 
{
    public static void main(String[] args) {

        String chain; 
        String size;
        String toppings; 
        int choice = 0;

        Scanner scan = new Scanner(System.in);
        
        do
        {
            System.out.println("Hello would you like to order from Pizza Hut, Little Caesars, or Dominos ? \n");
            chain = scan.nextLine();
    
            System.out.println("Welcome to " + chain );
    
            System.out.println("Please select a size: small, medium, or large\n");
            size = scan.nextLine();
                
            System.out.println("Please select toppings: \nPepperoni, Sausage, Mushrooms, Bacon," +" \nOnions, Extra Cheese, Peppers, Chicken," + "\nOlives, Spinach, Tomato and Basil, Beef\n");
            toppings = scan.nextLine();
    
            Pizza pizza = new PizzaBuilder().setChain(chain).setSize(size).setToppings(toppings).build();
    
            pizza.eat();

            System.out.println("\nWould you like to make another order?\n1. Yes\n2. No");
            choice = scan.nextInt();
        
            switch(choice)
            {
                case 1:
                    choice = 1;
                    break;

                case 2: 
                    break;
                default:
                    System.out.println("invalid input");
                    break;
            }
        }
        while(choice != 2);
        
        
        scan.close();
    }
}
