# Taller 7: Algoritmos de Búsqueda (Secuencial y Binaria)

**Asignatura:** Estructura de Datos
**Fecha:** 27 de Noviembre 2024

## 1. Descripción y Estructura
El proyecto implementa algoritmos de búsqueda, aplicadas tanto a Arreglos como a Listas Simplemente Enlazadas con esta estructura del código:
* `data/`: Definición de Arrays A, B, C, D y estructura Node.
* `algorithms/`: Implementación de lógica pura (Sequential, Binary, Predicates).
* `demo/`: Ejecución de pruebas y generación de tabla de evidencias.

## 2. Decisiones de Implementación

### A. Búsqueda con Centinela (Sentinel Search)
Se implementó en `SequentialSearch.java`.
* **Técnica:** Se coloca la clave buscada en la posición `n-1` (guardando el valor original) para eliminar la verificación de índice `i < n` dentro del bucle.
* **Comparación de Comparaciones :**
    * *Clásica:* 2 comparaciones por vuelta (índice y valor). Total: `2N + 1`.
    * *Centinela:* 1 comparación por vuelta (solo valor). Total: `N + 2`.
    * *Conclusión:* El centinela mejora el rendimiento en bajo nivel al reducir las instrucciones de salto a la mitad.

### B. Búsqueda Binaria
Implementada en `BinarySearch.java`.
* **Seguridad:** Se usó `int mid = low + (high - low) / 2` para evitar desbordamiento de enteros (Integer Overflow) en arrays grande.
* **Precondición:** Se asume que el array está ordenado .

## 3. Tabla de Evidencias
Al ejecutar `SearchDemo`, se obtiene:

```text// por terminar
Colección          | Algoritmo          | Key/Pred   | Resultado  | Nota
-------------------------------------------------------------------------------------
Array A (Desord)   | Seq. First         | 7          | 0          | O(n)
Array A (Desord)   | Centinela          | 7          | 0          | Optimizado
Array A (Desord)   | Seq. First         | 42         | -1         | O(n)
Array A (Desord)   | Centinela          | 42         | -1         | Optimizado
Array B (Ord)      | Binaria            | 5          | 2          | O(log n)
Array B (Ord)      | Binaria            | 42         | -1         | O(log n)
SLL (3-1-3-2)      | findFirst          | 3          | 3          | 1ra Ref
SLL (3-1-3-2)      | findLast           | 3          | 3          | Ultima Ref
SLL (3-1-3-2)      | findAll            | < 3        | [1 2]      | Nodos 1 y 2