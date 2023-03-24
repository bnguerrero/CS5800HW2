package CS5800HW2.AbstractFactory;

public class BoeingRestore extends Restore
{
    @Override
    public void restore()
    {
        System.out.println("Boeing restored an airplane");
    }
}
