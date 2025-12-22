package generics;

import java.util.Arrays;

public class Generic1DArray<T> {

    private T[] x;
    private int size;

    // Varargs constructor to accept array elements
    @SafeVarargs
    public Generic1DArray(T... elements) {
        this.x = elements;
        this.size = elements.length;
    }

    // Recursive method to reverse the array
    public void reverse1D(int length) {
        if (length > 1) {
            T temp = x[size - length];
            x[size - length] = x[length - 1];
            x[length - 1] = temp;
            reverse1D(length - 1);
        }
    }

    @Override
    public String toString() {
        return Arrays.toString(x);
    }
}
