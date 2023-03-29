package main.java.singletonPattern;

import java.util.LinkedList;

public class getTheTiles implements Runnable {

	@Override
	public void run() {
		// create new instance
		SingletonScrabble newScrabble = SingletonScrabble.getInstance();
		
		System.out.println("1st instance ID : " + System.identityHashCode(newScrabble));
		
		System.out.println(newScrabble.getLetterList());
		
		LinkedList<String> firstPlayerTile = newScrabble.getTiles(7);
		
		System.out.println("Player 1 tiles : " + firstPlayerTile);

		System.out.println("got Tiles!");
	}

}
