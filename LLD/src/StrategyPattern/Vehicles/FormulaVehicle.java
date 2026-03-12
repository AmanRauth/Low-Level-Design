package StrategyPattern.Vehicles;

import StrategyPattern.Drives.FormulaVehicleDrive;

public class FormulaVehicle extends Vehicle{
    public FormulaVehicle(){
        super(new FormulaVehicleDrive());
    }
}
