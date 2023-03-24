package CS5800HW2.AbstractFactory;

public class PorsheFactory extends VehicleFactory
{
    @Override
    public Build build()
    {
        return new PorsheBuild();
    }

    @Override
    public Repair repair()
    {
        return new PorsheRepair();
    }

    @Override
    public Restore restore()
    {
        return new PorsheRestore();
    }
}
