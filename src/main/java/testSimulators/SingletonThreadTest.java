package main.java.testSimulators;

import main.java.singletonPattern.getTheTiles;

public class SingletonThreadTest {

	public static void main(String[] args) {
		
		//Create a new Thread created using the Runnable interface
		//Execute the main.code in run after 10 second
		Runnable getTiles = new getTheTiles();
		
		Runnable getTilesAgain = new getTheTiles();
		
		new Thread(getTiles).start();
		new Thread(getTilesAgain).start();

	}

}
