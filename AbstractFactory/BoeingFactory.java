package CS5800HW2.AbstractFactory;

public class BoeingFactory extends VehicleFactory
{
    @Override
    public Build build()
    {
        return new BoeingBuild();
    }

    @Override
    public Repair repair()
    {
        return new BoeingRepair();
    }

    @Override
    public Restore restore()
    {
        return new BoeingRestore();
    }
}
