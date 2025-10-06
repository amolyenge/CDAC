package NestedClasses;

public class Parent {
   private int pid;
   
   public Parent() {
	   pid = 10;
   }
   
   static class Child{
	   private int cid;
	   
	   public Child() {
		   cid = 100;
	   }
	   
	   public void m1() {
		   System.out.println("Hello from Child class..");
	   }
   }
}
