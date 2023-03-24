package CS5800HW2.AbstractFactory.Car;

public class PorsheFactory extends CarFactory
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
