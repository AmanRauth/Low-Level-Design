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
import StrategyPattern.Vehicles.CommercialVehicle;
import StrategyPattern.Vehicles.FormulaVehicle;
import StrategyPattern.Vehicles.OffroadVehicle;
import StrategyPattern.Vehicles.Vehicle;

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
    }
}