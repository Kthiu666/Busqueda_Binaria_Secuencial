package unl.cc.algoritmos;
import unl.cc.data.Node;

import java.util.ArrayList;
import java.util.List;
import java.util.function.IntPredicate;
import java.util.function.Predicate;

public class SequentialSearch {
    /**
     * Búsqueda secuencial estandar
     * Retorna el índice de la primera ocurrencia de key
     * Si no existe, retorna -1
     **/
    public static int search(int[] array, int key) {
        if (array == null || array.length == 0) return -1;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == key) {
                return i;  // Recorre el array uno por uno hasta encontrar la clave
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
    public static int firstOccurrenceArray(int[] array, int key) {
        if (array == null || array.length == 0) return -1; // Comprueba que el arreglo no este vacio

        for (int i = 0; i < array.length; i++) {
            if (array[i] == key) {
                return i; // Compara el dato buscado con el del indice actual y si lo encuentra retorna inmediatamente el indice actual
            }
        }
        return -1; // En caso de no ser encontrado el dato buscado
    }

    /**
     * Retorna el primer nodo cuyo valor == key
     **/
    public static Node firstOccurrenceSLL(Node head, int key) {
        Node current = head; // apunta al primer nodo

        while (current != null) {
            if (current.value == key) { // Si encuentra el primer dato buscado retorna inmediatamente el nodo
                return current;   // devuelve el nodo encontrado
            }
            current = current.next; // Si no encuentra en el nodo actual pasa al siguiente nodo
        }
        return null; // no encontrado
    }


    // ============================================
    //  ÚLTIMA OCURRENCIA
    // ============================================

    /**
     * Retorna el índice de la última aparición de key en el arreglo
     **/

    public static int lastOccurrenceArray(int[] array, int key) {
        if (array == null || array.length == 0) return -1; //Comprueba que el arreglo no este vacio

        int lastIndex = -1; //Variable para guardar el ultimo indice encontrado

        for (int i = 0; i < array.length; i++) { // Se busca desde el indice 0
            if (array[i] == key) {
                lastIndex = i; // Actualiza el indice de la ultima ocurrencia encontrada hasta terminar el arreglo
            }
        }
        return lastIndex;
    }

    public static List<Integer> findAllArray(int[] array, IntPredicate p) {
        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < array.length; i++) {
            if (p.test(array[i])) {
                result.add(i);
            }
        }

        return result;
    }



    /**
     * Devuelve una lista de nodos que cumplen el predicado p.
     */
    public static List<Node> findAllSLL(Node head, Predicate<Node> p) {
        List<Node> result = new ArrayList<>();
        Node current = head;

        while (current != null) {
            if (p.test(current)) {
                result.add(current);
            }
            current = current.next;
        }

        return result;
    }


    /**
     * Retorna el último nodo cuyo valor == key
     **/
    public static Node lastOccurrenceSLL(Node head, int key) {
        Node current = head; // Apunta al primer nodo
        Node lastNode = null; // Variable para guardar el ultimo nodo encontrado

        while (current != null) { // Recorre todos los nodos
            if (current.value == key) { // Compara el dato bscado con el nodo
                lastNode = current;   // se actualiza cada vez que aparece
            }
            current = current.next; // Pasa al siguiente nodo
        }
        return lastNode; // si nunca apareció queda null
    }

    /**
     * Búsqueda secuencial con centinela.
     * Retorna el índice de la primera aparición de key.
     * Si no existe, retorna -1.
     */
    public static int sentinelSearch(int[] array, int key) {
        int n = array.length;

        // Si el arreglo está vacío no hay nada que buscar
        if (n == 0) return -1;

        // Guardamos el último valor
        int last = array[n - 1];

        // Colocamos el centinela (key) al final
        array[n - 1] = key;

        int i = 0;

        // NO comprobamos límites, porque el centinela garantiza que el bucle termine
        while (array[i] != key) {
            i++;
        }

        // Restauramos el valor original
        array[n - 1] = last;

        // Caso 1: coincidencia real (índice < n - 1)
        if (i < n - 1) {
            return i;
        }

        // Caso 2: coincidencia en la última posición (verificamos si era real)
        if (last == key) {
            return n - 1; // el último elemento sí era la key
        }

        // Caso 3: coincidencia solo por centinela
        return -1;
    }


}
