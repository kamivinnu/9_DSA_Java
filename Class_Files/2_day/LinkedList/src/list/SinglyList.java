/**
 * 
 */
package list;

/**
 * 
 */
public class SinglyList implements LinkedListInterf {

	/**
	 * 
	 */
	private Node head;
	private Node tail;
	
	public SinglyList() {
		// TODO Auto-generated constructor stub
		head = null;
		tail = null;
		
	}

	@Override
	public void addAtFront(int element) {
		// Make space for new element,say new Node
		Node newNode = new Node();
		//store the element in newnode's data.
		newNode.data = element;
		//set newnode's next to head
		newNode.next = head;
		//Set head to newNode.
		head = newNode;
		//if tail is empty then
		if(tail == null)
		{
			tail= head;
		}
		
	}

	@Override
	public void print() {
		// set current to the first node of the list.
		Node current = head;
		//while (current is not empty)
		while(current!=null) {
			//process current node.
			System.out.println(current.data);
			//Set current to currentnode's next.
			current = current.next;
		}
		

	}

	@Override
	public void addAtRear(int element) {
		// TODO Auto-generated method stub
		// Make space for new element,say new Node
				Node newNode = new Node();
				//store the element in newnode's data.
				newNode.data = element;
				//Set newNode's next to empty.
				newNode.next = null;
				//if the list is empty then
				if(head == null) {
					//set head and tail to newNode
					head = newNode;
					tail = newNode;
					return;
				}
		//Set tail's next to newNode
				tail.next = newNode;
		//set newNode=tail
			    tail = newNode;
			    
			    
				
				
		
	}

	@Override
	public int deleteFirstNode() {
		// if list is empty then
		if(head == null)
		{
			//stop
			return -1;
			
		}
		//set temp to head.
		Node temp = head;
		//set head to head.next
		head = head.next;
		//if list is empty then
		if( head == null){
			tail = head;
			
		}
		
		return temp.data;
	}
	
	

}
