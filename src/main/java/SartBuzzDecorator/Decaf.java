package main.java.SartBuzzDecorator;

public class Decaf implements Beverage {

	private Size size;
	
	public Decaf(Size size) {
		this.size = size;
	}
	
	@Override
	public String getDescription() {
		
		return "Decaf : rich favorite with suitting taste keep you calm.";
	}

	@Override
	public double cost() {
		if (getSize() == Size.VENTI) {
			return  2.79;
		} else if (getSize() == Size.TALL) {
			return  2.99;
		} else {
			return  3.29;
		}
	}

	public String toString() {
		return getDescription() + "$" + cost();
	}

	@Override
	public void setSize(Size size) {
		this.size = size;
		
	}

	@Override
	public Size getSize() {
		return size;
	}

}
