package main.java.SartBuzzDecorator;

public class Ice extends CondimentDecorator {

	private Beverage drink;
	
	public Ice (Beverage beverage) {
		drink = beverage;
	}
	@Override
	public String getDescription() {
		
		return drink.getDescription() + " whateven you got icd will keep it cool for a day.";
	}

	@Override
	public double cost() {
		
		if (getSize() == Size.VENTI) {
			return drink.cost() + 0.30;
		} else if (getSize() == Size.TALL) {
			return drink.cost() + 0.50;
		} else {
			return drink.cost() + 0.65;
		}
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
