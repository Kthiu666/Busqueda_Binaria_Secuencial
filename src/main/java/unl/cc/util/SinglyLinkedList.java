package unl.cc.util;

import unl.cc.data.Node;

public class SinglyLinkedList {

    private Node head; // Cabeza de la SLL

    // Crea un nuevo nodo con el valor dado
    public void addLast(int value) {
        Node newNode = new Node(value);  // Creamos un nuevo nodo con el valor
        // Si la lista está vacía, el valor dado es la nueva cabeza de la SLL
        if (head == null) {
            head = newNode;
            return;
        }
        // Si la lista no está vacía, busca el último nodo para agregarlo a la SLL
        Node current = head;
        while (current.next != null) {
            current = current.next;  // Avanzamos hasta el último nodo
        }
        current.next = newNode;  // Agregamos el nuevo nodo al final
    }

    // Retorna la cabeza de la SLL
    public Node getHead() {
        return head;  // Devuelve el primer nodo de la lista
    }
}
