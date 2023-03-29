package main.java.SartBuzzDecorator;

public class WinterFestival extends CondimentDecorator {
	
	Beverage drink;

	public WinterFestival(Beverage beverage) {
		drink = beverage;
	}
	
	@Override
	public double cost() {
		if (getSize() == Size.VENTI) {
			return drink.cost() + 1.09;
		} else if (getSize() == Size.TALL) {
			return drink.cost() + 1.39;
		} else {
			return drink.cost() + 1.69;
		}
	}

	@Override
	public String getDescription() {
		return drink.getDescription() + " with unforgaterble pepermint candy and white chocolate flavior";
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
