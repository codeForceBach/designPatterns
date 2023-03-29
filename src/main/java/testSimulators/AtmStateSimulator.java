package main.java.testSimulators;

import main.java.atmStatePattern.AtmMachine;

public class AtmStateSimulator {

	public static void main(String[] args) {

		AtmMachine atm = new AtmMachine( 1200.99);
		
		System.out.println(atm.toString() + "\n");
		
		atm.insertCard();
		atm.insertPin(34566);
		
		atm.printStatement();
		atm.insertPin(12345);
		atm.withDraw(300.56);
	
		

	}

}
