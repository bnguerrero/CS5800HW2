package CS5800HW2.AbstractFactory;

public class MasterCraftFactory extends VehicleFactory
{
    @Override
    public Build build()
    {
        return new MasterCraftBuild();
    }

    @Override
    public Repair repair()
    {
        return new MasterCraftRepair();
    }

    @Override
    public Restore restore()
    {
        return new MasterCraftRestore();
    }
}
