package CS5800HW2.AbstractFactory;

public class VehicleFactoryBuilder 
{
    public static void main(String[] args) 
    {
        createCarWithAbstractFactory("honda");
        System.out.println("\n");
        createCarWithAbstractFactory("porshe");
        System.out.println("\n");
        createCarWithAbstractFactory("tesla");
        System.out.println("\n");
        createCarWithAbstractFactory("airbus");
        System.out.println("\n");
        createCarWithAbstractFactory("boeing");
        System.out.println("\n");
        createCarWithAbstractFactory("embraer");
        System.out.println("\n");
        createCarWithAbstractFactory("searay");
        System.out.println("\n");
        createCarWithAbstractFactory("mastercraft");
        System.out.println("\n");
        createCarWithAbstractFactory("bertram");
    
        // attempt to make another tesla and airbus factory
        System.out.println("\n");
        createCarWithAbstractFactory("tesla");
        System.out.println("\n");
        createCarWithAbstractFactory("airbus");
    }

    public static void createCarWithAbstractFactory(String type)
    {
        VehicleFactory vehicleFactory = FactoryCreator.createFactory(type);
        vehicleFactory.build();
        vehicleFactory.repair();
        vehicleFactory.restore();
    }
}
