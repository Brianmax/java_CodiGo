# Ejercicios (Fecha limite: 23 agosto)
# Ejercicio 1
Determinar la cantidad de dinero que recibirá un trabajador por concepto de las horas extras trabajadas en una empresa. Sabiendo que cuando las horas de trabajo exceden de 40, el resto se considera como horas extra y estas se pagan al doble de una hora normal cuando no exceden las 8 horas; si las horas extras exceden de 8, se pagan las primeras 8 al doble de lo que se paga por una hora normal y el resto al triple. El trabajador cobra por hora $40.
### Ejemplo de entrada
```
40
```
### Ejemplo de salida
```
$1600.0
```
### Ejemplo de entrada
```
48
```
### Ejemplo de salida
```
$2240.0
```
### Ejemplo de entrada
```
53
```
### Ejemplo de salida
```
$2840.0
```
# Ejercicio 2
Se le pide implementar un sistema de ingreso digital para una fiesta de quince años. Para ello, se han determinado una serie de reglas. Todas las personas con edades mayores o iguales a 15 años solo pueden entrar si traen regalos. Los jóvenes menores de 15 años entran gratis a la fiesta. Implemente una aplicación que permita ingresar la edad de la persona y determine si puede pasar o no.

### Ejemplo de entrada
```bash
Ingrese la edad del usuario:
23
Inserte 1 si el invitado trajo regalo; caso contrario, inserte 0:
1
```
En este caso, dado que la persona tiene una edad superior a los 15 años, es necesario llevar a cabo una validación adicional.
### Ejemplo de salida
```bash
El invitado sí puede ingresar a la fiesta.
```
### Ejemplo de entrada
```bash
Ingrese la edad del usuario:
13
```
### Ejemplo de salida
```bash
El invitado si puede ingresar a la fiesta
```
# Ejercicio 3
Implemente una aplicación que permita calcular el pago que debe realizar una familia por el consumo de agua potable. Se sabe que existe un pago fijo de $10.00 y que los primeros 50 litros de agua no tienen costo. Entre 51 y 200 litros se cobra $0.5 por litro, y más de 200 litros a $1.5 por litro.
### Ejemplo de entrada
```
30
```
### Ejemplo de salida
```
$10.00
```
Pago fijo.
### Ejemplo de entrada
```
120
```
### Ejemplo de salida
```
$65.00
```
Consumo entre 51 y 200
### Ejemplo de entrada
```
250
```
### Ejemplo de salida
```
$205.00
```
# Ejercicio 4
Escriba un programa que reciba un número `n` e imprima los números impares menores a `n`.

### Ejemplo de entrada
```bash
6
```
### Ejemplo de salida
```bash
1
3
5
```
# Ejercicio 5
Escriba un programa que reciba un número `n`, que será el tamaño de un array que se creará y llenará con números aleatorios. Puede usar la clase Random para generar los números aleatorios. Luego, imprima los elementos del array.

