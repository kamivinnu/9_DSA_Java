package arrayPackage;

import java.util.*;

public class Deletion1DArray {

    int[] a = new int[100];   // Integer array with capacity 100
    int size = 0;            // Number of elements present

    // Initialize the array
    public void create(int size) {
        if (size > 100) {
            System.out.println("Could not initialize...");
            return;
        }

        this.size = size;
        Scanner in = new Scanner(System.in);

        for (int i = 0; i < size; i++) {
            System.out.print("Enter " + (i + 1) + "th number: ");
            a[i] = in.nextInt();
        }

        System.out.println("Capacity = " + a.length + " Size = " + this.size);
        print();
    }

    // Deletion of the item at loc position
    public int delete(int loc) {
        if (size == 0) {
            System.out.println("Array underflow: No item to delete!");
            return -1;
        }

        if (loc < 0 || loc >= size) {
            System.out.println("Out of range: Deletion fails...");
            return -1;
        }

        int item = a[loc]; // Item to be deleted

        // Shift elements to the left
        for (int i = loc; i < size - 1; i++) {
            a[i] = a[i + 1];
        }

        size--; // reduce size

        System.out.println("After deletion:");
        System.out.println("Capacity = " + a.length + " Size = " + size);
        print();

        return item;
    }

    // Display the array
    public void print() {
        System.out.print("{");
        for (int i = 0; i < size; i++) {
            System.out.print(a[i]);
            if (i < size - 1) System.out.print(", ");
        }
        System.out.println("}");
    }

    // Main method
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Deletion1DArray obj = new Deletion1DArray();

        System.out.print("Enter the number of elements: ");
        int n = in.nextInt();
        obj.create(n);

        System.out.print("Enter the position of number to be deleted (0-based): ");
        int pos = in.nextInt();

        int item = obj.delete(pos);
        if (item != -1) {
            System.out.println("Deleted item: " + item);
        }
    }
}

