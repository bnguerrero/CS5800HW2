package CS5800HW2.AbstractFactory.Car;

public class PorsheRepair extends Repair
{
    @Override
    public void repair()
    {
        System.out.println("Porshe repaired a car");
    }
}
