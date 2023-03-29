package main.java.atmStatePattern;

public interface AtmState {
	
	public void insertCard();
	public void ejectCard();
	public void insertPin(int pinNumber);
	public void printStatement();
	public void deposit(double amount);
	public void withdraw(double amount);
	public String toString();

}
