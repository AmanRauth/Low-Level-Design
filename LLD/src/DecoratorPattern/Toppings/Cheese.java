package DecoratorPattern.Toppings;

import DecoratorPattern.Pizzas.BasePizza;

public class Cheese extends ToppingDecorator{
    public BasePizza basePizza;
    public Cheese(BasePizza basePizza){
        this.basePizza = basePizza;
    }
    @Override
    public int cost() {
        return basePizza.cost() + 20;
    }
}
