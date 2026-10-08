public class PilaSimple {
    int[] datos = new int[5]; // Capacidad fija de 5
    int tope = -1;            // Empieza vacía

    // 1. Meter dato (Push) // llenar la pila
    void push(int x) {
        if (tope < datos.length - 1) {
            tope++;
            datos[tope] = x;
            System.out.println("Metiste: " + x);
        } else {
            System.out.println("¡Pila llena!");
        }
    }

    // 2. Sacar dato (Pop)
    void pop() {
        if (tope >= 0) {
            System.out.println("Sacaste: " + datos[tope]);
            tope--;
        } else {
            System.out.println("¡Pila vacía!");
        }
    }

    // Ver la pila
    void mostrar() {
        System.out.print("Pila actual: ");
        for (int i = 0; i <= tope; i++) {
            System.out.print(datos[i] + " ");
        }
        System.out.println();
    }

    // 4. Verificar si la pila está vacía
    boolean isEmpty() {
        return tope == -1;
    }

    // 5. Verificar si el arreglo alcanzó su límite (exclusivo de pila estática)
    boolean isFull() {
        return tope == datos.length - 1;
    }

    // 6. Consultar el elemento en el tope sin eliminarlo
    int peek() {
        if (!isEmpty()) {
            System.out.println("Elemento en el tope (peek): " + datos[tope]);
            return datos[tope];
        } else {
            System.out.println("¡Pila vacía! No hay elementos para consultar.");
            return -1; // Valor centinela de error
        }
    }
}
