package CS5800HW2.AbstractFactory;

public class BertramFactory extends VehicleFactory
{
    @Override
    public Build build()
    {
        return new BertramBuild();
    }

    @Override
    public Repair repair()
    {
        return new BertramRepair();
    }

    @Override
    public Restore restore()
    {
        return new BertramRestore();
    }
}
