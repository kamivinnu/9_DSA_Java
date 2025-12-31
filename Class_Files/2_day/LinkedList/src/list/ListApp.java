/**
 * 
 */
package list;

/**
 * 
 */
public class ListApp {

	/**
	 * 
	 */
	public ListApp() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        LinkedListInterf list = new SinglyList();
        list.addAtFront(5);
        list.deleteFirstNode();
        list.addAtFront(10);
        list.addAtFront(15);
        list.addAtRear(10);
        
        System.out.println("List elements are:");
        list.print();
        
	}

}
