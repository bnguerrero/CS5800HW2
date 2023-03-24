package CS5800HW2.AbstractFactory.Car;

public class FactoryCreator 
{
    public static CarFactory createFactory(String type)
    {
        if(type.equalsIgnoreCase("tesla"))
        {
            return new TeslaFactory();
        }
        else if (type.equalsIgnoreCase("honda"))
        {
            return new HondaFactory();
        }
        else if (type.equalsIgnoreCase("porshe"))
        {
            return new PorsheFactory();
        }
        else
        {
            System.out.println( "please specify a valid type");
            return null;
        }
    
    }

    }
