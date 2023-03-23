package CS5800HW2.Factory;

public class Honda implements Car
{
    public void build()
    {
        System.out.println("Honda built a car");
    }

    public void repair()
    {
        System.out.println("Honda repaired a car");
    }

    public void restore()
    {
        System.out.println("Honda restored a car");
    }
}
