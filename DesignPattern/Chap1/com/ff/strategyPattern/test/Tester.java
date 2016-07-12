package com.ff.strategyPattern.test;

import com.ff.strategyPattern.Duck;
import com.ff.strategyPattern.FlyRocketPowered;
import com.ff.strategyPattern.MallardDuck;
import com.ff.strategyPattern.ModelDuck;

public class Tester {
	
	public static void main(String[] args) {
		
		Duck millard = new MallardDuck();
		millard.performFly();
		millard.performQuack();
		
		Duck model = new ModelDuck();
		model.performFly();
		model.performQuack();
		
		model.setFlyBehavior(new FlyRocketPowered());
		model.performFly();
	}
	
}
