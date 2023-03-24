package CS5800HW2.AbstractFactory;

public class PorsheFactory extends VehicleFactory
{
    @Override
    public void build()
    {
        System.out.println("Porshe built a car");
    }
    
    @Override
    public void repair()
    {
        System.out.println("Porshe repaired a car");
    }

    @Override
    public void restore()
    {
        System.out.println("Porshe restored a car");
    }
}
