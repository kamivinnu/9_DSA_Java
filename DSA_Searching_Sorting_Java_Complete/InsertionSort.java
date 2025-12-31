
public class InsertionSort {
    public static void main(String[] args) {
        int[] a = {5, 3, 1, 4, 2};
        int n = a.length;

        for (int i = 1; i < n; i++) {
            int key = a[i];
            int j = i - 1;

            while (j >= 0 && a[j] > key) {
                a[j + 1] = a[j];
                j--;
            }
            a[j + 1] = key;
        }

        for (int x : a)
            System.out.print(x + " ");
    }
}
