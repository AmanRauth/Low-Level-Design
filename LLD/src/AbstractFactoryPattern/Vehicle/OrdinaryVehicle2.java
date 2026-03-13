package AbstractFactoryPattern.Vehicle;

public class OrdinaryVehicle2 implements Vehicle{
    @Override
    public void mileage(){
        System.out.println("Mileage of Ordinary Vehicle 2 is 25 km/l");
    }
    @Override
    public void topSpeed(){
        System.out.println("Top speed of Ordinary Vehicle 2 is 140 km/h");
    }
}
