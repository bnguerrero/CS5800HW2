package CS5800HW2.AbstractFactory;

public class TeslaFactory extends VehicleFactory
{
    @Override
    public Build build()
    {
        return new TeslaBuild();
    }

    @Override
    public Repair repair()
    {
        return new TeslaRepair();
    }

    @Override
    public Restore restore()
    {
        return new TeslaRestore();
    }
}
