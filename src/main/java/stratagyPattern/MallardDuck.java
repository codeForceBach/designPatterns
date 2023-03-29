package main.java.stratagyPattern;

public class MallardDuck extends Duck{
	
	public MallardDuck() {
		
		//by extends super class Duck, it inherit all the instance variables from the superclass
		//then implement specific interface's subclass that suit for this particular class
		quackBehavior = new Quack();
		flyBehavior = new FlyWithWings();
		
	}
	
	public void display() {
		System.out.println("I am a real Mallard Duck!");
	}

}
