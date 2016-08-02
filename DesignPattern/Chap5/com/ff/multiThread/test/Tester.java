package com.ff.multiThread.test;

import com.ff.multiThread.MyThread;
import com.ff.multiThread.MyThread2;

public class Tester {
	
	public static void main(String[] args) {
		
		tester4();
		
	}
	
	public static final void tester1(){
		/**
		 * tester for "MyThread"
		 */
		MyThread thread1 = new MyThread("A");
		MyThread thread2 = new MyThread("B");
		
		thread1.start();
		thread2.start();
	}
	
	public static final void tester2(){
		/**
		 * tester for "MyThread2"
		 */
		new Thread(new MyThread2("C")).start();
		new Thread(new MyThread2("D")).start();
	}
	
	public static final void tester3(){
		/**
		 * tester for sharing data in MyThread2 (implementing Runnable)
		 */
		
		MyThread2 my = new MyThread2();
        //All threads share the same initialized "MyThread" object	 
		new Thread(my, "C").start();
        new Thread(my, "D").start();
        new Thread(my, "E").start();
	}
	
	public static final void tester4() {
		/**
		 * tester for using join() 
		 * comment out the try-catch block to see
		 * different outcome of the result 
		 */
		
		System.out.println(Thread.currentThread().getName()+"主线程运行开始!");
		MyThread mTh1=new MyThread("A");
		MyThread mTh2=new MyThread("B");
		mTh1.start();
		mTh2.start();
		
//		try {
//			mTh1.join();
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		
//		try {
//			mTh2.join();
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
		
		System.out.println(Thread.currentThread().getName()+ "主线程运行结束!");
	}
	
	
}
