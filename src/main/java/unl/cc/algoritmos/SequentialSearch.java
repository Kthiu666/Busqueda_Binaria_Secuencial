package unl.cc.algoritmos;
import unl.cc.data.Node;

public class SequentialSearch {
    /**
     * Búsqueda secuencial estandar
     * Retorna el índice de la primera ocurrencia de key
     * Si no existe, retorna -1
     **/
    public static int search(int[] a, int key) {
        if (a == null || a.length == 0) return -1;

        for (int i = 0; i < a.length; i++) {
            if (a[i] == key) {
                return i;
            }
        }
        return -1;
    }


    // ============================================
    //  PRIMERA OCURRENCIA
    // ============================================

    /**
     * Retorna el índice de la primera aparición de key en el arreglo
     * Practicamente es lo mismo que la busqueda estandar pero le cambio el nombre de metodo para mayor legibilidad
     **/
    public static int primeraOcurrenciaArray(int[] a, int key) {
        if (a == null || a.length == 0) return -1; // Comprueba que el arreglo no este vacio

        for (int i = 0; i < a.length; i++) {
            if (a[i] == key) {
                return i + 1; // Compara el dato buscado con el del indice actual y si lo encuentra retorna inmediatamente el indice actual
            }
        }
        return -1; // En caso de no ser encontrado el dato buscado
    }

    /**
     * Retorna el primer nodo cuyo valor == key
     **/
    public static int primeraOcurrenciaSLL(Node head, int key) {
        Node aux = head; //apunta al primer nodo
        int index = 0; // numero de nodo

        while (aux != null) {
            if (aux.value == key) { // Si encuentra el primer dato buscado retorna inmediatamente el numero de nodo
                return index + 1;   // devuelve el número del nodo
            }
            aux = aux.next; // Si no encuentra en el nodo actual pasa al siguiente nodo
            index++; // aumenta el numero de nodo
        }
        return -1; // no encontrado
    }


    // ============================================
    //  ÚLTIMA OCURRENCIA
    // ============================================

    /**
     * Retorna el índice de la última aparición de key en el arreglo
     **/

    public static int ultimaOcurrenciaArray(int[] a, int key) {
        if (a == null || a.length == 0) return -1; //Comprueba que el arreglo no este vacio

        int lastIndex = -1; //Variable para guardar el ultimo indice encontrado

        for (int i = 0; i < a.length; i++) { // Se busca desde el indice 0
            if (a[i] == key) {
                lastIndex = i + 1; // Actualiza el indice de la ultima ocurrencia encontrada hasta terminar el arreglo
            }
        }
        return lastIndex;
    }

    /**
     * Retorna el último nodo cuyo valor == key
     **/
    public static int ultimaOcurrenciaSLL(Node head, int key) {
        Node aux = head; // Apunta al primer nodo
        int index = 0; // Numero de nodo
        int lastIndex = -1; // Variable para guardar el ultimo indice encontrado

        while (aux != null) { // Recorre todos los nodos
            if (aux.value == key) { // Compara el dato bscado con el nodo
                lastIndex = index + 1;   // se actualiza cada vez que aparece
            }
            aux = aux.next; // Pasa al siguiente nodo
            index++; // Aumenta el numero de nodo
        }
        return lastIndex; // si nunca apareció queda -1
    }
}
