package linkedListPackage;


public class JLinkedList<T> {
	Node head; // head of the list
	
	class Node {
		T data;
		Node next;
		
		// Constructor
		Node() {
			data = null;
			next = null;
		}
		
		
		Node(T d) {
			data = d;
			next = null;
		}
	}
	
	public JLinkedList() { // LL header node
		head = new Node();
	}
	
	// method to insert at front position
	
	public void insertFront(T data) {
		Node newNode = new Node(data);
		newNode.next = this.head.next;
		
		this.head.next = newNode;
	}
	
	// method to insert at end position
	public void insertEnd(T data) {
		Node newNode = new Node(data);
		newNode.next = null;
		
		Node temp = this.head;
		
		while(temp.next != null) {
			temp = temp.next;
		}
		
		temp.next = newNode;
	}
	
	// method to insert at any position
	public void insertKey(T data, T key) {
		Node newNode = new Node(data);
		newNode.next = null;
		
		Node temp = this.head;
		boolean status = false;
		
		while(temp != null) {
			if(temp.data == key) {
				status = true;
				break;
			}
			temp = temp.next;
		}
		
		if(status) {
			newNode.next = temp.next;
			temp.next = newNode;
		}
	}
	
	public T getFront() {
	    if (head.next == null) {
	        return null; // or throw exception
	    }
	    return head.next.data;
	}
	
	// printing the list
	
	public void printList() {
		Node curNode = this.head.next;
		System.out.println("LinkedList: ");
		
		while(curNode != null) {
			
			System.out.print(curNode.data + "  ");
			
			curNode = curNode.next;
		}
		System.out.println();
	}
	
	// merge two linked lists into a single list
	
	public void merge(JLinkedList<T> l2) {
		Node l1Node = this.head;
		Node l2Node = l2.head;
		
		while (l1Node.next != null) {
			l1Node = l1Node.next;
		}
		
		l1Node.next = l2Node.next;
	}
	
	
	// deletion operations
	
	public T deleteFront() {
		T x = null;
		Node temp = this.head.next;
		Node prev = null;
		
		if(temp != null) {
			x = temp.data;
			this.head.next = temp.next;
			System.out.println("Element Deleted.");
		}
		return x;
	}
	
	public T deleteEnd() {
		T x = null;
		Node temp = this.head.next;
		Node prev = null;
		
		if(temp != null) { 
			while (temp.next != null) {
				prev = temp;
				temp = temp.next;
			}
			x = temp.data;
			prev.next = null;
		}
		return x;
	}
	
	public void deleteKey(T key) {
		Node temp = this.head.next, prev = null;
		
		while(temp != null) {
			if (temp.data == key) {
				prev.next = temp.next;
				System.out.println(key + " position element deleted");
				break;
			}
			else {
				prev = temp;
				temp = temp.next;
			}
		}
	}
	
	// reverse list
	
	public Node remove(Node n){
	    Node current = n;
	    Node next = n.next;
	    Node prev = null;

	    while (current != null){
	        next = current.next;
	        current.next = prev;
	        prev = current;
	        current = next;
	    }
	    this.head.next = prev;
	    return next;
	}

	public void reverseList() {
	    Node currNode = this.head.next;
	    System.out.print("Reversed List : ");
	    remove(currNode);
	}

	public boolean isEmpty() {
		
		return this.head.next == null;
	}
}
