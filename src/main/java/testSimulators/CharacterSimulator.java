package main.java.testSimulators;

import main.java.weaponStrategy.BowAndArrowBehavior;
import main.java.weaponStrategy.Character;
import main.java.weaponStrategy.Knight;

public class CharacterSimulator {

	public static void main(String[] args) {

		Character knight = new Knight();
		knight.fight();
		knight.getWeapon();
		knight.setWeapon(new BowAndArrowBehavior());

	}

}
