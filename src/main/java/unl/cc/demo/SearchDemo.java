package unl.cc.demo;

import unl.cc.algoritmos.BinarySearch;
import unl.cc.util.Utilities;
import unl.cc.data.Node;
import unl.cc.util.SinglyLinkedList;
import unl.cc.algoritmos.SequentialSearch;

public class SearchDemo {
    public static void main(String[] args) {

        // ====== Array Primera y Ultima Ocurrencia=======
        int[] A = {3, 7, 5, 7, 2};
        /*Buscamos primera ocurrencia*/
        System.out.println("Primera ocurrencia de 7: " + SequentialSearch.primeraOcurrenciaArray(A, 7));
        /*Buscamos ultima ocurrencia*/
        System.out.println("Última ocurrencia de 7: " + SequentialSearch.ultimaOcurrenciaArray(A, 7));

        // ====== SLL Primera y Ultima Ocurrencia=======

        // Creamos la SLL
        SinglyLinkedList list = new SinglyLinkedList();
        list.addLast(3);
        list.addLast(1);
        list.addLast(3);
        list.addLast(2);

        Node head = list.getHead();
        /*Buscamos primera ocurrencia*/
        System.out.println("Primer nodo con 3: " + SequentialSearch.primeraOcurrenciaSLL(head, 3));
        /*Buscamos ultima ocurrencia*/
        System.out.println("Último nodo con 3: " + SequentialSearch.ultimaOcurrenciaSLL(head, 3));
    }
}
