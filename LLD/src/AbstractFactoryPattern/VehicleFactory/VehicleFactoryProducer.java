package AbstractFactoryPattern.VehicleFactory;

public class VehicleFactoryProducer {
    public AbstractVehicleFactory factoryProducer;
    public VehicleFactoryProducer(String vehicleType){
        if(vehicleType.equalsIgnoreCase("LuxuryVehicle"))
            this.factoryProducer=new LuxuryVehicleFactory();
        else if(vehicleType.equalsIgnoreCase("OrdinaryVehicle"))
            this.factoryProducer=new OrdinaryVehicleFactory();
    }
    public AbstractVehicleFactory getFactoryProducer(){
        return this.factoryProducer;
    }
}
