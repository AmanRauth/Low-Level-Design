package AbstractFactoryPattern.VehicleFactory;

import AbstractFactoryPattern.Vehicle.LuxuryVehicle1;
import AbstractFactoryPattern.Vehicle.LuxuryVehicle2;
import AbstractFactoryPattern.Vehicle.Vehicle;

public class LuxuryVehicleFactory extends AbstractVehicleFactory{
    @Override
    public Vehicle getVehicle(String vehicleType){
        if(vehicleType.equalsIgnoreCase("LuxuryVehicle1")){
            return new LuxuryVehicle1();
        }
        else if(vehicleType.equalsIgnoreCase("LuxuryVehicle2")){
            return new LuxuryVehicle2();
        }
        else
            return null;
    }
}
