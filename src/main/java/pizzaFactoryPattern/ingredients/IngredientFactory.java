package pizzaFactoryPattern.ingredients;

public interface IngredientFactory {
	
	public Dough createDough();
	public Sauce createSauce();
	public Cheeses[] createCheeses();
	public Veggies[] createVeggies();
	public SeeFood[] createSeeFood();
	public Meat[] createMeat();
	
}
