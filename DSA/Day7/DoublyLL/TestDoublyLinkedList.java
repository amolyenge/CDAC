package com.demo.DoublyLL.test;

import com.demo.DoublyLL.Algorithm.DoublyLinkedList;

public class TestDoublyLinkedList {

	public static void main(String[] args) {
		DoublyLinkedList dlist=new DoublyLinkedList();
		dlist.addNode(12);
		dlist.displayData();
		dlist.addNode(15);
		dlist.displayData();
		dlist.addNode(13);
		dlist.displayData();

	}
}
