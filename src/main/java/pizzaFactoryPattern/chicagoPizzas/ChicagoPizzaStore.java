package pizzaFactoryPattern.chicagoPizzas;

import pizzaFactoryPattern.Pizza;
import pizzaFactoryPattern.PizzaFactoryStore;

public class ChicagoPizzaStore extends PizzaFactoryStore {
	
	public ChicagoPizzaStore() {
		super(type);
		
	}

	@Override
	protected Pizza createPizza(String type) {
		Pizza pizza = null;
		
		if(type.equals("cheese")) {
			pizza = new ChicagoCheesePizza();
		}else if(type.equals("kimche")) {
			pizza = new ChicagoKimchePizza();
		}else if(type.equals("seafood")) {
			pizza = new ChicagoSeafoodPizza();
		}else if(type.equals("Pepperoni")) {
			pizza = new chicagoPepperoniPizza();
		} else {
			System.out.println("Soory we don't have " + type + " pizza in our menu. Try something else." );
		}
		
		return pizza;
	}

}
