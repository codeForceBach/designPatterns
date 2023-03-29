package main.java.atmStatePattern;

public class AtmMachine {
	
	private AtmState noCardState;
	private AtmState hasCardState;
	private AtmState hasValidPinState;
	private AtmState emptyAmountState;
	
	private double cashAvailable;
	private final int pinNumber = 12345;
	
	private AtmState state;
	
	public AtmMachine(double cashAmount) {
		this.cashAvailable = cashAmount;
		
		noCardState = new NoCardState(this);
		hasCardState = new HasCardState(this);
		hasValidPinState = new HasValidPinState(this);
		emptyAmountState = new EmptyAmountState(this);
		
		state = noCardState;
		
	}
	
	public double getCashAvailable() {
		return cashAvailable;
	}

	public void setCashAvailable(double cashAvailable) {
		this.cashAvailable = cashAvailable;
	}
	
	public void insertCard() {
		state.insertCard();
	}
	
	public void ejectCard() {
		state.ejectCard();
	}
	
	public void withDraw(double amount) {
		state.withdraw(amount);
		
	}
	
	public void printStatement() {
		state.printStatement();
	}

	public void insertPin(int pinNo) {
		state.insertPin(pinNo);	
	}

	public String getState() {
		return state.toString();
	}

	public AtmState setState(AtmState state) {
		this.state = state;
		return state;
	}
	

	public AtmState getEmptyAmountState() {
		return emptyAmountState;
	}

	public AtmState getHasCardState() {
		return hasCardState;
	}

	public AtmState getHasValidPinState() {
		return hasValidPinState;
	}

	public AtmState getNoCardState() {
		return noCardState;
	}

	public int getPinNumber() {
		return pinNumber;
	}
	
	public String toString() {
		
		StringBuffer statement = new StringBuffer();
		
		statement.append("\nWelcome to Mega bill ATM Machine.");
		statement.append("\nJava-enabled standing ATM Model 2020");
		statement.append("\nCash available  : $" + getCashAvailable());
		
		statement.append("\nATM Machine is " + getState() + "\n");
		
		return statement.toString();
		
	}

}
