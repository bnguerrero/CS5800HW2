package CS5800HW2.AbstractFactory;

public class SeaRayFactory extends VehicleFactory
{
    @Override
    public Build build()
    {
        return new SeaRayBuild();
    }

    @Override
    public Repair repair()
    {
        return new SeaRayRepair();
    }

    @Override
    public Restore restore()
    {
        return new SeaRayRestore();
    }
}
