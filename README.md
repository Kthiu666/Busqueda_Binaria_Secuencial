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

----- BÚSQUEDA SECUENCIAL -----

Clave = 7
Array A: primera=-1, última=-1
Array B: primera=-1, última=-1
Array C: primera=-1, última=-1
Array D: primera=-1, última=-1

----- BÚSQUEDA CON CENTINELA -----

Clave = 7
Array A: sentinelSearch=-1
Array B: sentinelSearch=-1
Array C: sentinelSearch=-1
Array D: sentinelSearch=-1

----- BINARY SEARCH -----
Array A (ordenado): [1, 2, 3, 4, 5]

Key 7  -> binarySearch = -1
Key 5  -> binarySearch = 4
Key 2  -> binarySearch = 1
Key 42 -> binarySearch = -1

----- LOWERBOUND / UPPERBOUND -----

key=1  -> lowerBound=0, upperBound=1
key=2  -> lowerBound=1, upperBound=2
key=3  -> lowerBound=2, upperBound=3
key=4  -> lowerBound=3, upperBound=4
key=6  -> lowerBound=5, upperBound=5
key=10 -> lowerBound=5, upperBound=5

----- FINDALL EN ARRAY -----

Array A: [1, 2, 3, 4, 5]
Valores < 3 en A -> índices: [0, 1]

----- LISTA ENLAZADA (SLL) -----

Lista: 3 → 1 → 3 → 2

Primera ocurrencia de 3: 3
Última ocurrencia de 3 : 3
Nodos < 3: [1, 2]

----- INSERTION SORT -----

Original: [5, 4, 3, 2, 1]
Ordenado: [1, 2, 3, 4, 5]
