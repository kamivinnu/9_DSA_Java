package balancing;
public class Main {

	    // Check matching pair
public static boolean checkPair(char open, char close) {
	        return (open == '(' && close == ')') ||
	               (open == '[' && close == ']') ||
	               (open == '{' && close == '}');
	    }

public static boolean checkBalanced(String expr) {

	        int n = expr.length();
	        char[] stack = new char[n];  // custom stack
	        int top = -1;  // stack pointer

	        for (int i = 0; i < n; i++) {
	            char ch = expr.charAt(i);

	            // Opening brackets → push into stack
	            if (ch == '(' || ch == '[' || ch == '{') {
	                stack[++top] = ch;
	            }
	            else {
	                // If stack empty ,no matching opener
	                if (top == -1) 
	                    return false;

	                // Check if pair matches
	                if (!checkPair(stack[top], ch)) 
	                    return false;

	                top--; // pop
	            }
	        }

	        // If stack empty at end ,Balanced
	        return top == -1;
	    }

public static void main(String[] args) {
	        String expr = "({})[]";
	        

	        System.out.println(checkBalanced(expr) ? "Balanced" : "Not Balanced");
	    }
	}
