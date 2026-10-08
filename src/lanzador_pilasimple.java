public class lanzador_pilasimple {
    public static void main(String[] args) {
        PilaSimple p = new PilaSimple();

        System.out.println("¿La pila estática está vacía? " + p.isEmpty()); // true

        System.out.println("\n=== INSERTANDO EN PILA ESTÁTICA ===");
        p.push(10);
        p.push(20);
        p.push(30);
        p.mostrar();

        // Consultando el tope actual con peek
        System.out.println();
        p.peek(); // Debe mostrar 30

        // Verificando si está llena (su capacidad es de 5)
        System.out.println("¿La pila estática está llena? " + p.isFull()); // false

        System.out.println("\n=== SACANDO ELEMENTO ===");
        p.pop(); // Saca el 30
        p.mostrar();
    }
}