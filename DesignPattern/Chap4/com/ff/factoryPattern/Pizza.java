package com.ff.factoryPattern;

public abstract class Pizza {
	
	public String description = "Unknown type of pizza";
	
	public abstract void prepare();
	public abstract void bake();
	public abstract void cut();
	public abstract void box();
	
}
