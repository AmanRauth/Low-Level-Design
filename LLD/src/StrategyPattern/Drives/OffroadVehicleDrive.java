package StrategyPattern.Drives;

public class OffroadVehicleDrive implements Drive {

    @Override
    public void drive() {
        System.out.println("Driving an offroad vehicle");
    }
}
