package CS5800HW2.AbstractFactory;

public class FactoryCreator 
{
    public static VehicleFactory createFactory(String type)
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
        else if (type.equalsIgnoreCase("airbus"))
        {
            return new AirbusFactory();
        }
        else if (type.equalsIgnoreCase("boeing"))
        {
            return new BoeingFactory();
        }
        else if (type.equalsIgnoreCase("embraer"))
        {
            return new EmbraerFactory();
        }
        else if (type.equalsIgnoreCase("searay"))
        {
            return new SeaRayFactory();
        }
        else if (type.equalsIgnoreCase("mastercraft"))
        {
            return new MasterCraftFactory();
        }
        else if (type.equalsIgnoreCase("bertram"))
        {
            return new BertramFactory();
        }
        else
        {
            System.out.println( "please specify a valid type");
            return null;
        }
    
    }

    }
