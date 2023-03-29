package main.java.gumballStatePattern;

public class GumballMachine {
	/*
	final static int SOLD_OUT = 0;
	final static int NO_QUARTER = 1;
	final static int HAS_QUARTER = 2;
	final static int SOLD = 3;
	
	private int state;
	private int gumballCount = 0;
	*/

	private GumballState noQuarterState;
	private GumballState soldOutState;
	private GumballState hasQuarterState;
	private GumballState soldState;
	private GumballState winnerState;	
	private GumballState state = soldOutState;
	
	private int gumballCount = 0;
	
	public GumballMachine(int fillCount) {
		
		setGumballCount(fillCount);

		noQuarterState = new NoQuarterState(this);
		soldOutState = new SoldOutState(this);
		hasQuarterState = new HasQuarterState(this);
		soldState = new SoldState(this);
		winnerState = new WinnerState(this);
		
		if (fillCount > 0) {
			state = noQuarterState;
		}
	}

	
	public int getGumballCount() {
		return gumballCount;
	}

	
	public void setGumballCount(int gumballCount) {
		this.gumballCount = gumballCount;
	}
	
	
	public void refill(int count) {
		setGumballCount(count);
		state = noQuarterState;
	}

	public void insertQuarter() {
		state.insertQuarter();
	}
	
	public void ejectQuarter() {
		state.ejectQuarter();
	}
	
	public void turnCrank() {
		state.turnCrank();
		state.dispense();
	}
	
	void releaseBall() {
		if(getGumballCount() > 0) {
			setGumballCount(getGumballCount() - 1);
			System.out.println("A gumball comes rolling out the slot ...");
		} else {
			
		}
	}
	
	public GumballState getState() {
		return state;
	}


	public void setState(GumballState state) {
		this.state = state;
	}


	public GumballState getNoQuarterState() {
		return noQuarterState;
	}


	public void setNoQuareterState(GumballState noQuareterState) {
		this.noQuarterState = noQuareterState;
	}


	public GumballState getSoldOutState() {
		return soldOutState;
	}


	public void setSoldOutState(GumballState soldOutState) {
		this.soldOutState = soldOutState;
	}


	public GumballState getHasQuarterState() {
		return hasQuarterState;
	}


	public void setHasQuarterState(GumballState hasQuarterState) {
		this.hasQuarterState = hasQuarterState;
	}


	public GumballState getSoldState() {
		return soldState;
	}


	public void setSoldState(GumballState soldState) {
		this.soldState = soldState;
	}


	public GumballState getWinnerState() {
		return winnerState;
	}


	public void setWinnerState(GumballState winnerState) {
		this.winnerState = winnerState;
	}
	
	public String toString() {
		
		StringBuffer statement = new StringBuffer();
		
		statement.append("\nMighty Gumball Inc.");
		statement.append("\nJava-enabled standing Gumball Model 2020");
		statement.append("\nInventory : " + getGumballCount() + " gumball");
		if(getGumballCount() > 1) {
			statement.append("s");
		}
		statement.append("\n");
		statement.append("\nMachine is " + getState() + "\n");
		
		return statement.toString();
		
	}


}
