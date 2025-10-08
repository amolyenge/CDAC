package com.demo.beans;

public class ClassA {
	private int x;
	public final void m1() {
		System.out.println("in m1 of ClaasA");
	}

}

// class ClassB extends ClassA{
//	 public void m1() {  // final method cant be overridden
//			System.out.println("in m1 of ClaasA");
//		}
//	
//}
