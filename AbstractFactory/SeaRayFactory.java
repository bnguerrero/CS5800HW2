package CS5800HW2.AbstractFactory;

public class SeaRayFactory extends VehicleFactory
{
    @Override
    public void build()
    {
        System.out.println("SeaRay built a boat");
    }
    
    @Override
    public void repair()
    {
        System.out.println("SeaRay repaired a boat");
    }

    @Override
    public void restore()
    {
        System.out.println("SeaRay restored a boat");
    }
}
