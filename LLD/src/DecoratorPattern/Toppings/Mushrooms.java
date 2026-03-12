package DecoratorPattern.Toppings;

import DecoratorPattern.Pizzas.BasePizza;

public class Mushrooms extends BasePizza{
    public BasePizza basePizza;
    public Mushrooms(BasePizza basePizza){
        this.basePizza = basePizza;
    }
    @Override
    public int cost() {
        return basePizza.cost() + 30;
    }
}
