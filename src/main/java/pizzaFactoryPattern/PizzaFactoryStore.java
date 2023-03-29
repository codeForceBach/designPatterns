package pizzaFactoryPattern;

/*
 * build framework for a procedure for how to make pizza
 * but give variation on how each regional pizza would be made through abstract method
 */
public abstract class PizzaFactoryStore{

	protected static String type;
	
	public PizzaFactoryStore (String type){
		PizzaFactoryStore.type = type;	
	}
	
	public Pizza orderPizza(String type) {
		
		Pizza pizza;
		
		pizza = createPizza(type);
		
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		System.out.println(" ");
		return pizza;
	
	}
		
	/*
	 * All the factory method reside in this abstract method that each sub class
	 * of pizzaFactoryStore implement their own way to create a type of pizza
	 */
	protected abstract Pizza createPizza(String type);
	
}
