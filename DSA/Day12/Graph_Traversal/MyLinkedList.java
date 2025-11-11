package com.Graph.GraphTraversal;

public class MyLinkedList {

	Node head;
	class Node{
		int data;
		Node next;
		
		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}
	
	public MyLinkedList() {
		head = null;
	}
	
	// add Node
	public void addNode(int data) {
		Node newNode = new Node(data);
		if(head != null) {
			newNode.next = head;
		}
		head = newNode;
	}
	
	// search in List
	public boolean searchVal(int val) {
		if(head == null) {
			return false;
		}else {
			Node temp = head;
			while( temp != null && temp.data != val) {
				temp = temp.next;
			}
			if(temp.data == val) {
				return true;
			}
			return false;
		}
	}
	
	
	// adjacent nodes
	public int[] getAdjacentNodes(int[] arr) {
		Node temp = head;
		for(int i = 0; temp != null && i < arr.length;i++) {
			arr[i] = temp.data;
			temp = temp.next;
		}
		return arr;
	}
	
	// display list
	public void displayList() {
		if(head == null) {
			System.out.println("List is Empty");
		}else {
			Node temp = head;
			while(temp != null) {
				System.out.print(temp.data + "---->");
				temp = temp.next;
			}
		}
	}
}
