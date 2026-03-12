package StrategyPattern.Vehicles;
import StrategyPattern.Drives.Drive;
public class Vehicle {
    Drive drive;
    public Vehicle(Drive drive) {
        this.drive = drive;
    }
    public void startEngine(){
        drive.drive();
    }
}
