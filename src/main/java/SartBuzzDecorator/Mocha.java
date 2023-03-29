package main.java.SartBuzzDecorator;

public class Mocha extends CondimentDecorator {
	
	Beverage drink;
	
	public Mocha(Beverage beverage) {
		drink = beverage;
	}
	
	@Override
	public double cost() {
		if (getSize() == Size.VENTI) {
			return drink.cost() + 0.79;
		} else if (getSize() == Size.TALL) {
			return drink.cost() + 0.99;
		} else {
			return drink.cost() + 1.29;
		}
		
	}

	@Override
	public String getDescription() {
		return drink.getDescription() + " with sweet Mocha";
	}
	
	@Override
	public void setSize(Size size) {
		drink.setSize(size);
	}
	
	@Override
	public Size getSize() {
		return drink.getSize();
	}
	
	public String toString() {
		return getDescription() + " - $ " + cost();
	}

}
