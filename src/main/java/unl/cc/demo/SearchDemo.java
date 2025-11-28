package unl.cc.demo;

import unl.cc.data.Datasets;
import unl.cc.data.Node;
import unl.cc.algoritmos.SequentialSearch;
import unl.cc.algoritmos.BinarySearch;
import unl.cc.algoritmos.Predicates;
import unl.cc.util.Utilities;
import unl.cc.data.Node;
import unl.cc.util.SinglyLinkedList;
import unl.cc.algoritmos.SequentialSearch;

import java.util.Arrays;
import java.util.List;

public class SearchDemo {

    public static void main(String[] args) {

        System.out.println("====================================");
        System.out.println("     DEMOSTRACIÓN COMPLETA UNL");
        System.out.println("====================================\n");

        ejecutarSecuencial();
        ejecutarCentinela();
        ejecutarBinary();
        ejecutarBounds();
        ejecutarFindAll();
        ejecutarSLL();
        ejecutarInsertionSort();

        System.out.println("\n=========== FIN DEMO ===========\n");
    }

    // ==========================================================
    // 1. Pruebas de búsqueda secuencial
    // ==========================================================
    private static void ejecutarSecuencial() {
        System.out.println("----- BÚSQUEDA SECUENCIAL -----");

        int[] keys = {7, 5, 2, 42};
        int[][] arrays = {Datasets.A, Datasets.B, Datasets.C, Datasets.D};
        String[] names = {"A", "B", "C", "D"};

        for (int key : keys) {
            System.out.println("\nClave = " + key);
            for (int i = 0; i < arrays.length; i++) {
                int[] arr = arrays[i];
                int first = SequentialSearch.firstOccurrenceArray(arr, key);
                int last = SequentialSearch.lastOccurrenceArray(arr, key);

                System.out.println("Array " + names[i] +
                        ": primera=" + first +
                        ", última=" + last);
            }
        }
    }

    // ==========================================================
    // 2. Búsqueda con centinela
    // ==========================================================
    private static void ejecutarCentinela() {
        System.out.println("\n----- BÚSQUEDA CON CENTINELA -----");

        int[] keys = {7, 5, 2, 42};
        int[][] arrays = {Datasets.A, Datasets.B, Datasets.C, Datasets.D};
        String[] names = {"A", "B", "C", "D"};

        for (int key : keys) {
            System.out.println("\nClave = " + key);

            for (int i = 0; i < arrays.length; i++) {
                int pos = SequentialSearch.sentinelSearch(arrays[i].clone(), key);
                System.out.println("Array " + names[i] +
                        ": sentinelSearch=" + pos);
            }
        }
    }

    // ==========================================================
    // 3. Búsqueda binaria (solo arreglo A)
    // ==========================================================
    private static void ejecutarBinary() {
        System.out.println("\n----- BINARY SEARCH -----");
        System.out.println("Array A (ordenado): " + Arrays.toString(Datasets.A));

        int[] keys = {7, 5, 2, 42};

        for (int key : keys) {
            int pos = BinarySearch.binarySearch(Datasets.A, key);
            System.out.println("Key " + key + " -> binarySearch = " + pos);
        }
    }

    // ==========================================================
    // 4. lowerBound / upperBound
    // ==========================================================
    private static void ejecutarBounds() {
        System.out.println("\n----- LOWERBOUND / UPPERBOUND -----");

        int[] arr = Datasets.A;
        int[] keys = {1, 2, 3, 4, 6, 10};

        for (int key : keys) {
            int lb = BinarySearch.lowerBound(arr, key);
            int ub = BinarySearch.upperBound(arr, key);

            System.out.println("key=" + key +
                    " -> lowerBound=" + lb +
                    ", upperBound=" + ub);
        }
    }

    // ==========================================================
    // 5. findAll
    // ==========================================================
    private static void ejecutarFindAll() {
        System.out.println("\n----- FINDALL EN ARRAY -----");

        int[] arr = Datasets.A;
        List<Integer> menores3 = SequentialSearch.findAllArray(arr, Predicates.lessThanThreshold(3));

        System.out.println("Array A: " + Arrays.toString(arr));
        System.out.println("Valores < 3 en A -> índices: " + menores3);
    }

    // ==========================================================
    // 6. Pruebas en lista enlazada
    // ==========================================================
    private static void ejecutarSLL() {
        System.out.println("\n----- LISTA ENLAZADA (SLL) -----");

        Node head = Datasets.createSLL();
        System.out.println("Lista: 3 → 1 → 3 → 2");

        Node first = SequentialSearch.firstOccurrenceSLL(head, 3);
        Node last = SequentialSearch.lastOccurrenceSLL(head, 3);

        System.out.println("Primera ocurrencia de 3: " + first);
        System.out.println("Última ocurrencia de 3 : " + last);

        List<Node> menores3 = SequentialSearch.findAllSLL(head,
                Predicates.nodeLessThanThreshold(3));

        System.out.println("Nodos < 3: " + menores3);
    }

    // ==========================================================
    // 7. Ordenamiento por inserción
    // ==========================================================
    private static void ejecutarInsertionSort() {
        System.out.println("\n----- INSERTION SORT -----");

        int[] arr = Datasets.B.clone();

        System.out.println("Original: " + Arrays.toString(arr));
        int[] sorted = Utilities.insertionSort(arr);

        System.out.println("Ordenado: " + Arrays.toString(sorted));
    }
}
