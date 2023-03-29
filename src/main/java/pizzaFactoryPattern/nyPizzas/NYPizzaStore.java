package pizzaFactoryPattern.nyPizzas;

import pizzaFactoryPattern.Pizza;
import pizzaFactoryPattern.PizzaFactoryStore;

public class NYPizzaStore extends PizzaFactoryStore {

	public NYPizzaStore() {
		super(type);
		
	}

	@Override
	protected Pizza createPizza(String type) {
		Pizza pizza = null;
		
		if(type.equals("cheese")) {
			pizza = new NYcheesePizza();
		}else if(type.equals("kimche")) {
			pizza = new NYKimchePizza();
		}else if(type.equals("seafood")) {
			pizza = new NYSeafoodPizza();
		}else if(type.equals("veggie")) {
			pizza = new NYVeggiePizza();
		}else if(type.equals("pepperoni")) {
			pizza = new NYPepperoniPizza();
		}else {
			System.out.println("Soory we don't have " + type + " pizza in our menu. Try something else." );
		}
		return pizza;
	}

}
