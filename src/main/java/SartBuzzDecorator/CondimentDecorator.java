package main.java.SartBuzzDecorator;

/*
 * All the class implement this abstract decorator would initialize beverage as an instance variable.
 * so that add it's own functionality to the type of a beverage passed by instance variable.
 */

public abstract class CondimentDecorator implements Beverage{
	
	public abstract String getDescription();

}
