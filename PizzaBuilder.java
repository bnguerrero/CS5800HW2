package CS5800HW2;

public class PizzaBuilder implements Builder
{
    private String chain;
    private String size;
    private String toppings;
    

    public PizzaBuilder() 
    {
    
    }

    public PizzaBuilder setChain(String chain)
    {
        this.chain = chain;
        return this;
    }

    public PizzaBuilder setSize(String size)
    {
        this.size = size;
        return this;
    }

    public PizzaBuilder setToppings(String toppings)
    {
        this.toppings = toppings;
        return this;
    }
    public Pizza build()
    {
        return new Pizza(chain, size, toppings);
    }
}
