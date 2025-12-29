package queuePackage;

public class QueueAImplementationDemo {

	public static void main(String[] args) {
		Integer[] arr = new Integer[2];
		
		QueueA<Integer> q = new QueueA<Integer>(arr);
		
		q.enque(1);
		q.printQueue();
		
		q.enque(2);
		q.printQueue();
		
		q.enque(3);
		q.printQueue();
		
		q.deque();
		q.printQueue();
		
		q.deque();
		q.printQueue();
		
		q.deque();
		q.printQueue();

	}

}
