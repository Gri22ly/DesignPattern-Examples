package com.ff.multiThread;

public class MyThread2 implements Runnable{

	private String name;

	public MyThread2(String name) {
		this.name=name;
	}

	public MyThread2() {
	}

	private int count = 15;
	
	@Override
	public void run() {
		  for (int i = 0; i < 5; i++) {
	            System.out.println(Thread.currentThread().getName() + "线程运行  :  count= " + count--);
	            try {
	            	Thread.sleep((int) Math.random() * 10);
	            } catch (InterruptedException e) {
	                e.printStackTrace();
	            }
	        }
		
	}

}
