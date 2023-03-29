package main.java.stratagyPattern;

public class MuteQuack implements QuackBehavior {

	@Override
	public void quacks() {
		System.out.println("No sound comes out of my mouth!");
	}

}
