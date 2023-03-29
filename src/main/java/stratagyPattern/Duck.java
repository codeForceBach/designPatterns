package main.java.stratagyPattern;

public abstract class Duck {
	
	//initialize interface as instance variable
	FlyBehavior flyBehavior;
	QuackBehavior quackBehavior;
	
	public abstract void display();
	
	public void swim() {
		System.out.println("Any duck float even the decoy!");
	}
	
	public void performQuack() {
		quackBehavior.quacks();
	}
	
	public void performFly() {
		flyBehavior.fly();
	}

	public FlyBehavior getFlyBehavior() {
		return flyBehavior;
	}

	public QuackBehavior getQuackBehavior() {
		return quackBehavior;
	}

	public void setFlyBehavior(FlyBehavior flyAct) {
		flyBehavior = flyAct;
	}

	public void setQuackBehavior(QuackBehavior quackSound) {
		quackBehavior = quackSound;
	}
}
