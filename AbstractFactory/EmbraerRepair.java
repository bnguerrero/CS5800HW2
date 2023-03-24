package CS5800HW2.AbstractFactory;

public class EmbraerRepair extends Repair 
{
    @Override
    public void repair()
    {
        System.out.println("Embraer repaired an airplane");
    }
}
