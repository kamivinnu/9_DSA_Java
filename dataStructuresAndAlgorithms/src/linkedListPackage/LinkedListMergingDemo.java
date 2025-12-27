package linkedListPackage;

public class LinkedListMergingDemo {

	public static void main(String[] args) {
		JLinkedList<Integer> list1 = new JLinkedList<Integer>();
		JLinkedList<Integer> list2 = new JLinkedList<Integer>();
		
		list1.insertFront(1);
		list1.insertFront(2);
		list1.insertEnd(3);
		list1.insertEnd(4);
		
		list1.printList();
		
		list2.insertFront(5);
		list2.insertEnd(6);
		list2.printList();
		
		list1.merge(list2);
		
		System.out.println("Merged List: ");
		
		list1.printList();

	}

}
