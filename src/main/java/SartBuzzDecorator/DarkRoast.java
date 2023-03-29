package main.java.SartBuzzDecorator;

public class DarkRoast implements Beverage {
	
	private Size size;
	
	public DarkRoast(Size size) {
		this.size = size;
	}
	@Override
	public String getDescription() {
	
		return "Dark Roast : most distinct favorite in richness in town";
	}

	@Override
	public double cost() {	
		if (getSize() == Size.VENTI) {
			return 2.35;
		} else if (getSize() == Size.TALL) {
			return 2.95;
		} else {
			return 3.65;
		}
	}

	@Override
	public void setSize(Size size) {
		this.size = size;
		
	}

	@Override
	public Size getSize() {	
		return size;
	}
	
	public String toString() {
		return getDescription() + " - $ " + cost();
	}

}
