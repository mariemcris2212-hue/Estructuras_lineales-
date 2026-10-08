Práctica 3: Pilas Estáticas y Dinámicas en Java

Estructura de Datos  
Alumno: Mariem Cristina Garcia Lopez   

Descripción de la Práctica
Esta práctica consiste en la implementación y complementación de dos tipos de estructuras de datos tipo Pila (LIFO - Last In, First Out):
1. Pila Estática (PilaSimple.java): Implementada mediante un arreglo unidimensional de tamaño fijo. Incluye control de desbordamiento, subdesbordamiento y los métodos auxiliares isEmpty(), isFull() y peek().
2. Pila Dinámica (PilaDinamica.java): Implementada mediante nodos enlazados y referencias. Su capacidad depende de la memoria RAM disponible, e incluye los métodos isEmpty() y peek().

Diferencias entre pila estatica y dinamica:
* Almacenamiento: La pila estática utiliza memoria contigua, mientras que la dinámica emplea nodos enlazados dispersos en memoria.
* Capacidad: La estática tiene un tamaño fijo definido al instanciarla; la dinámica es variable según la memoria disponible.
* Límite (isFull): La estática lo requiere para verificar si el arreglo alcanzó su tope; la pila dinámica no lo utiliza.

Instrucciones de Compilación y Ejecución
Para compilar y ejecutar el proyecto desde la terminal:
1. Ubicarse en la carpeta src del proyecto.
2. Compilar los archivos ejecutando:
   javac Nodo.java PilaSimple.java PilaDinamica.java Main.java lanzador_pilasimple.java
3. Ejecutar la Pila Estática con:
   java lanzador_pilasimple
4. Ejecutar la Pila Dinámica con:
   java Main

Ejemplos de Prueba de Ejecución y Salidas por Consola
A. Pila Estática (lanzador_pilasimple.java)
```text
¿La pila estática está vacía? true

=== INSERTANDO EN PILA ESTÁTICA ===
Metiste: 10
Metiste: 20
Metiste: 30
Pila actual: 10 20 30 

Elemento en el tope (peek): 30
¿La pila estática está llena? false

=== SACANDO ELEMENTO ===
Sacaste: 30
Pila actual: 10 20

¿La pila dinámica está vacía? true

=== INSERTANDO ELEMENTOS (PUSH) ===
Pila Dinámica (Cima -> Fondo): 30 20 10 

Cima actual (peek): 30

=== SACANDO UN ELEMENTO (POP) ===
Sacaste de la pila: 30

Pila Dinámica (Cima -> Fondo): 20 10 
¿La pila dinámica está vacía ahora? false
