package CS5800HW2.AbstractFactory.Car;

public class HondaBuild extends Build 
{
    @Override
    public void build()
    {
        System.out.println("Honda built a car");
    }
}
