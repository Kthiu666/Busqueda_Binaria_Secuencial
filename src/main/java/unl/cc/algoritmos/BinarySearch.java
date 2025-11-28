package unl.cc.algoritmos;

public class BinarySearch {

    // --------------------------
    // 1. Búsqueda binaria clásica
    // --------------------------
    public static int binarySearch(int[] array, int key) {
        int low = 0;
        int high = array.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;  // Calculamos el medio para dividir el array en dos partes

            if (array[mid] == key) {
                return mid;  // Si encontramos la clave en el medio, devolvemos su posición
            } else if (key < array[mid]) {
                high = mid - 1;  // Si la clave es menor, buscamos en la mitad izquierda
            } else {
                low = mid + 1;  // Si es mayor, en la mitad derecha
            }
        }

        return -1; //No encuentra nada
    }

    // --------------------------------
    // 2. lowerBound — Encuentra el primer valor [1,1,1,2] regresa la primera posición por decir el 0 valor 1 xd
    // --------------------------------
    public static int lowerBound(int[] array, int key) {
        int low = 0;
        int high = array.length;

        while (low < high) {
            int mid = low + (high - low) / 2;  // Divide el array para encontrar el límite inferior

            if (array[mid] < key) {
                low = mid + 1;  // Si el valor en medio es menor, avanzamos a la derecha
            } else {
                high = mid;  // Si no, reducimos el rango a la izquierda
            }
        }

        return low;  // Devuelve la posición donde debería estar el primer valor >= key
    }

    // --------------------------------
    // 3. upperBound — Ponemos una Key por ejemplo 4 y debe buscar el valor mayor a este. [1,4,5,7] regresa pos 2 valor 5
    // --------------------------------
    public static int upperBound(int[] array, int key) {
        int low = 0;
        int high = array.length;

        while (low < high) {
            int mid = low + (high - low) / 2;  // Divide para encontrar el límite superior

            if (array[mid] <= key) {
                low = mid + 1;  // Si el valor en medio es <= key, avanzamos
            } else {
                high = mid;  // Si no, reducimos el rango
            }
        }

        return low;  // Devuelve la posición del primer valor > key
    }
}