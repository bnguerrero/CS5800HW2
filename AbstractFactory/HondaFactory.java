package CS5800HW2.AbstractFactory;

public class HondaFactory extends VehicleFactory
{
    @Override
    public Build build()
    {
        return new HondaBuild();
    }

    @Override
    public Repair repair()
    {
        return new HondaRepair();
    }

    @Override
    public Restore restore()
    {
        return new HondaRestore();
    }
}
