package main.java.testSimulators;

import java.util.LinkedList;

import main.java.singletonPattern.SingletonScrabble;

public class SingletonScrabbleTest {

    public static void main (String [] args){

        //create singleton instance
        SingletonScrabble newScrabble = SingletonScrabble.getInstance();

        //check unique id for the instance
        System.out.println("1st Singleton Instance ID : " + System.identityHashCode(newScrabble));

        //print all the letters in the list of the object
        System.out.println("all the letters in the list : " + newScrabble.getLetterList());

        LinkedList <String> playerOneTiles = newScrabble.getTiles(8);
        System.out.println("Player 1 tiles: " + playerOneTiles);



        SingletonScrabble secondScrabble = SingletonScrabble.getInstance();

        //check unique id for the instance
        System.out.println("2nd Singleton Instance ID : " + System.identityHashCode(secondScrabble));

        System.out.println("all the letters in the list : " + secondScrabble.getLetterList());

        LinkedList <String> playerTwoTiles = secondScrabble.getTiles(8);
        System.out.println("Player 2 tiles: " + playerTwoTiles);
        
        SingletonScrabble thirdScrabble = SingletonScrabble.getInstance();
        
        System.out.println("all the letters in the list after 2 player pick tiles: " + thirdScrabble.getLetterList());



    }
}
