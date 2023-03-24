package CS5800HW2.AbstractFactory;

public class HondaRestore extends Restore
{
    @Override
    public void restore()
    {
        System.out.println("Honda restored a car");
    }
}
