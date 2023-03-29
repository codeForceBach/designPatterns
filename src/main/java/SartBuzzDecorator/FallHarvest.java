package main.java.SartBuzzDecorator;

public class FallHarvest extends CondimentDecorator {
	
	Beverage drink;

	public FallHarvest(Beverage beverage) {
		drink = beverage;
	}
	@Override
	public double cost() {
		if (getSize() == Size.VENTI) {
			return drink.cost() + .89;
		} else if (getSize() == Size.TALL) {
			return drink.cost() + 1.19;
		} else {
			return drink.cost() + 1.39;
		}

	}

	@Override
	public String getDescription() {
		
		return drink.getDescription() + " with abundant flavore of pumpkin and spices ";
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

