package CS5800HW2.AbstractFactory.Car;

public abstract class CarFactory 
{

    abstract Build build();
    abstract Repair repair();
    abstract Restore restore();
}