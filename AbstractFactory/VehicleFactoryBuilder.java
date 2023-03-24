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
    }

    public static void createCarWithAbstractFactory(String type)
    {
        VehicleFactory vehicleFactory = FactoryCreator.createFactory(type);
        Build buildHonda = vehicleFactory.build();
        Repair repairHonda = vehicleFactory.repair();
        Restore restoreHonda = vehicleFactory.restore();
        buildHonda.build();
        repairHonda.repair();
        restoreHonda.restore();
    }
}
