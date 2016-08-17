package com.ff.singletonPattern;

public class SingletonDoubleCheck {

	//double-checking locking
	private volatile static SingletonDoubleCheck uniqueSingleton; // not supported by jdk version under 1.4
	
	private SingletonDoubleCheck() {};
	
	public static SingletonDoubleCheck getInstance() {
		if(uniqueSingleton == null) { // if instance doesn't exist, go into synchronized block
									  // make sure synchronized code block runs only once
			synchronized (SingletonDoubleCheck.class) {
				if(uniqueSingleton == null) {//check again
					uniqueSingleton = new SingletonDoubleCheck();
				}
			}
		}
		return uniqueSingleton;
	}
}
