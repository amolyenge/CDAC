package com.CircularDoublyLL;

public class Test {
	    public static void main(String[] args) {
	        Algorithm list = new Algorithm();

	        list.addNode(10);
	        list.addNode(20);
	        list.addNode(30);
	        list.displayData();

	        list.addByPosition(1, 5);
	        list.displayData();

	        list.addByPosition(3, 15);
	        list.displayData();

	        list.addByValue(25, 20);
	        list.displayData();

	        list.deleteByPosition(1);
	        list.displayData();

	        list.deleteByValue(15);
	        list.displayData();

	        list.deleteByValue(100); // not found
	    }
}
