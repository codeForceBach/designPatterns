package pizzaFactoryPattern.nyPizzas;

import pizzaFactoryPattern.ingredients.Cheeses;
import pizzaFactoryPattern.ingredients.Dough;
import pizzaFactoryPattern.ingredients.IngredientFactory;
import pizzaFactoryPattern.ingredients.Meat;
import pizzaFactoryPattern.ingredients.Sauce;
import pizzaFactoryPattern.ingredients.SeeFood;
import pizzaFactoryPattern.ingredients.Veggies;

public class NyIngredientFactory implements IngredientFactory {

	@Override
	public Dough createDough() {
		// TODO Auto-generated method stub
		return new ThinCrustDough();
	}

	@Override
	public Sauce createSauce() {
		// TODO Auto-generated method stub
		return new MarinaraSauce();
	}

	@Override
	public Cheeses[] createCheeses() {
		// TODO Auto-generated method stub
		Cheeses cheeses[] = { new ReggianoCheese(), new MozzarrellaCheese()};
		return cheeses;
	}

	@Override
	public Veggies[] createVeggies() {
		// TODO Auto-generated method stub
		Veggies veggies[] = {new Mushroom(), new Spinach(), new KalimariOlive(), new Pepperochini(), new Pineapple()};
		return veggies;
	}

	@Override
	public SeeFood[] createSeeFood() {
		Seafod seafood[] = {new Clamps(), new Anchovy(), new Sardine(), new Mussel()};
		return seafood;
	}

	@Override
	public Meat[] createMeat() {
		Meat meats[] = {new Peperoni(), new Salame(), new Sausage(), new GroundBeef()};
		return meats;
	}

}
