package main.java.testSimulators;

import main.java.stratagyPattern.Duck;
import main.java.stratagyPattern.FlyWithRocket;
import main.java.stratagyPattern.MallardDuck;
import main.java.stratagyPattern.ModelDuck;
import main.java.stratagyPattern.Squeck;

public class DuckSimulator {

	public static void main(String[] args) {


		Duck mallard = new MallardDuck();
		
		mallard.display();
		mallard.performFly();//Inherited method from super class that is defined to a specific sub class' of the interface.
		mallard.performQuack();
		
		Duck modelDuck = new ModelDuck();
		
		modelDuck.display();
		modelDuck.performFly();
		modelDuck.performQuack();

		modelDuck.setFlyBehavior(new FlyWithRocket());
		modelDuck.performFly();
		modelDuck.setQuackBehavior(new Squeck());
		modelDuck.performQuack();

	}

}
