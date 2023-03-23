package CS5800HW2.Factory;

public class Porshe implements Car
{
    public void build()
    {
        System.out.println("Porshe built a car");
    }

    public void repair()
    {
        System.out.println("Porshe repaired a car");
    }

    public void restore()
    {
        System.out.println("Porshe restored a car");
    }
}
