
public class StackArray {
  
	private int[] arr;
	private int top;
	
	// non parameterized
	public StackArray() {
		arr = new int[10];
		top = -1;
	}
	
	// parameterized
	public StackArray(int size) {
		arr = new int[size];
		top = -1;
	}
	
	//is empty
	public boolean isEmpty() {
		return top == -1;
	}
	
	// is full
	public boolean isFull() {
		return top == arr.length - 1;
	}
	
	//push
	public void push(int val) {
		if(!isFull()) {
			top++;
			arr[top] = val;
			System.out.println("Pushed element : " + val);
		}else {
			System.out.println("Stack is Full..");
		}
	}
	
	// pop
	public void pop() {
		if(!isEmpty()) {
			int num = arr[top];
			top--;
			System.out.println(" popped element is " + num);
		}else {
			System.out.println("Stack is Empty");
		}
	}
	
	//peek
	public void peek() {
		if(!isEmpty()) {
		int num = arr[top];
		System.out.println("top element is : " + num);
		}else {
			System.out.println("Stack is Empty.");
		}
	}
}
