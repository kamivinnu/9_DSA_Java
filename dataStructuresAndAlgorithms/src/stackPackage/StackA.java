package stackPackage;

public class StackA<T> {
	T[] data;
	int length;
	int top;
	
	public StackA(T[] a) {
		
		data = a;
		length = a.length;
		top = -1;
	}
	
	public void push(T a) {
		if(top < length - 1) {
			top++;
			data[top] = a;
		}
		
		else {
			System.out.println("Stack Overflow");
		}
	}
	
	public T pop() {
		T a = null;
		if (top == -1) {
			System.out.println("Stack UnderFlow");
		}
		else {
			a = data[top];
			top--;
		}
		
		return a;
	}
	
	public T peek() {
        if (top == -1) {
            System.out.println("Stack is Empty");
            return null;
        } else {
            return data[top];
        }
    }
	
	public boolean isEmpty() {
		if(top == -1) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public void printStack() {
		if (top == -1) {
			System.out.println("Stack is Empty...");
		}
		
		else {
			for(int i = top; i >= 0; i--) {
				System.out.print(data[i] + " ");
			}
		}
	}
	
	
}
