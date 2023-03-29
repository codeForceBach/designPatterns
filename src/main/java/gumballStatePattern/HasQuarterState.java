package main.java.gumballStatePattern;

import java.util.Random;

public class HasQuarterState implements GumballState {
	Random randomWinner = new Random(System.currentTimeMillis());
	GumballMachine gumball;
	
	
	public HasQuarterState(GumballMachine gumballMachine) {
		this.gumball = gumballMachine;
	}
	
	@Override
	public void insertQuarter() {
		System.out.println("You already insert a quarter. Turn the Crank!");

	}

	@Override
	public void ejectQuarter() {
		System.out.println("Are you really want Quarter returned!");
		gumball.setState(gumball.getNoQuarterState());

	}

	@Override
	public void turnCrank() {
		System.out.println("you turned");
		int winner = randomWinner.nextInt(10);
		if(winner == 0 && gumball.getGumballCount() > 1) {
			gumball.setState(gumball.getWinnerState());
		} else {
			gumball.setState(gumball.getSoldState());
		}

	}

	@Override
	public void dispense() {
		System.out.println("NO Gumball  dispensed yet!");

	}
	
	public String toString() {
		return "turn the crank to get your favorite gumball!";
	}

}
