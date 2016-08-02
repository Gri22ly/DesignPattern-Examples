package com.ff.multiThread.test;

import com.ff.multiThread.MyThread;
import com.ff.multiThread.MyThread2;
import com.ff.multiThread.MyThreadPrinter;

public class Tester {
	
	public static void main(String[] args) throws InterruptedException {
		
		tester5();
		
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
		
		System.out.println(Thread.currentThread().getName()+"Main Thread starts!");
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
		
		System.out.println(Thread.currentThread().getName()+ "Main Thread ends!");
	}
	
	public static final void tester5() throws InterruptedException {
        Object a = new Object();   
        Object b = new Object();   
        Object c = new Object();   
        MyThreadPrinter pa = new MyThreadPrinter("A", c, a);   
        MyThreadPrinter pb = new MyThreadPrinter("B", a, b);   
        MyThreadPrinter pc = new MyThreadPrinter("C", b, c);   
           
           
        new Thread(pa).start();
        Thread.sleep(100);  //ensure A B C in order
        new Thread(pb).start();
        Thread.sleep(100);  
        new Thread(pc).start();   
        Thread.sleep(100);  
	}
	
}
