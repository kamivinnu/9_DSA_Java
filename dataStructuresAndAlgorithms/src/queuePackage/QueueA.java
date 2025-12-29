package queuePackage;

public class QueueA<T> {
	T[] data;
	int rear;
	int front;
	int length;
	
	QueueA(T[] a) {
		data = a;
		rear = -1;
		front = 0;
		length = a.length;
	}
	
	public void enque(T a) {
		if(rear >= length-1) {
			System.out.println("Queue OverFlow");
		}
		else {
			rear++;
			data[rear] = a;
		}
	}
	
	public T deque() {
		T x = null;
		if(!isEmpty()) {
			x = data[front];
			front++;
			return x;
		}
		else {
			System.out.println("Queue Underflow");
			return null;
		}
	}
	
	public boolean isEmpty() {
		if(front > rear) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public void printQueue() {
		if(!isEmpty()) {
			for(int i = front; i <= rear; i++) {
				System.out.print(data[i] + " ");
			}
		}
		System.out.println();
	}
}
