package pizzaFactoryPattern;

import pizzaFactoryPattern.ingredients.Cheeses;
import pizzaFactoryPattern.ingredients.Dough;
import pizzaFactoryPattern.ingredients.Meat;
import pizzaFactoryPattern.ingredients.Sauce;
import pizzaFactoryPattern.ingredients.SeeFood;
import pizzaFactoryPattern.ingredients.Veggies;

public abstract class Pizzaitnf {
	
	protected String name;
	protected Dough dough;
	protected Sauce sauce;
	/*
	 * with all the ingredient created by ingredient Factory,
	 * there is no need for toppings. Instead initialize all the ingredient directly
	protected ArrayList<String> toppings = new ArrayList<String> ();
	*/
	protected Veggies veggies[];
	protected Cheeses cheeses[];
	protected SeeFood seafood[];
	protected Meat meat[];
	
	/*
	 * As the interface IngredientFactory got created and other concreate subclass for each regional factory,
	 * now this method turn into abstract and able to collect ingredient needed for the pizza from the regional ingredient Factory.
	 * 
	public void prepare() {
		/*
		System.out.println("Preparing " + name);
		System.out.println("knee the dough and turning in the air for perfect round ..." );
		System.out.println("Adding yammy sauce....");
		System.out.println("Add toppings : " );
		for (int i = 0; i <toppings.size(); i++) {
			System.out.println(" " + toppings.get(i));
		}
		
	};*/
	public abstract void prepare();
	
	
	public void bake() {
		System.out.println("Bakes in the traditional clay oven over charchol for 25 minute!");
	};
	
	public void cut() {
		System.out.println("cut the pizza with sharp edged roller knife!");
	};
	public void box() {
		System.out.println("place in thermostatic box and bag.");
		
	};
	
	public String getName() {
		return name;
	};
	
	
}
