package unl.cc.util;

public class Utilities {

    public static int[] insertionSort(int[] a) {
        for (int i = 1; i < a.length; i++) {
            int key = a[i];  // Tomamos el elemento actual
            int j = i - 1;

            while (j >= 0 && a[j] > key) {
                a[j + 1] = a[j];  // Desplazamos elementos mayores
                j--;
            }

            a[j + 1] = key;  // Insertamos el elemento en su lugar
        }
        return a;  // Devuelve el array ordenado
    }

    public static void printArray(int[] array) {
        for (int size : array) {
            System.out.print(size + " ");  // Imprime cada elemento seguido de espacio
        }
        System.out.println();  // Salto de línea al final
    }
}