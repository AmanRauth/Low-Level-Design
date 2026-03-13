package AbstractFactoryPattern.Vehicle;

public class LuxuryVehicle2 implements Vehicle{
    @Override
    public void mileage(){
        System.out.println("Mileage of Luxury Vehicle 2 is 10 km/l");
    }
    @Override
    public void topSpeed(){
        System.out.println("Top speed of Luxury vehicle 2 is 220 km/h");
    }
}
