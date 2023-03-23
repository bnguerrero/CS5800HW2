package CS5800HW2.Factory;

public class FactoryDemo 
{
    public static void main(String[] args) 
    {
        CarFactory carFactory = new CarFactory();

        Car honda = carFactory.getInstance("honda");
        honda.build();
        honda.repair();
        honda.restore();

        Car porshe = carFactory.getInstance("porshe");
        porshe.build();
        porshe.repair();
        porshe.restore();

        Car tesla = carFactory.getInstance("tesla");
        tesla.build();
        tesla.repair();
        tesla.restore();
    }
}
