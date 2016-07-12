package com.ff.strategyPattern;

public class MuteQuack implements QuackBehavior {

	@Override
	public void quack() {
		// TODO Auto-generated method stub
		System.out.println("<---SILENCE--->");
	}

}
