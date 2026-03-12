package StrategyPattern.Vehicles;

import StrategyPattern.Drives.OffroadVehicleDrive;

public class OffroadVehicle extends Vehicle {
    public OffroadVehicle() {
        super(new OffroadVehicleDrive());
    }
}
