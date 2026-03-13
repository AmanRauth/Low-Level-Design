package AbstractFactoryPattern.Vehicle;

public class LuxuryVehicle1 implements Vehicle{
    @Override
    public void mileage() {
        System.out.println("Luxury Vehicle 1 mileage: 8 km/l");
    }
    @Override
    public void topSpeed() {
        System.out.println("Luxury Vehicle 1 top speed: 250 km/h");
    }
}
