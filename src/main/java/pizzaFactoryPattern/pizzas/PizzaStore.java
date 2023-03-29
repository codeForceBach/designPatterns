package pizzaFactoryPattern.pizzas;

import pizzaFactoryPattern.PizzaFactory;
import pizzaFactoryPattern.Pizzaitnf;

public class PizzaStore{
	//instantiate factory
	PizzaFactory factory;
	
	public PizzaStore (PizzaFactory pzFactory){
		//asign factory to type of pizza Factory this store utilize
		this.factory = pzFactory;	
	}
	
	public Pizzaitnf orderPizza(String type) {
		
		Pizzaitnf pizza;
		//specific type of pizza get instantiated in the factory class with "createPizza" method call
		pizza = factory.createPizza(type);
		 
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		
		return pizza;
	
	}

	
}
