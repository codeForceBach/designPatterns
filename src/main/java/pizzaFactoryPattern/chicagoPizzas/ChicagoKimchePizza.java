package pizzaFactoryPattern.chicagoPizzas;

import pizzaFactoryPattern.Pizza;

public class ChicagoKimchePizza extends Pizza {

	public ChicagoKimchePizza () {
		name = "Chicago style kimche Pizza";
		dough = "Puffed sticky brown rice Dough";
		sauce = "Permanted sweet spicy seafood Sauce";
		
		toppings.add("permanted Kimchi chunk, cheese");
	}

}
