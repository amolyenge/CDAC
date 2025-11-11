package com.Graph.StackAndQueue;

public class MyQueueList {
	Node front;
	Node rear;
	
	class Node{
		int data;
		Node next;
		
		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}
	
	public MyQueueList() {
		front = null;
		rear = null;
	}
	
	// check is empty
	public boolean isEmpty() {
		return front == null && rear == null;
	}
	
	// add in queue
	public void enQueue(int val) {
		Node newNode = new Node(val);
		if(front == null) {
			front = newNode;
		}else {
			rear.next = newNode;
		}
		
		rear = newNode;
	}
	
	// remove from Queue
	public int deQueue() {
		if(!isEmpty()) {
			 Node temp = front;
			 front = front.next;
			 if(front == null) {
				 rear = null;
			 }
			 temp.next = null;
			 return temp.data;
		}else {
			System.out.println("Queue is Already Empty.");
			return -1;
		}
	}
}
