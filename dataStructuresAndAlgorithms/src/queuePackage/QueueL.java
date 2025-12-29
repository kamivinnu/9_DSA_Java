package queuePackage;

import linkedListPackage.JLinkedList;

public class QueueL<T> {
	JLinkedList<T> front, rear;
	
	QueueL() {
		front = new JLinkedList<T>();
		rear = front;
	}
	
	public void enque(T a) {
		this.rear.insertEnd(a);
	}
	
	public T deque() {
		if(!isEmpty()) {
			this.front.deleteFront();
		}
		else {
			System.out.println("Queue Underflow");
		}
		return null;
	}
	
	public boolean isEmpty() {
		if(front.isEmpty()) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public void printQueue() {
		if(this.front.isEmpty()) {
			System.out.println("Queue is Empty");
		}
		else {
			this.front.printList();
		}
	}
}
