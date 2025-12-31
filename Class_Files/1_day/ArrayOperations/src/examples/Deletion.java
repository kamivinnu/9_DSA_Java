package examples;
public class Deletion {
public static void main(String[] args) {
		int[] arr = {10, 20, 30, 40, 50};

		        int pos = 2;   // index of element to delete

		        // Shifting elements to the left
		        for (int i = pos; i < arr.length - 1; i++)
		        {
		            arr[i] = arr[i + 1];
		        }
		        
		        arr[arr.length - 1] = 0;  // Optional: set last element to 0

		        // Traversing updated array
		        for (int no : arr)
		        {
		            System.out.print(no + " ");
		        }
		    }
		}


