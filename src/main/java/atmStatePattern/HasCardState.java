package main.java.atmStatePattern;

public class HasCardState implements AtmState {

	private AtmMachine atm;
	
	public HasCardState(AtmMachine atm) {	
		this.atm = atm;
		toString();
		atm.setState(atm.getHasValidPinState());
	}

	@Override
	public void insertCard() {
		System.out.println("you already enter a card.");

	}

	@Override
	public void ejectCard() {
		System.out.println("No transaction processed!");
		atm.setState(atm.getNoCardState());

	}

	@Override
	public void insertPin(int pinNumber) {
		if(atm.getPinNumber() == pinNumber) {
			atm.setState(atm.getHasValidPinState());
		} else {
			System.out.println("the pin number " + pinNumber + " you entered not correct. please try again!");
		}

	}

	@Override
	public void printStatement() {
		System.out.println("before print statement, please enter the valid pin number!");

	}

	@Override
	public void deposit(double amount) {
		System.out.println("before deposit " + amount + " please enter the valid pin number!");

	}

	@Override
	public void withdraw(double amount) {
		System.out.println("before request " + amount + " please enter the valid pin number!");

	}
	
	public String toString() {
		return "you entered a card. please enter valid pin number!";
	}

}
