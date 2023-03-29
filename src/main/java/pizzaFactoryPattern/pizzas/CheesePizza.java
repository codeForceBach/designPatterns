package pizzaFactoryPattern.pizzas;

import pizzaFactoryPattern.Pizzaitnf;
import pizzaFactoryPattern.ingredients.IngredientFactory;

public class CheesePizza extends Pizzaitnf {
	IngredientFactory ingredientFactory;
	
	public CheesePizza(IngredientFactory ingredientFactory) {
		this.ingredientFactory = ingredientFactory;
	}

	public void prepare() {
		System.out.println("preparing " + name);
		dough = ingredientFactory.createDough();
		sauce = ingredientFactory.createSauce();
		cheeses = ingredientFactory.createCheeses();
		veggies = ingredientFactory.createVeggies();
		seafood = ingredientFactory.createSeeFood();
		meat = ingredientFactory.createMeat();

	}

	public void bake() {
		System.out.println("bake at 359 F for 112 minute until cheese toppiing turn into golden brown!");

	}

	public void cut() {
		// TODO Auto-generated method stub

	}

	public void box() {
		// TODO Auto-generated method stub

	}

	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}

}
