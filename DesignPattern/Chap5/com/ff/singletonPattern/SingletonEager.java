package com.ff.singletonPattern;

public class SingletonEager {
	
	//eager mode
	//thread safe
	//better efficiency
	private static SingletonEager uniqueInstance = new SingletonEager();
	
	private SingletonEager(){};
	
	public static SingletonEager getInstance() {
		return uniqueInstance;
	}
}
