package quick_sort_final;

import java.util.Random;

public class Quick_sort_final {
    int c;

    int partition(int arr[], int low, int high) {
        c++;

        int pivot = arr[(low + high) / 2];
        int i = low - 1;
        int j = high + 1;
        while (true) {
            do {
                i++;
            } while (arr[i] < pivot);
            do {
                j--;
            } while (arr[j] > pivot);
            if (i >= j)
                return j;
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }

    void sort(int arr[], int low, int high) {
        if (low < high) {
            int q = partition(arr, low, high);
            sort(arr, low, q);
            sort(arr, q + 1, high);
        }
    }

    void print(int arr[], int n) {
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
        System.out.println("count of partition function calls: " + c);
    }

    public static void main(String[] args) {

        int n = 100000;
        int[] a = generateRandomArray(n);
        Quick_sort_final ms = new Quick_sort_final();

        long startTime = System.nanoTime();
        ms.sort(a, 0, n - 1);
        long endTime = System.nanoTime();
        long executionTime = endTime - startTime;

        System.out.println("\n " + n + " Elements after sorting are :");
        ms.print(a, n);
        System.out.println("\nExecution Time: " + executionTime + " nanoseconds");

    }
    public static int[] generateRandomArray(int n) {
        int[] a = new int[n];
        Random rand = new Random();
        for (int i = 0; i < n; i++) {
            a[i] = rand.nextInt(1000); // 
        }
        return a;
    }
}
