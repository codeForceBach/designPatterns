package pizzaFactoryPattern;

import pizzaFactoryPattern.pizzas.KimchePizza;
import pizzaFactoryPattern.pizzas.SeafoodPizza;
import pizzaFactoryPattern.pizzas.VeggiePizza;
import pizzaFactoryPattern.pizzas.cheesePizza;

public class PizzaFactory {
	
	public Pizzaitnf createPizza(String type) {
		Pizzaitnf pizza = null;
		
		/*if(type.equals("cheese")) {
			pizza = new cheesePizza();
		}*/if(type.equals("kimche")) {
			pizza = new KimchePizza();
		}else if(type.equals("seafood")) {
			pizza = new SeafoodPizza();
		}else if(type.equals("veggie")) {
			pizza = new VeggiePizza();
		}
		return pizza;
	}

}
