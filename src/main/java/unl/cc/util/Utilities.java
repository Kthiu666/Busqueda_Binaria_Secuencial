package unl.cc.util;

public class Utilities {

    public static int[] insertionSort(int[] a) {
        for (int i = 1; i < a.length; i++) {
            int key = a[i];
            int j = i - 1;

            while (j >= 0 && a[j] > key) {
                a[j + 1] = a[j];
                j--;
            }

            a[j + 1] = key;
        }
        return a;
    }

    public static void printArray(int[] array) {

        for (int size : array) {
            System.out.print(size + " ");
        }

        System.out.println();
    }

}
