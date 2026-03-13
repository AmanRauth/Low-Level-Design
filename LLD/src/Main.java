import AbstractFactoryPattern.Vehicle.Vehicle;
import AbstractFactoryPattern.VehicleFactory.AbstractVehicleFactory;
import AbstractFactoryPattern.VehicleFactory.VehicleFactoryProducer;
import DecoratorPattern.Pizzas.BasePizza;
import DecoratorPattern.Pizzas.Margherita;
import DecoratorPattern.Pizzas.PeppyPaneer;
import DecoratorPattern.Pizzas.VeggieDelight;
import DecoratorPattern.Toppings.Cheese;
import DecoratorPattern.Toppings.Mushrooms;
import DecoratorPattern.Toppings.Paneer;
import ObserverPattern.Observables.Observable;
import ObserverPattern.Observables.WSObservableImpl;
import ObserverPattern.Observers.EmailObserverImpl;
import ObserverPattern.Observers.MobileObserverImpl;
import ObserverPattern.Observers.Observer;
import SimpleFactoryPattern.ShapeFactory.ShapeFactory;
import StrategyPattern.Vehicles.CommercialVehicle;
import StrategyPattern.Vehicles.FormulaVehicle;
import StrategyPattern.Vehicles.OffroadVehicle;

import java.util.Vector;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

//        STRATEGY PATTERN
//        Vehicle commercialVehicle = new CommercialVehicle();
//        Vehicle formulaVehicle = new FormulaVehicle();
//        Vehicle offroadVehicle = new OffroadVehicle();
//        commercialVehicle.startEngine();
//        formulaVehicle.startEngine();
//        offroadVehicle.startEngine();



//        OBSERVER PATTERN
//        Observable observable=new WSObservableImpl();
//        Observer emailSubscriber = new EmailObserverImpl("abc@gmail.com",observable);
//        Observer mobileSubscriber = new MobileObserverImpl("1234567890",observable);
//        observable.register(emailSubscriber);
//        observable.register(mobileSubscriber);
//        observable.setObservers(30);



//        DECORATOR PATTERN
//        BasePizza myCheesyMargeritaPizza =  new Cheese(new Margherita());
//        BasePizza myPeppyPaneerPizza = new Paneer(new PeppyPaneer());
//        BasePizza myVeggieDelightPizza = new Mushrooms(new VeggieDelight()) ;
//        System.out.println("Cost of your Cheesy Margerita Pizza is: "+myCheesyMargeritaPizza.cost());
//        System.out.println("Cost of your Peppy Paneer Pizza is: "+myPeppyPaneerPizza.cost());
//        System.out.println("Cost of your Veggie Delight Pizza is: "+myVeggieDelightPizza.cost());



//        SIMPLE FACTORY PATTERN
//        ShapeFactory circle = new ShapeFactory("CIRCLE");
//        ShapeFactory square = new ShapeFactory("SQUARE");
//        circle.getShape();
//        square.getShape();



//        ABSTRACT FACTORY PATTERN
//        VehicleFactoryProducer factoryProducer=new VehicleFactoryProducer("LuxuryVehicle");
//        AbstractVehicleFactory luxVehicleProducer=factoryProducer.getFactoryProducer();
//        Vehicle luxVehicle1=luxVehicleProducer.getVehicle("LuxuryVehicle1");
//        luxVehicle1.mileage();
//        luxVehicle1.topSpeed();
//        factoryProducer=new VehicleFactoryProducer("OrdinaryVehicle");
//        AbstractVehicleFactory ordinaryVehicleProducer=factoryProducer.getFactoryProducer();
//        Vehicle ordinaryVehicle2=ordinaryVehicleProducer.getVehicle("OrdinaryVehicle2");
//        ordinaryVehicle2.mileage();
//        ordinaryVehicle2.topSpeed();



    }
}