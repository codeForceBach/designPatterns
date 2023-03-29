package main.java.SartBuzzDecorator;

public class HouseBlend implements Beverage {

	private Size size;
	
	public HouseBlend(Size size) {
		this.size = size;
	}
	
	@Override
	public String getDescription() {
	
		return "House Blend : In house rosted mild and creamy aroma.";
	}

	@Override
	public double cost() {
	
		if (getSize() == Size.VENTI) {
			return 2.99;
		} else if (getSize() == Size.TALL) {
			return 3.69;
		} else {
			return 4.29;
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
		return getDescription() + "$" + cost();
	}

}
