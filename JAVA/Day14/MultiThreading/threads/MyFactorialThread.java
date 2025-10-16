package Multithreading.threads;

import Multithreading.beans.MyClass;

public class MyFactorialThread extends Thread{
	private int n;
	private MyClass ob;
	
	public MyFactorialThread(int n, MyClass ob) {
		super();
		this.n = n;
		this.ob = ob;
	}

	public void run() {
		int ans=ob.factorial(n);
		System.out.println("Factorial: "+ans);
	}

}
