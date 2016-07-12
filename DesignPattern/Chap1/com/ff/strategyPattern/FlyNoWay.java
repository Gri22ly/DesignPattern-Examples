package com.ff.strategyPattern;

public class FlyNoWay implements FlyBehavior {

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("I can't fly");
	}

}
