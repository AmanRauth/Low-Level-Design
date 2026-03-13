package AbstractFactoryPattern.Vehicle;

public class OrdinaryVehicle1 implements Vehicle{
    @Override
    public void mileage() {
        System.out.println("Ordinary Vehicle 1 mileage: 20 km/l");
    }
    @Override
    public void topSpeed() {
        System.out.println("Ordinary Vehicle 1 top speed: 150 km/h");
    }
}
