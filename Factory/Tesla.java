package CS5800HW2.Factory;

public class Tesla implements Car
{
    public void build()
    {
        System.out.println("Tesla built a car");
    }

    public void repair()
    {
        System.out.println("Tesla repaired a car");
    }

    public void restore()
    {
        System.out.println("Tesla restored a car");
    }
}
