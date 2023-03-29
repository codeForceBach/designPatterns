package main.java.gumballStatePattern;

public class WinnerState implements GumballState {

	GumballMachine gumball;
	
	public WinnerState(GumballMachine gumballMachine) {
		this.gumball = gumballMachine;
	}
	@Override
	public void insertQuarter() {
		System.out.println("you already got a gumball");


	}

	@Override
	public void ejectQuarter() {
		System.out.println("you already got a gumball");

	}

	@Override
	public void turnCrank() {
		System.out.println("you already got a gumball");

	}

	@Override
	public void dispense() {
		int ballCount = gumball.getGumballCount();
		System.out.println("Surprise! you are a WINNER! you get two gumball for your querter");
		if(ballCount > 1) {
			gumball.releaseBall();
			gumball.setGumballCount(--ballCount);
			gumball.setState(gumball.getSoldState());
		} else if (ballCount == 1) {
			gumball.releaseBall();
			gumball.setGumballCount(--ballCount);
			gumball.setState(gumball.getSoldState());
		} else {
			System.out.println("sorry all Gumball is sold out, please call customer service and enquire refund or mail the gumball to you.");
			gumball.setState(gumball.getSoldOutState());
		}

	}

}
