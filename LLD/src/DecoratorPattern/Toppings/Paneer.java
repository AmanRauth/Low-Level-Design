package DecoratorPattern.Toppings;

import DecoratorPattern.Pizzas.BasePizza;

public class Paneer extends BasePizza {
    public BasePizza basePizza;
    public Paneer(BasePizza basePizza){
        this.basePizza = basePizza;
    }
    @Override
    public int cost() {
        return basePizza.cost() + 50;
    }
}
