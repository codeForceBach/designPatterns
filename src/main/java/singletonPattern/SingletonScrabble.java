package main.java.singletonPattern;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;

public class SingletonScrabble {
    //initialize private static instance variable
    private static SingletonScrabble singleScrabble = null;

    //to test multi Thread issue
    static boolean firstThread = true;

     static String [] scrabbleLetters = {"a", "a", "a", "a", "a", "a", "a", "a", "a",
        "b", "b", "c", "c", "d", "d", "d", "d", "e", "e", "e", "e", "e",
        "e", "e", "e", "e", "e", "e", "e", "f", "f", "g", "g", "g", "h",
        "h", "i", "i", "i", "i", "i", "i", "i", "i", "i", "j", "k", "l",
        "l", "l", "l", "m", "m", "n", "n", "n", "n", "n", "n", "o", "o",
        "o", "o", "o", "o", "o", "o", "p", "p", "q", "r", "r", "r", "r",
        "r", "r", "s", "s", "s", "s", "t", "t", "t", "t", "t", "t", "u",
        "u", "u", "u", "v", "v", "w", "w", "x", "y", "y", "z"};

    private static LinkedList<String> letterList = new LinkedList<String>(Arrays.asList(scrabbleLetters));

    //private constructor
    private SingletonScrabble(){
    }

    public static SingletonScrabble getInstance(){
    	
        if (singleScrabble == null){

            //this is to test what happen if threads try to create instance of this class
            if(firstThread){
                firstThread = false;

                Thread.currentThread();
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }//end if

            //synchronize the first object so all the thread is hold until prior thread also slow down performance.
            //initial syncrinized 
            synchronized (SingletonScrabble.class){
                if(singleScrabble == null){
                    singleScrabble = new SingletonScrabble();
                    Collections.shuffle(SingletonScrabble.letterList);
                }//end if
            }//end synchronized method
        }//end if
        return singleScrabble;
    }//end getInstance

    public LinkedList<String> getLetterList(){
        return SingletonScrabble.letterList;
    }

    public LinkedList<String> getTiles(int numberOfTile){

        LinkedList<String> tilesToReturn = new LinkedList<String>();

        //iterate through the linked List amount number of requested
        //as it add to new return list, it also remove from the scrabbleList.
        for(int i = 0; i <= numberOfTile ; i++){
            tilesToReturn.add(SingletonScrabble.letterList.remove(0));
        }
        return tilesToReturn;
    }
}
