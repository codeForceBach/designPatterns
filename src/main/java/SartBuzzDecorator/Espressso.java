package main.java.SartBuzzDecorator;

public class Espressso implements Beverage {
	
	private Size size;
	
	@Override
	public String getDescription() {
		
		return "Esprsso : strong buzzing flavour that keep you energeric!";
	}

	@Override
	public double cost() {
		if (getSize() == Size.VENTI) {
			return 2.85;
		} else if (getSize() == Size.TALL) {
			return 3.35;
		} else {
			return 3.85;
		}
	}
	
	public Size getSize() {
		return size;
	}

	public void setSize(Size size) {
		this.size = size;	
	}
	
	public String toString() {
		return getDescription() + " - $ " + cost();
	}


}
