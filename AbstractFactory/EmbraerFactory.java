package CS5800HW2.AbstractFactory;

public class EmbraerFactory extends VehicleFactory
{
    @Override
    public Build build()
    {
        return new EmbraerBuild();
    }

    @Override
    public Repair repair()
    {
        return new EmbraerRepair();
    }

    @Override
    public Restore restore()
    {
        return new EmbraerRestore();
    }
}
