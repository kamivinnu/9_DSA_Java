package stackPackage;

public class StackLImplementationDemo {

	public static void main(String[] args) {
		StackL<Integer> st = new StackL<Integer>();
		
		st.push(5);
		
		st.printStack();
		
		st.push(6);
		st.push(7);
		
		st.printStack();
		
		st.pop();
		
		st.printStack();
		
		st.pop();
		
		st.printStack();
		
		st.pop();
		
		System.out.println(" Is Empty? " + st.isEmpty());
	}

}
