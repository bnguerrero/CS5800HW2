package CS5800HW2.AbstractFactory;

public abstract class VehicleFactory 
{
    abstract Build build();
    abstract Repair repair();
    abstract Restore restore();
}