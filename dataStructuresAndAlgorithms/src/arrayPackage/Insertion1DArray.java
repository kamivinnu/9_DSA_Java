package arrayPackage;

import java.util.*;

public class Insertion1DArray {

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

    // Insertion at position loc
    public void insert(int item, int loc) {
        if (size == a.length) {
            System.out.println("Array overflow: Insertion fails...");
            return;
        }

        if (loc < 0 || loc > size) {
            System.out.println("Out of range: Insertion fails...");
            return;
        }

        // Shift elements to the right
        for (int i = size - 1; i >= loc; i--) {
            a[i + 1] = a[i];
        }

        a[loc] = item;
        size++;

        System.out.println("After insertion:");
        System.out.println("Capacity = " + a.length + " Size = " + size);
        print();
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
        Insertion1DArray obj = new Insertion1DArray();

        System.out.print("Enter the number of elements: ");
        int n = in.nextInt();
        obj.create(n);

        System.out.print("Enter the new number to be inserted: ");
        int item = in.nextInt();

        System.out.print("At position? ");
        int pos = in.nextInt();

        obj.insert(item, pos);
    }
}

