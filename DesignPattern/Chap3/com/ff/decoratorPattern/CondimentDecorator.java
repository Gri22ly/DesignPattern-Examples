package com.ff.decoratorPattern;

public abstract class CondimentDecorator extends Beverage {
	
	Beverage beverage;
	
	public abstract String getDescription();
	
}
