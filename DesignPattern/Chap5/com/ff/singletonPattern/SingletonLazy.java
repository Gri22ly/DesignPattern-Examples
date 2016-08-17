package com.ff.singletonPattern;

public class SingletonLazy {
	
	private static SingletonLazy uniqueInstance;
	
	private SingletonLazy() {};
	
	//use "synchronized" to handle multi-thread case
	//loss of efficiency 
	//lazy mode
	public static synchronized SingletonLazy getInstance() {
		if(uniqueInstance == null) {
			uniqueInstance = new SingletonLazy();
		}
	return uniqueInstance;
	}
}


