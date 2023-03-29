package main.java.weaponStrategy;

public abstract class Character {
	
	public String title;
	
	WeaponBehavior weaponBehavior;
	
	public abstract void fight();
	
	public WeaponBehavior weaponBehavior() {
		
		return weaponBehavior;
	}

	public String getTitie() {
		return title;
	}

	public void getWeapon() {
		weaponBehavior.useWeapon();
	}

	public void setTitie(String titie) {
		this.title = titie;
	}

	public void setWeapon(WeaponBehavior weaponBehavior) {
		this.weaponBehavior = weaponBehavior;
	}

}
