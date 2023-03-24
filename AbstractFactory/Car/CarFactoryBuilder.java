package CS5800HW2.AbstractFactory.Car;

public class CarFactoryBuilder 
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
        CarFactory carFactory = FactoryCreator.createFactory(type);
        Build buildHonda = carFactory.build();
        Repair repairHonda = carFactory.repair();
        Restore restoreHonda = carFactory.restore();
        buildHonda.build();
        repairHonda.repair();
        restoreHonda.restore();
    }
}
