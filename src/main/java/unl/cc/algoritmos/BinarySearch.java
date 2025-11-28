package unl.cc.algoritmos;

public class BinarySearch {

    // --------------------------
    // 1. Búsqueda binaria clásica
    // --------------------------
    public static int binarySearch(int[] a, int key) {
        int low = 0;
        int high = a.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (a[mid] == key) {
                return mid;
            } else if (key < a[mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return -1; //No encuentra nada
    }

    // --------------------------------
    // 2. lowerBound — Encuentra el primer valor [1,1,1,2] regresa la primera posición por decir el 0 valor 1 xd
    // --------------------------------
    public static int lowerBound(int[] a, int key) {
        int low = 0;
        int high = a.length;

        while (low < high) {
            int mid = low + (high - low) / 2;

            if (a[mid] < key) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }

        return low;
    }

    // --------------------------------
    // 3. upperBound — Ponemos una Key por ejemplo 4 y debe buscar el valor mayor a este. [1,4,5,7] regresa pos 2 valor 5
    // --------------------------------
    public static int upperBound(int[] a, int key) {
        int low = 0;
        int high = a.length;

        while (low < high) {
            int mid = low + (high - low) / 2;

            if (a[mid] <= key) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }

        return low;
    }
}

