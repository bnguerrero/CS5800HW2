package CS5800HW2.AbstractFactory.Car;

public class TeslaFactory extends CarFactory
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
