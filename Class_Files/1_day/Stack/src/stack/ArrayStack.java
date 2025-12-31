package stack;

public class ArrayStack implements StackADT {
		private int[] stack;
	    private int top;
	    private int capacity;

	    // Constructor
	    public ArrayStack(int size) {
	        capacity = size;
	        stack = new int[capacity];
	        top = -1;
	    }

	    // Push operation
	    @Override
	    public void push(int element) {
	        if (isFull()) {
	            System.out.println("Stack Overflow! Cannot push " + element);
	            return;
	        }
	        stack[++top] = element;
	        System.out.println(element + " pushed into stack");
	    }

	    // Pop operation
	    @Override
	    public int pop() {
	        if (isEmpty()) {
	            System.out.println("Stack Underflow! Cannot pop");
	            return -1;
	        }
	        return stack[top--];
	    }

	    // Peek operation
	    @Override
	    public int peek() {
	        if (isEmpty()) {
	            System.out.println("Stack is empty");
	            return -1;
	        }
	        return stack[top];
	    }

	    // isEmpty
	    @Override
	    public boolean isEmpty() {
	        return top == -1;
	    }
        // isFull
	    @Override
	    public boolean isFull() {
	        return top == capacity - 1;
	    }
	}


