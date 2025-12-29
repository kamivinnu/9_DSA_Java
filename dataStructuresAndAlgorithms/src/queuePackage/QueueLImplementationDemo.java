package queuePackage;

public class QueueLImplementationDemo {

	public static void main(String[] args) {
		
		QueueL<Integer> q = new QueueL<Integer>();
		
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
