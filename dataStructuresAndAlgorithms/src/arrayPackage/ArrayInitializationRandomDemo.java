package arrayPackage;

import java.util.*;

class ArrayInitializationRandomDemo {

    static int[] a = new int[100];   // Declaring a 1D array of size 100
    static int size;
    static int MIN = 1, MAX = 100;   // Range of the numbers

    // Generating a random number between min and max
    static int generateRandom(int min, int max) {
        return (int) (Math.random() * ((max - min) + 1)) + min;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); // To read the size from the user

        System.out.print("Enter size < 100: ");
        size = in.nextInt(); // read size

        if (size > 100 || size < 0) {
            System.out.println("Invalid size!");
            return;
        }

        for (int i = 0; i < size; i++) {
            a[i] = generateRandom(MIN, MAX);
        }

        System.out.println("Capacity = " + a.length + ", Size = " + size);

        // Display only initialized part
        
        System.out.println("Array elements: " + Arrays.toString(Arrays.copyOf(a, size)));
      
//      System.out.println("Array elements: " + Arrays.toString(a));

        in.close();
    }
}
