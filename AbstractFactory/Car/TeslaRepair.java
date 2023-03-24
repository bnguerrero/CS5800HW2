package CS5800HW2.AbstractFactory.Car;

public class TeslaRepair extends Repair
{
    @Override
    public void repair()
    {
        System.out.println("Tesla repaired a car");
    }
}
