package CS5800HW2;


public class Pizza implements PizzaInterface
{
    private String chain;
    private String size;
    private String toppings;


    public Pizza(String chain, String size, String toppings)
    {
        this.chain = chain;
        this.size = size;
        this.toppings = toppings;
    }

    public String getChain()
    {
        return chain;
    }

    public String getSize()
    {
        return size;
    }

    public String getToppings()
    {
        return toppings;
    }

    public void eat()
        {
            System.out.println("Pizza chain: " + chain + " Pizza size " + size + " toppings: " + toppings);
        }
}