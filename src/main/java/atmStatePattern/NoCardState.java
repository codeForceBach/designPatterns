package main.java.atmStatePattern;

public class NoCardState implements AtmState {

		private AtmMachine atm;
		
	public NoCardState(AtmMachine atm) {
		this.atm = atm;
	}
	
	@Override
	public void insertCard() {
		atm.setState(atm.getHasCardState());

	}

	@Override
	public void ejectCard() {
		System.out.println("No card to eject!");
		toString();

	}

	@Override
	public void insertPin(int pinNumber) {
		toString();

	}

	@Override
	public void printStatement() {
		toString();

	}

	@Override
	public void deposit(double amount) {
		toString();

	}

	@Override
	public void withdraw(double amount) {
		toString();

	}
	
	public String toString() {
		
		return "Please insert card to start transaction.";
		
	}

}
