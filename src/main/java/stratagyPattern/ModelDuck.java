package main.java.stratagyPattern;

public class ModelDuck extends Duck {
	
	public ModelDuck() {
		//by extends super class Duck, it inherit all the instance variables from the superclass
		//then implement specific interface's subclass that suit for this particular class
		quackBehavior = new MuteQuack();
		flyBehavior = new FlyNoWay();
	}

	@Override
	public void display() {
		System.out.println("I am a model Duck!");
		
	}

}
