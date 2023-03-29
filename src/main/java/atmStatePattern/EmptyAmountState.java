package main.java.atmStatePattern;

public class EmptyAmountState implements AtmState {

	
	private AtmMachine atm;
	
	public EmptyAmountState(AtmMachine atm) {
		this.atm = atm;
	}
	
	@Override
	public void insertCard() {
		toString();
		atm.setState(atm.getNoCardState());

	}

	@Override
	public void ejectCard() {
		returnCard();

	}

	@Override
	public void insertPin(int pinNumber) {
		returnCard();

	}

	@Override
	public void printStatement() {
		returnCard();

	}

	@Override
	public void deposit(double amount) {
		returnCard();

	}

	@Override
	public void withdraw(double amount) {
		returnCard();

	}
	
	public void returnCard() {
		toString();
		atm.setState(atm.getNoCardState());
	}
	
	public String toString () {
		StringBuffer statement = new StringBuffer();
		
		statement.append("Sorry Currently there are not enough funding for the amount your request.");
		statement.append("Please try other location.");
		
		return statement.toString();
	}

}
