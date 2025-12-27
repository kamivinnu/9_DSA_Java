package arrayPackage;

import java.util.Scanner;

class ArrayInitializationDemo {
	
	public static void main(String[] args) {
		
		int[] arr = new int[100]; // Declaring a 1D array of size 100
		int size;

		
		// Actual size of the array
		Scanner sc = new Scanner(System.in); // To read from keyboard
		
		System.out.println("Enter the size below 100");
		
		size = sc.nextInt(); // read a number 
		
		for(int i = 0;i<size;i++){
			System.out.println("Enter "+ (i+1) + "th number ");
			arr[i] = sc.nextInt(); // Load the i-th entry   
		}
		
		System.out.println("Length = " + arr.length); // 100
		System.out.println(arr); // [I@5b6f7412
		// Display the array on the screen
}
}
