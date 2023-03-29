package main.java.atmStatePattern;

public class HasValidPinState implements AtmState {
	AtmMachine atm;
	
	public HasValidPinState(AtmMachine atm) {
		this.atm = atm;
		
	}

	@Override
	public void insertCard() {
		System.out.println("you already enter a card");

	}

	@Override
	public void ejectCard() {
		System.out.println("NO transaction processed.");
		atm.setState(atm.getNoCardState());
		
	}

	@Override
	public void insertPin(int pinNumber) {
		System.out.println("you already enter a valid pin number!");

	}

	@Override
	public void printStatement() {
		System.out.println("$ " + atm.getCashAvailable() + "available in this account!");

	}

	@Override
	public void deposit(double amount) {
		if(amount > 0) {
			System.out.println("$" + amount + " has been depot to your account!");
			atm.setCashAvailable(atm.getCashAvailable() + amount);
		} else {
			System.out.println("amount need to be greater than zero!");
		}

	}

	@Override
	public void withdraw(double amount) {
		if (atm.getCashAvailable() > amount) {
			if(atm.getCashAvailable() > 0) {
				System.out.println("please take $" + amount + " ");
				atm.setCashAvailable(atm.getCashAvailable() - amount);
				
			} else {
				atm.setState(atm.getEmptyAmountState());
			}
		} else {
			atm.setState(atm.getEmptyAmountState());
		}	

	}
	

	public String toString() {
		return "Welcome, ready for service for the account!";
	}

}
