package linkedListPackage;

public class LinkedListInsertionDemo {

	public static void main(String[] args) {
		JLinkedList<Integer> list = new JLinkedList<Integer>();
		
		list.insertEnd(9);
		list.printList();
		list.insertFront(5);
		list.printList();
		list.insertEnd(10);
		list.printList();
		list.insertKey(7, 5);
		list.printList();
		
		list.insertKey(12, 0);
		list.printList();
		
		list.insertKey(13, 10);
		list.printList();
		
		list.insertFront(2);
		list.printList();

	}

}
