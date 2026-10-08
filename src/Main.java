public class Main {
    public static void main(String[] args) {
        // 1. Creamos nuestra pila vacía usando el constructor
        PilaDinamica miPila = new PilaDinamica();

        // Probando isEmpty con la pila vacía
        System.out.println("¿La pila dinámica está vacía? " + miPila.isEmpty()); // true

        System.out.println("\n=== INSERTANDO ELEMENTOS (PUSH) ===");
        miPila.push(10);
        miPila.push(20);
        miPila.push(30);

        // Mostramos cómo quedó la torre
        miPila.mostrar(); // Debe mostrar: 30 20 10

        // Probando peek (consultar cima sin sacar)
        System.out.println();
        miPila.peek(); // Debe mostrar el 30

        System.out.println("\n=== SACANDO UN ELEMENTO (POP) ===");
        miPila.pop(); // Saca el 30

        // Mostramos cómo quedó después del pop
        System.out.println();
        miPila.mostrar(); // Debe mostrar: 20 10

        // Verificando estado final
        System.out.println("¿La pila dinámica está vacía ahora? " + miPila.isEmpty()); // false
    }
}