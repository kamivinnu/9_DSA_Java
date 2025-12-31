package queue;

	public class LinearQueue {
	    private int[] queue;      // Array to store queue elements
	    private int front, rear;  // Front and rear pointers
	    private int size;         // Maximum size of the queue

	    // Constructor to initialize the queue
	    public LinearQueue(int size) {
	        this.size = size;
	        queue = new int[size];
	        front = -1;
	        rear = -1;
	    }

	    // Check if the queue is full
	    public boolean isFull() {
	        return rear == size - 1;
	    }

	    // Check if the queue is empty
	    public boolean isEmpty() {
	        return front == -1;
	    }

	    // Insert an element into the queue (enqueue)
	    public void enqueue(int element) {
	        if (isFull()) {
	            System.out.println("Queue is Full. Cannot insert " + element);
	            return;
	        }

	        // First element being inserted
	        if (front == -1) {
	            front = 0;
	        }

	        queue[++rear] = element;
	        System.out.println(element + " enqueued to the queue.");
	    }

	    // Remove an element from the queue (dequeue)
	    public int dequeue() {
	        if (isEmpty()) {
	            System.out.println("Queue is Empty. Cannot dequeue.");
	            return -1;
	        }

	        int removed = queue[front];
	        System.out.println(removed + " dequeued from the queue.");
	        front++;

	        // Reset front and rear if queue becomes empty
	        if (front > rear) {
	            front = rear = -1;
	        }

	        return removed;
	    }

	    // Display all elements in the queue
	    public void display() {
	        if (isEmpty()) {
	            System.out.println("Queue is Empty.");
	            return;
	        }

	        System.out.print("Queue elements: ");
	        for (int i = front; i <= rear; i++) {
	            System.out.print(queue[i] + " ");
	        }
	        System.out.println();
	    }

	    // Show the front element
	    public void peek() {
	        if (isEmpty()) {
	            System.out.println("Queue is Empty.");
	        } else {
	            System.out.println("Front element is: " + queue[front]);
	        }
	    }

	    // Main method to test the Linear Queue
	    public static void main(String[] args) {
	        LinearQueue q = new LinearQueue(5);

	        q.enqueue(10);
	        q.enqueue(20);
	        q.enqueue(30);

	        q.display();

	        q.dequeue();
	        q.display();

	        q.peek();

	        q.enqueue(40);
	        q.enqueue(50);
	        q.enqueue(60); // Should say full

	        q.display();

	        System.out.println("Is Full: " + q.isFull());
	        System.out.println("Is Empty: " + q.isEmpty());
	    }
	}
	


