package AbstractFactoryPattern.VehicleFactory;

import AbstractFactoryPattern.Vehicle.OrdinaryVehicle1;
import AbstractFactoryPattern.Vehicle.OrdinaryVehicle2;
import AbstractFactoryPattern.Vehicle.Vehicle;

public class OrdinaryVehicleFactory extends AbstractVehicleFactory{
    @Override
    public Vehicle getVehicle(String vehicleType){
        if(vehicleType.equalsIgnoreCase("OrdinaryVehicle1"))
            return new OrdinaryVehicle1();
        else if(vehicleType.equalsIgnoreCase("OrdinaryVehicle2"))
                return new OrdinaryVehicle2();
        else
            return null;
    }
}
