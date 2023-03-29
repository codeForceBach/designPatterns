package main.java.testSimulators;

import main.java.SartBuzzDecorator.Beverage;
import main.java.SartBuzzDecorator.Beverage.Size;
import main.java.SartBuzzDecorator.DarkRoast;
import main.java.SartBuzzDecorator.Decaf;
import main.java.SartBuzzDecorator.Espressso;
import main.java.SartBuzzDecorator.FallHarvest;
import main.java.SartBuzzDecorator.HouseBlend;
import main.java.SartBuzzDecorator.Ice;
import main.java.SartBuzzDecorator.Mocha;
import main.java.SartBuzzDecorator.WhipCream;
import main.java.SartBuzzDecorator.WinterFestival;

public class StarBuzzCoffeeOrderTest {
	
	public static void main (String [] args) {
				
		Beverage espresso = new Espressso();
		espresso.setSize(Size.GRANDE);
		System.out.println(espresso.toString());
		
		Beverage darkRoast = new DarkRoast(Size.TALL);
		darkRoast = new Mocha(darkRoast);
		darkRoast = new FallHarvest(darkRoast);
		System.out.println(darkRoast.toString());
		
		Beverage decaf = new Decaf(Size.VENTI);
		decaf = new WhipCream(decaf);
		decaf = new Ice(decaf);
		System.out.println(decaf.toString());
		
		Beverage houseBlend = new HouseBlend(Size.GRANDE);
		houseBlend = new Ice(houseBlend);
		houseBlend = new WinterFestival(houseBlend);
		System.out.println(houseBlend.toString());
	}

}
