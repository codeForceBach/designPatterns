package main.java.weaponStrategy;

public class Knight extends Character {

	
	public Knight() {
		title = "Knight";
		weaponBehavior = new SwordBehavior();
		
	}
	@Override
	public void fight() {
		System.out.println("with Royal to the king and courage, I am a " + title);
		
	}

}
