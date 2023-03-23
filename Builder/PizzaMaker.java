package CS5800HW2.Builder;
import java.util.Scanner;
public class PizzaMaker 
{
    public static void main(String[] args) {

        String chain = "Pizza Hut";
        String size;
        String toppings; 

        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome to " + chain );

        System.out.println(" Please select a size: small, medium, or large");
        size = scan.nextLine();
            
        System.out.println("Please select toppings: \nPepperoni, Sausage, Mushrooms, Bacon" +" \nOnions, Extra Cheese, Peppers, Chicken" + "\nOlives, Spinach, Tomato and Basil, Beef");
        toppings = scan.nextLine();

        Pizza pizza = new PizzaBuilder().setChain(chain).setSize(size).setToppings(toppings).build();

        pizza.eat();
        
        scan.close();
    }
}
