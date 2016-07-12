package com.ff.strategyPattern;

public class Quack implements QuackBehavior{

	int a=1;
	
	@Override
	public void quack() {
		// TODO Auto-generated method stub
		System.out.println("Quack");
	}

}
