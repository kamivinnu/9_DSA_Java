
package examples;
public class ArrayOperations {
public static void main(String[] args) {
		
		        int[] arr = {10, 20, 30, 40, 50};
		        int pos = 2;     // index where we want to insert
		        int element = 99;

		        // Shifting elements to the right
		        for (int i = arr.length - 1; i > pos; i--)
		        {
		            arr[i] = arr[i - 1];
		        }
		        
		        arr[pos] = element;   // Insert element at position

		        // Traversing updated array
		        for (int no : arr)
		        {
		            System.out.print(no + " ");
		        }
		    }
		}


