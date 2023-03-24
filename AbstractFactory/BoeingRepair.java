package CS5800HW2.AbstractFactory;

public class BoeingRepair extends Repair 
{
    @Override
    public void repair()
    {
        System.out.println("Boeing repaired an airplane");
    }
}
