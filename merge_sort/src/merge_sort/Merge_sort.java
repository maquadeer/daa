
package merge_sort;

import java.util.Random;

public class Merge_sort {
    public void merge(int a[], int low, int mid, int high) {
        int[] b = new int[a.length];
        int h = low, i = low, j = mid + 1, k;

        while (h <= mid && j <= high) {
            if (a[h] <= a[j]) {
                b[i] = a[h];
                h++;
            } else {
                b[i] = a[j];
                j++;
            }
            i++;
        }

        if (h > mid) {
            for (k = j; k <= high; k++) {
                b[i] = a[k];
                i++;
            }
        } else {
            for (k = h; k <= mid; k++) {
                b[i] = a[k];
                i++;
            }
        }

        for (k = low; k <= high; k++)
            a[k] = b[k];
    }

    public void MergeSort(int a[], int low, int high) {
        int mid;
        if (low < high) {
            mid = (low + high) / 2;
            MergeSort(a, low, mid);
            MergeSort(a, mid + 1, high);
            merge(a, low, mid, high);
        }
    }

    public void display(int a[], int n) {
        for (int i = 0; i < n; i++)
            System.out.print("\n Element[" + i + "] = " + a[i]);
    }

    public static void main(String[] args) {
        int n = 100000;
        int[] a = generateRandomArray(n);
        Merge_sort ms = new Merge_sort();

        long startTime = System.nanoTime();
        ms.MergeSort(a, 0, n - 1);
        long endTime = System.nanoTime();
        long executionTime = endTime - startTime;

        System.out.println("\n " + n + " Elements after sorting are :");
        ms.display(a, n);
        System.out.println("\nExecution Time: " + executionTime + " nanoseconds");
    }

    public static int[] generateRandomArray(int n) {
        int[] arr = new int[n];
        Random rand = new Random();
        for (int i = 0; i < n; i++) {
            arr[i] = rand.nextInt(1000); // 
        }
        return arr;
    }
}