package unl.cc.data;

public class Node {
    public int value;  // Aquí guardamos el valor del nodo, como un número entero
    public Node next;  // Este apunta al siguiente nodo en la lista, o null si es el último

    public Node(int value) {
        this.value = value;  // Al crear el nodo, le ponemos el valor que nos pasan
        this.next = null;    // Inicialmente, no apunta a nada
    }

    @Override
    public String toString() {
        return String.valueOf(value);  // Para imprimir el nodo, mostramos su valor
    }
}
