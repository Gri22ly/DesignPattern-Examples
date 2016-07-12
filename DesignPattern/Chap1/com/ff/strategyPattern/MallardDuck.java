package com.ff.strategyPattern;

public class MallardDuck extends Duck {

	public MallardDuck() {
		quackBehavior = new Quack();
		flyBehavior = new FlyNoWay();
	}
	@Override
	public void display() {
		System.out.println("I'm a millard duck!");
	}

}
