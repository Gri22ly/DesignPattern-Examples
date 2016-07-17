package com.ff.multiThread;

/*
 * Inherit Thread Class to implement multi-threads
 * 
 */

public class MyThread extends Thread{
	
	private String name;

	@Override
	public void run() {
		for(int i = 0; i < 5; i++) {
			System.out.println(name + "线程运行  :  " + i);
			try {
				sleep((int) Math.random() * 10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public MyThread(String name) {
		this.name = name;
	}

}
