package CS5800HW2.AbstractFactory;

public class EmbraerFactory extends VehicleFactory
{
    @Override
    public void build()
    {
        System.out.println("Embraer built an airplane");
    }
    
    @Override
    public void repair()
    {
        System.out.println("Embraer repaired an airplane");
    }

    @Override
    public void restore()
    {
        System.out.println("Embraer restored an airplane");
    }
}
