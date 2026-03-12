package StrategyPattern.Vehicles;

import StrategyPattern.Drives.CommercialVehicleDrive;

public class CommercialVehicle extends Vehicle {
    public CommercialVehicle() {
        super(new CommercialVehicleDrive());
    }
}
