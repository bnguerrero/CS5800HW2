package CS5800HW2.AbstractFactory;

public class AirbusRepair extends Repair
{
    @Override
    public void repair()
    {
        System.out.println("Airbus repaired an airplane");
    }
}
