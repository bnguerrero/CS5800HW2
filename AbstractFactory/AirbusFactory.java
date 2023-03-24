package CS5800HW2.AbstractFactory;

public class AirbusFactory extends VehicleFactory
{
    @Override
    public void build()
    {
        System.out.println("Airbus built an airplane");
    }
    
    @Override
    public void repair()
    {
        System.out.println("Airbus repaired an airplane");
    }

    @Override
    public void restore()
    {
        System.out.println("Airbus restored an airplane");
    }
}
