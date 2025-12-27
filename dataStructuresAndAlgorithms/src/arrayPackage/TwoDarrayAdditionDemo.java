package arrayPackage;

public class TwoDarrayAdditionDemo {

    public static void main(String[] args) {

        // Create first 3x4 matrix
        TwoDarray x = new TwoDarray(3, 4);
        System.out.println("Enter elements of matrix X:");
        x.initialize();

        // Create second 3x4 matrix
        TwoDarray y = new TwoDarray(3, 4);
        System.out.println("Enter elements of matrix Y:");
        y.initialize();

        System.out.println("\nMatrix X (Row-Major):");
        x.printRowMajor();

        System.out.println("\nMatrix X (Column-Major):");
        x.printColMajor();

        // Addition
        TwoDarray z = x.addition(y);
        if (z != null) {
            System.out.println("\nAddition Result:");
            z.printRowMajor();
        }

        // For multiplication, dimensions must be compatible.
        // Example: 3x4 * 4x3
        TwoDarray m1 = new TwoDarray(3, 4);
        System.out.println("\nEnter elements of matrix M1 (3x4):");
        m1.initialize();

        TwoDarray m2 = new TwoDarray(4, 3);
        System.out.println("\nEnter elements of matrix M2 (4x3):");
        m2.initialize();

        TwoDarray m3 = m1.multiplication(m2);
        if (m3 != null) {
            System.out.println("\nMultiplication Result:");
            m3.printRowMajor();
        }
    }
}

