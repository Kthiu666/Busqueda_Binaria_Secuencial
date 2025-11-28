package unl.cc.algoritmos;

import unl.cc.data.Node;
import java.util.function.IntPredicate;
import java.util.function.Predicate;

public class Predicates {
    // Estos son predicados para arrays, sirven para filtrar elementos según una condición
    public static IntPredicate isEven = x -> x % 2 == 0;  // Verifica si un número es par
    public static IntPredicate equalsKey(int key) { return x -> x == key; }  // Verifica si es igual a una clave dada
    public static IntPredicate lessThanThreshold(int threshold) { return x -> x < threshold; }  // Verifica si es menor a un umbral

    // Estos son predicados para nodos de la SLL, hacen lo mismo pero con el valor del nodo
    public static Predicate<Node> nodeIsEven = node -> node.value % 2 == 0;  // Para nodos con valor par
    public static Predicate<Node> nodeEqualsKey(int key) { return node -> node.value == key; }  // Para nodos igual a clave
    public static Predicate<Node> nodeLessThanThreshold(int threshold) { return node -> node.value < threshold; }  // Para nodos menor a umbral
}