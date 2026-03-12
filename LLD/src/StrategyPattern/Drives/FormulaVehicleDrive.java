package StrategyPattern.Drives;

public class FormulaVehicleDrive implements Drive {
    @Override
    public void drive() {
        System.out.println("Driving a Formula vehicle");
    }
}
