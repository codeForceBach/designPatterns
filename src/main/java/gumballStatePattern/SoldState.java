package main.java.gumballStatePattern;

public class SoldState implements GumballState {
	
	GumballMachine gumball;
	
	public SoldState(GumballMachine gumballMachine) {
		this.gumball = gumballMachine;
	}


	@Override
	public void insertQuarter() {
		System.out.println("for a new Gumball, insert a quarter!");

	}

	@Override
	public void ejectQuarter() {
		System.out.println("You haven't insert a quarter!");

	}

	@Override
	public void turnCrank() {
		System.out.println("the gumball is already dispensed!");

	}

	@Override
	public void dispense() {
		
		if(gumball.getGumballCount() > 0) {
			gumball.releaseBall();
			gumball.setState(gumball.getNoQuarterState());
		} else {
			System.out.println("we ran out of gumball");
			gumball.setState(gumball.getSoldOutState());
		}

	}
	
	public String toString() {
		return "you got a gumball!";
	}

}
