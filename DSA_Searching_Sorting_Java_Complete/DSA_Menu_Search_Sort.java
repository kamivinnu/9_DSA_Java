
import java.util.*;

public class DSA_MenuProgram {

    static Scanner sc = new Scanner(System.in);

    // ---------- Linear Search ----------
    static void linearSearch(int[] a, int key) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == key) {
                System.out.println("Element found at position: " + (i + 1));
                return;
            }
        }
        System.out.println("Element not found");
    }

    // ---------- Binary Search ----------
    static void binarySearch(int[] a, int key) {
        Arrays.sort(a);
        int low = 0, high = a.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (a[mid] == key) {
                System.out.println("Element found at position: " + (mid + 1));
                return;
            } else if (key < a[mid])
                high = mid - 1;
            else
                low = mid + 1;
        }
        System.out.println("Element not found");
    }

    // ---------- Insertion Sort ----------
    static void insertionSort(int[] a) {
        for (int i = 1; i < a.length; i++) {
            int key = a[i], j = i - 1;
            while (j >= 0 && a[j] > key) {
                a[j + 1] = a[j];
                j--;
            }
            a[j + 1] = key;
        }
    }

    // ---------- Bubble Sort ----------
    static void bubbleSort(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = 0; j < a.length - i - 1; j++) {
                if (a[j] > a[j + 1]) {
                    int t = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = t;
                }
            }
        }
    }

    // ---------- Selection Sort ----------
    static void selectionSort(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < a.length; j++)
                if (a[j] < a[min]) min = j;

            int t = a[i];
            a[i] = a[min];
            a[min] = t;
        }
    }

    // ---------- Heap Sort ----------
    static void heapSort(int[] a) {
        int n = a.length;
        for (int i = n / 2 - 1; i >= 0; i--)
            heapify(a, n, i);

        for (int i = n - 1; i > 0; i--) {
            int t = a[0];
            a[0] = a[i];
            a[i] = t;
            heapify(a, i, 0);
        }
    }

    static void heapify(int[] a, int n, int i) {
        int largest = i;
        int l = 2 * i + 1, r = 2 * i + 2;

        if (l < n && a[l] > a[largest]) largest = l;
        if (r < n && a[r] > a[largest]) largest = r;

        if (largest != i) {
            int t = a[i];
            a[i] = a[largest];
            a[largest] = t;
            heapify(a, n, largest);
        }
    }

    // ---------- Merge Sort ----------
    static void mergeSort(int[] a, int l, int r) {
        if (l < r) {
            int m = (l + r) / 2;
            mergeSort(a, l, m);
            mergeSort(a, m + 1, r);
            merge(a, l, m, r);
        }
    }

    static void merge(int[] a, int l, int m, int r) {
        int n1 = m - l + 1, n2 = r - m;
        int[] L = new int[n1];
        int[] R = new int[n2];

        for (int i = 0; i < n1; i++) L[i] = a[l + i];
        for (int j = 0; j < n2; j++) R[j] = a[m + 1 + j];

        int i = 0, j = 0, k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) a[k++] = L[i++];
            else a[k++] = R[j++];
        }
        while (i < n1) a[k++] = L[i++];
        while (j < n2) a[k++] = R[j++];
    }

    static void printArray(int[] a) {
        for (int x : a)
            System.out.print(x + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int[] a = new int[n];

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++)
            a[i] = sc.nextInt();

        while (true) {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Linear Search");
            System.out.println("2. Binary Search");
            System.out.println("3. Insertion Sort");
            System.out.println("4. Bubble Sort");
            System.out.println("5. Selection Sort");
            System.out.println("6. Heap Sort");
            System.out.println("7. Merge Sort");
            System.out.println("8. Exit");

            System.out.print("Enter choice: ");
            int ch = sc.nextInt();

            int[] temp = Arrays.copyOf(a, a.length);

            switch (ch) {
                case 1:
                    System.out.print("Enter key: ");
                    linearSearch(temp, sc.nextInt());
                    break;
                case 2:
                    System.out.print("Enter key: ");
                    binarySearch(temp, sc.nextInt());
                    break;
                case 3:
                    insertionSort(temp);
                    printArray(temp);
                    break;
                case 4:
                    bubbleSort(temp);
                    printArray(temp);
                    break;
                case 5:
                    selectionSort(temp);
                    printArray(temp);
                    break;
                case 6:
                    heapSort(temp);
                    printArray(temp);
                    break;
                case 7:
                    mergeSort(temp, 0, temp.length - 1);
                    printArray(temp);
                    break;
                case 8:
                    System.exit(0);
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}
