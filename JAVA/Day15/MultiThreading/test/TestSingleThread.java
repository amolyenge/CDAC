package Multithreading.test;

import Multithreading.beans.MyClass;

public class TestSingleThread {

	public static void main(String[] args) {
		MyClass ob=new MyClass();
		int ans=ob.factorial(5);
		System.out.println("Factorial : "+ans);
		ob.printTable(3);
		ob.printTable(7);

	}

}
