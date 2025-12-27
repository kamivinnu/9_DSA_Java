package linkedListPackage;

public class LinkedListDeletionDemo {

	public static void main(String[] args) {
		JLinkedList<Integer> list = new JLinkedList<Integer>();
		
		list.insertFront(1);
		list.insertFront(2);
		list.insertFront(3);
		list.insertFront(4);
		list.insertFront(5);
		list.insertFront(6);
		list.insertFront(7);
		list.insertFront(8);
		
		list.printList();
//		
//		list.deleteKey(1);
//		list.printList();
//		
//		list.deleteFront();
//		list.printList();
//		
		list.deleteEnd();
		list.printList();

	}

}
