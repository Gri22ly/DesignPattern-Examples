package com.ff.singletonPattern;

public class Singleton {
	
	private volatile static Singleton uniqueInstance;
	
	private Singleton(){};
	
	//handle multi-thread case
	public static Singleton getInstance(){
		if(uniqueInstance == null) {
			synchronized (uniqueInstance) {
				if(uniqueInstance == null) {
					uniqueInstance = new Singleton();
				}
			}
		} 
		return uniqueInstance;
	}

}
