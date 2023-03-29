package main.java.gumballStatePattern;

public class NoQuarterState implements GumballState {
	GumballMachine gumball;
	
	public NoQuarterState(GumballMachine gumballMachine) {
		this.gumball = gumballMachine;
	}
	
	
	@Override
	public void insertQuarter() {
		System.out.println("You inserted a quarter");
		gumball.setState(gumball.getHasQuarterState());

	}

	@Override
	public void ejectQuarter() {
		System.out.println("You haven't inserted a quater!");

	}

	@Override
	public void turnCrank() {
		System.out.println("Without a quarter nothing happens if you turn the crank!");

	}

	@Override
	public void dispense() {
		System.out.println("Well! no quarter, no Gumball!");

	}
	
	public String toString() {
		return "you haven't insert a quarter! \n  insert a quarter!";
	}

}
