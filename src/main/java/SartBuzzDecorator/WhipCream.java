package main.java.SartBuzzDecorator;

public class WhipCream extends CondimentDecorator {
	
	Beverage drink;

	public WhipCream(Beverage beverage) {
		drink = beverage;
	}
	@Override
	public double cost() {
		if (getSize() == Size.VENTI) {
			return drink.cost() + .79;
		} else if (getSize() == Size.TALL) {
			return drink.cost() + 1.29;
		} else {
			return drink.cost() + 1.59;
		}
	}

	@Override
	public String getDescription() {
	
		return drink.getDescription() + " with cream on top.";
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
