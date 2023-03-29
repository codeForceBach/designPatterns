package main.java.gumballStatePattern;

public class SoldOutState implements GumballState {

	GumballMachine gumball;
	public SoldOutState(GumballMachine gumballMachine) {
		this.gumball = gumballMachine;
	}
	@Override
	public void insertQuarter() {
		System.out.println("Currently all the gumball are sold out!");
		gumball.ejectQuarter();

	}

	@Override
	public void ejectQuarter() {
		System.out.println("you haven't insert a quarter!");

	}

	@Override
	public void turnCrank() {
		System.out.println("No gumball to dispance Take your quarter back.");
		gumball.ejectQuarter();

	}

	@Override
	public void dispense() {
		System.out.println("No gumball to dispance!");

	}
	
	public String toString() {
		return "All the gumball is gone!";
	}

}
