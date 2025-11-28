package unl.cc.util;

import unl.cc.data.Node;

public class SinglyLinkedList {

    private Node head; //Cabeza de la SLL

    //Crea  un nnuevo nodo con el valor dado
    public void addLast(int value) {
        Node nuevo = new Node(value);
        // Sila lista esta vacia el valor dado es la nueva cabeza de la SLL
        if (head == null) {
            head = nuevo;
            return;
        }
        //Si la lista no esta vacia busca el ultimo nodo para agregarlo a la SLL
        Node aux = head;
        while (aux.next != null) {
            aux = aux.next;
        }
        aux.next = nuevo;
    }

    //Retorna la cabeza de la SLL
    public Node getHead() {
        return head;
    }
}
