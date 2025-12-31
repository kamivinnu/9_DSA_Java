
public class SelectionSort {
    public static void main(String[] args) {
        int[] a = {5, 3, 1, 4, 2};
        int n = a.length;

        for (int i = 0; i < n - 1; i++) {
            int min = i;
            for (int j = i + 1; j < n; j++) {
                if (a[j] < a[min])
                    min = j;
            }
            int temp = a[i];
            a[i] = a[min];
            a[min] = temp;
        }

        for (int x : a)
            System.out.print(x + " ");
    }
}
