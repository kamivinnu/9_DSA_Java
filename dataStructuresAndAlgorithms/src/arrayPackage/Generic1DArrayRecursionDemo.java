package arrayPackage;

public class Generic1DArrayRecursionDemo {

    public static void main(String[] args) {

        // Case 1: Integer array
        Generic1DArray<Integer> intA = new Generic1DArray<>(1, 2, 3, 4, 5, 6);
        intA.reverse1D(6);
        System.out.println(intA);

        // Case 2: String array
        Generic1DArray<String> stringA = new Generic1DArray<>("A", "E", "I", "O", "U");
        stringA.reverse1D(5);
        System.out.println(stringA);
    }
}

