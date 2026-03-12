package StrategyPattern.Drives;

public class CommercialVehicleDrive implements Drive {

    @Override
    public void drive() {
        System.out.println("Driving a commercial vehicle");
    }
}
