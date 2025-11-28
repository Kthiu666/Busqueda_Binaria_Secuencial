package unl.cc.data;

import unl.cc.data.Node;

public class Datasets {
    // Arrays de prueba para el taller
    public static int[] A = {1, 2, 3, 4, 5}; // Este array está ordenado de menor a mayor
    public static int[] B = {5, 4, 3, 2, 1}; // Este está desordenado, de mayor a menor
    public static int[] C = {3, 3, 3, 3, 3}; // Todos los elementos son iguales
    public static int[] D = {}; // Este array está vacío, no tiene elementos

    // Método para crear una SLL de prueba: 3 -> 1 -> 3 -> 2
    public static Node createSLL() {
        Node head = new Node(3);  // Primer nodo con valor 3
        head.next = new Node(1);  // Segundo nodo con 1
        head.next.next = new Node(3);  // Tercer nodo con 3
        head.next.next.next = new Node(2);  // Último nodo con 2
        return head;  // Devuelve la cabeza de la lista
    }
}