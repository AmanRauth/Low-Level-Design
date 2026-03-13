package AbstractFactoryPattern.VehicleFactory;

import AbstractFactoryPattern.Vehicle.Vehicle;

public abstract class AbstractVehicleFactory {
    public abstract Vehicle getVehicle(String vehicleType);
}
