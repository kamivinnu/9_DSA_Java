package stackPackage;

public class StackAImplementationDemo {

	public static void main(String[] args) {
		Integer a[] = new Integer[2];
		
		StackA<Integer> st = new StackA<Integer>(a);
		
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
