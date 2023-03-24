package CS5800HW2.AbstractFactory;

public class AirbusFactory extends VehicleFactory
{
    @Override
    public Build build()
    {
        return new AirbusBuild();
    }

    @Override
    public Repair repair()
    {
        return new AirbusRepair();
    }

    @Override
    public Restore restore()
    {
        return new AirbusRestore();
    }
}
