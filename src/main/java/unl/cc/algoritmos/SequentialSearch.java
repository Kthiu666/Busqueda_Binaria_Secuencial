package unl.cc.algoritmos;

public class SequentialSearch {

    // --- Búsqueda con Centinela ---
    public static int sentinelSearch(int[] a, int key) {
        if (a == null || a.length == 0) return -1;

        int n = a.length;
        int last = a[n - 1]; //  Guardar el último elemento
        a[n - 1] = key;      //  Poner el centinela (la clave) al final

        int i = 0;
        //  Bucle sin chequeo de límites (i < n), solo chequeo de clave
        while (a[i] != key) {
            i++;
        }

        a[n - 1] = last; // Restaurar el valor original

        // Verificar si encontramos el dato real o el centinela
        // Si i < n-1, lo encontramos antes del final.
        // Si i == n-1, debemos verificar si el valor original era la clave.
        if (i < n - 1 || last == key) {
            return i;
        }

        return -1;
    }

}
