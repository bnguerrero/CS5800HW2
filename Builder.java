package CS5800HW2;

interface Builder 
{
    public PizzaBuilder setChain(String chain);
    public PizzaBuilder setSize(String size);
    public PizzaBuilder setToppings(String toppings);
    public Pizza build();
}