### Ejemplo de entrada
```bash
5
```
### Ejemplo de salida
```bash
El elemento 0 es: 3
El elemento 1 es: 8
El elemento 2 es: 15
El elemento 3 es: 90
El elemento 4 es: 189
```
Puede seguir este tutorial: [Generar números aleatorios en Java](https://www.geeksforgeeks.org/generating-random-numbers-in-java/)

# Ejercicio 6
Dado un valor `n`, genere la siguiente secuencia:
### Ejemplo de entrada
```bash
5
```
### Ejemplo de salida

```
*
* *
* * *
* * * *
* * * * *
```
# Ejercicio 7
La operación factorial se define de la siguiente manera: $5!=5\times4\times3\times2\times1$. Cree una clase Factorial que tenga un método llamado `resolverFactorial` que reciba un valor `n`, donde `n` es el valor del factorial a calcular.

### Ejemplo de entrada
```
5
```
Donde 5 es el valor a calcular: $5!=5\times4\times3\times2\times1=120$

### Ejemplo de salida
```
120
```

# Ejercicio 8
Escriba un programa que reciba un valor `n`, que será el tamaño de un array que se inicializará y llenará. Luego, encuentre cuál es el valor más grande.
### Ejemplo de entrada

```
5
```
Un posible array podria ser {2,31,34,1,0}
### Ejemplo de salida
```
34
```
Imprima el array previamente para poder demostrar el resultado.
# Ejercicio 9
Escriba un programa que reciba un valor `n`, que será el tamaño de un array que se inicializará y llenará. Posteriormente, invierta el array (sin usar clases como ArrayList o similares).

### Ejemplo de entrada
```
5
```
Un posible array podria ser $[3,1,4,0,33]$.
### Ejemplo de salida

```
33 0 4 1 3
```
La salida debe ser tal como se muestra en el ejemplo, no de esta forma:
```
33
0
4
1
3
```
# Ejercicio 10
Escriba un programa en el que el usuario debe adivinar un número aleatorio entre 1 y 100. El programa proporcionará pistas si el número es demasiado alto o demasiado bajo. El juego continuará hasta que el jugador adivine correctamente el número. Al final, imprima el número y la cantidad de intentos realizados.

### Ejemplo del juego
Número a adivinar: 30.
```
20
"Número demasiado bajo, intenta nuevamente"
39
"Número demasiado alto, intenta nuevamente.
30
"¡Felicidades! ¡Haz adivinado el número!
```

# Ejercicio 11
Crea una jerarquía de clases de figuras geométricas utilizando la herencia y demuestra la encapsulación y el polimorfismo:

1. Figura: Crea una clase Figura con campos privados para el color y si está llena (un booleano que indica si la figura está rellenada con color). Proporciona métodos para obtener y establecer estos campos.
2. Círculo: Crea una clase Círculo que herede de Figura. Debe tener un campo privado para el radio. Implementa constructores y métodos apropiados para obtener y establecer el radio, y calcular el área y el perímetro del círculo.
3. Rectángulo: Crea una clase Rectángulo que herede de Figura. Debe tener campos privados para el ancho y la altura. Implementa constructores y métodos apropiados para obtener y establecer el ancho y la altura, y calcular el área y el perímetro del rectángulo.
4. Triángulo: Crea una clase Triángulo que herede de Figura. Debe tener campos privados para las longitudes de los lados (a, b y c). Implementa constructores y métodos apropiados para obtener y establecer las longitudes de los lados, y calcular el área y el perímetro del triángulo utilizando la fórmula de Herón.

Crea una clase Principal para demostrar el uso de tu jerarquía de figuras:

1. En el método main, crea instancias de círculos, rectángulos y triángulos.
2. Establece propiedades para estas figuras (por ejemplo, color, si está llena, radio, ancho, altura, longitudes de los lados).
3. Calcula y muestra el área y el perímetro de cada figura utilizando el polimorfismo (es decir, llamando a los métodos de área y perímetro en las instancias de la clase base Figura).

[Generar getters y setters en Java](https://www.youtube.com/watch?v=gXvnHialu0s&ab_channel=makigas%3Aaprendeaprogramar)
# Ejercicio 12
Crea un sistema de biblioteca simple con las siguientes clases:

LibraryItem (ElementoBiblioteca): Esta clase debe representar un elemento genérico de biblioteca, como un libro o un DVD. Debe tener campos privados para el título, el ID del elemento y si está prestado. Proporciona métodos para obtener y establecer estos campos, y un método para mostrar los detalles del elemento.

Book (Libro): Esta clase debe heredar de LibraryItem. Debe tener un campo privado adicional para el autor. Implementa constructores y métodos apropiados para obtener y establecer el autor, y anula el método para mostrar los detalles del elemento para incluir información del autor.

DVD: Esta clase también debe heredar de LibraryItem. Debe tener campos privados adicionales para el director y la duración. Implementa constructores y métodos apropiados para obtener y establecer estos campos, y anula el método para mostrar los detalles del elemento para incluir información del director y la duración.

LibraryUser (UsuarioBiblioteca): Esta clase debe representar a un usuario de la biblioteca. Debe tener campos privados para el nombre, el ID de usuario y los elementos prestados. Proporciona métodos para obtener y establecer estos campos, y un método para mostrar los detalles del usuario.

Ahora, crea una clase Library (Biblioteca) que tenga una matriz o una colección para almacenar elementos de la biblioteca. Implementa métodos para agregar nuevos elementos, mostrar todos los elementos, prestar un elemento a un usuario (actualizando el estado de préstamo), y devolver un elemento (actualizando el estado de préstamo). Implementa la polimorfia permitiendo a los usuarios tomar en préstamo tanto libros como DVDs.

Finalmente, crea una clase Main para demostrar el uso de tu sistema de biblioteca. En el método principal, crea instancias de libros, DVDs y usuarios, agrega elementos a la biblioteca, presta elementos a usuarios y muestra los detalles de elementos y usuarios.
