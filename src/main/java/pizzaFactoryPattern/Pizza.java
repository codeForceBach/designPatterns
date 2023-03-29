package pizzaFactoryPattern;

import java.util.ArrayList;

import pizzaFactoryPattern.ingredients.Cheeses;
import pizzaFactoryPattern.ingredients.SeeFood;
import pizzaFactoryPattern.ingredients.Veggies;

public abstract class Pizza {
	
	protected String name;
	protected String dough;
	protected String sauce;

	public void prepare() {
		System.out.println("Preparing " + name);
		System.out.println("knee the dough and turning in the air for perfect round ..." );
		System.out.println("Adding yammy sauce....");
		System.out.println("Add toppings : " );
		for (int i = 0; i <toppings.size(); i++) {
			System.out.println(" " + toppings.get(i));
		}
		
	};

	
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
	}

}
