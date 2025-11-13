
public class StackLinkedList {

	Node top;
	class Node{
		int data;
		Node next;
		
		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}
	
	public StackLinkedList() {
		top = null;
	}
	
	
	
	// check is empty
	public boolean isEmpty() {
		return top == null;
	}
	
	// push
	public void push(int val) {
		Node newNode = new Node(val);
			newNode.next = top;
			top = newNode;
			System.out.println("Pushed element : " + val);
	}
	
	// pop
	public void pop() {
		if(!isEmpty()) {
			int num = top.data;
			top = top.next;
			System.out.println("popped element is : " + num);
		}
	}
	
	// peek
	public void peek() {
		System.out.println(top.data);
	}
}
