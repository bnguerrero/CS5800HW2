package CS5800HW2.AbstractFactory;

public class HondaRepair extends Repair
{
    @Override
    public void repair()
    {
        System.out.println("Honda repaired a car");
    }
}
