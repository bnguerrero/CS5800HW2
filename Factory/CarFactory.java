package CS5800HW2.Factory;

public class CarFactory 
{
    private static Car car = null;
    public Car getInstance(String carBrand)
    {
        if(carBrand.equals("honda"))
        {
            car = new Honda();
        }
        else if (carBrand.equals("porshe"))
        {
            car = new Porshe();
        }
        else if (carBrand.equals("tesla"))
        {
            car = new Tesla();
        }
        return car;
    }
}
