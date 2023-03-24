package CS5800HW2.AbstractFactory.Car;

public class TeslaBuild extends Build 
{
    @Override
    public void build()
    {
        System.out.println("Tesla built a car");
    }
}
