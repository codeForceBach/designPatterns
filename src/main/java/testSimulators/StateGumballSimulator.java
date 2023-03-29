package main.java.testSimulators;

import main.java.gumballStatePattern.GumballMachine;

public class StateGumballSimulator {

	public static void main(String[] args) {


		GumballMachine gumball = new GumballMachine(5);
		
		System.out.println(gumball + "\n");
		
		gumball.insertQuarter();
		gumball.turnCrank();
		gumball.insertQuarter();
		gumball.turnCrank();
		
		System.out.println("2nd check the state of gumball" + gumball + "\n");
		
		gumball.insertQuarter();
		gumball.turnCrank();
		gumball.insertQuarter();
		gumball.turnCrank();

		System.out.println("3rd check the state of gumball" + gumball + "\n");
		
		gumball.insertQuarter();
		gumball.turnCrank();
		gumball.insertQuarter();
		gumball.turnCrank();

	}

}
