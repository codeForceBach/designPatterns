package pizzaFactoryPattern;

//import pizzaFactoryPattern.PizzaFactory;
import pizzaFactoryPattern.PizzaFactoryStore;
import pizzaFactoryPattern.chicagoPizzas.ChicagoPizzaStore;
import pizzaFactoryPattern.nyPizzas.NYPizzaStore;
//import pizzaFactoryPattern.pizzas.PizzaStore;

public class PizzaOrderSimulator {

	//public static void main(String[] args) {

		/*
		 * abstract class can't be initialized
		 *
		PizzaFactory pizzaFactory = new PizzaFactory();
		PizzaStore store = new PizzaStore(pizzaFactory); abstract class can't be initialized
		store.orderPizza("kimche");
		*/
		
		/*
		 * attempt to have separate style of PizzaFactory
		 * that implement generic PizzaStore
		NYPizzaFactory nyPizzaFactory = new NYPizzaFactory();
		PizzaStore nyStore = new PizzaStore(nyPizzaFactory);
		nyStore.orderPizza("cheese");
		
		ChicagoPizzaFactory chicagoPizzaFactory = new ChicagoPizzaFactory();
		PizzaStore chicagoStore = new PizzaStore(chicagoPizzaFactory);
		chicagoStore.orderPizza("cowboy");
		*/
		
		//create separate style of pizza store from abstract PizzaStore
		//to implement different style of Pizza 
		//NYPizzaFactory nyPizzaFactory = new NYPizzaFactory();
		//PizzaFactoryStore nyStore = new NYPizzaStore();
		//nyStore.orderPizza("cheese");
		
		
		//ChicagoPizzaFactory chicagoPizzaFactory = new ChicagoPizzaFactory();
		//PizzaFactoryStore chicagoStore = new ChicagoPizzaStore();
		//chicagoStore.orderPizza("kimche");

	}

}
