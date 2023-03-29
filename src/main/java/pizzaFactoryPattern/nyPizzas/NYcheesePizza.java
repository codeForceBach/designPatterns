package pizzaFactoryPattern.nyPizzas;

import pizzaFactoryPattern.Pizza;

public class NYcheesePizza extends Pizza {

	public NYcheesePizza () {
		name = "NY style Cheese Pizza";
		dough = "Thin crust Dough";
		sauce = "Marinara Sauce";
		
		toppings.add("Grated Reggiano cheese");
	}
}
