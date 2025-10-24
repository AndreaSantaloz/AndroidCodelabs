# Propietaria
Andrea Santana López
## Kotlin playground
https://play.kotlinlang.org/
## Bases de Programación y Comienzos de Kotlin
Un programa como una serie de instrucciones para que una computadora o un dispositivo móvil realicen una acción, como mostrar un mensaje a un usuario o calcular el costo de los artículos en un carrito de compras. Las instrucciones paso a paso para lo que la computadora debe hacer se llama código.Para escribir y editar tu código, debes usar una herramienta llamada editor de código para los codelabs se usará un editor de código interactivo llamado Playground de Kotlin
El primer programa que todo informático hace es imprimir "Hola mundo" por lo que primero que veré es como realizar un "Hola Mundo" en Kotlin.
```
fun main() {
    println("Hello, world!!!")
}
```
Aquí tenemos una función llamada main que utiliza el comando println para mostrar el mensaje en la consola de comandos "CMD" en windows CLI en Linux/Mac.
## ¿Qué es Kotlin?
Podemos decir que kotlin es un lenguaje compilado ya que necesita un compilador
## Recomendaciones de estilo de Kotlin
A continuación, se incluyen algunas de las recomendaciones de la guía de estilo para lo que aprendiste en Kotlin hasta el momento:

Los nombres de las funciones deben seguir la convención de mayúsculas mediales y deben ser verbos o frases verbales.
Cada sentencia debe estar en su propia línea.
La llave de apertura debe aparecer al final de la línea donde comienza la función.
Debe haber un espacio antes de la llave de apertura.
El cuerpo de la función debe tener una sangría de 4 espacios. No uses caracteres de tabulación para aplicar sangría al código. Escribe 4 espacios.
La llave de cierre se encuentra en su propia línea después de la última línea de código del cuerpo de la función. La llave de cierre debe alinearse con la palabra clave fun al comienzo de la función.

## Variables
En la programación informática, existe el concepto de variable, que es un contenedor para un único dato. Puedes visualizarla como una caja que contiene un valor. Esa caja tiene una etiqueta, que es el nombre de la variable. Si te refieres a la caja por su nombre, tendrás acceso al valor que contiene.
### Tipos de variables
!["Tipo de datos"](./images/Datas.png)
### ¿Cómo defines una variable?
Cuando defines una variable, le asignas un nombre para identificarla de manera única. También debes decidir qué tipo de datos puede contener mediante la especificación del tipo de datos. Por último, puedes proporcionar un valor inicial que se almacenará en la variable, pero es opcional.
### Declaración de una variable como ejemplo
```
val count: Int = 2
```
## ¿Cómo se comenta?
Utlizando dos barras diagonales (//) como comentario simple y /**/ como comentario de más de una línea
## ¿Qué es una función?
Una función es un segmento del programa que realiza una tarea específica. Tu programa podría tener una o más funciones.
Estas son las partes clave necesarias para definir una función:
                                                                1. La función necesita un nombre para que puedas llamarla más tarde.
                                                                2. También puede requerir algunas entradas o información que se debe proporcionar cuando se la llama. 
                                                                   La función usa estas entradas para lograr su propósito. Pedir entradas es opcional, y algunas funciones no las piden.
                                                                3. La función también tiene un cuerpo que contiene las instrucciones para realizar la tarea.

## Ejercicios del tutorial de kotlin de funciones y convenciones de estilo
1. [Ejercicios Kotlin](./CodelabTutorialKotlin/EjerciciosKotlin.kt)
2. [Conceptos básicos Kotlin](./CodelabTutorialKotlin/ConceptosBasicos.kt)

## ¿Qué es jetpackCompose?
Jetpack Compose es un kit de herramientas moderno para crear IUs de Android. Compose simplifica y acelera el desarrollo de IUs en Android con menos código, herramientas potentes y capacidades intuitivas de Kotlin. Con Compose, puedes compilar tu IU a partir de la definición de un conjunto de funciones, llamadas funciones de componibilidad, que toman datos y describen elementos de la IU.
Funciones de componibilidad
Las funciones de componibilidad son los componentes básicos de una IU en Compose. Una función de componibilidad cumple con lo siguiente:

1. Describe alguna parte de tu IU.
2. No devuelve nada.
3. Toma información y genera lo que se muestra en la pantalla.

### Anotaciones
Las anotaciones son una forma de adjuntar información adicional al código. Esta información ayuda a herramientas como el compilador de Jetpack Compose y a otros desarrolladores a comprender el código de la app.
Para aplicar una anotación, se agrega un prefijo al nombre (la anotación) con el carácter @ al comienzo de la declaración en la que se hará la anotación. Se pueden anotar diferentes elementos de código, incluidas propiedades, funciones y clases. Más adelante en el curso, aprenderás sobre las clases.
![Anotaciones](././images/anotaciones.png)
Ejemplo siguiente
```
// Example code, do not copy it over
@Json
val imgSrcUrl: String
@Volatile
private var INSTANCE: AppDatabase? = null
```
Las anotaciones pueden tomar parámetros. Proporcionan información adicional a las herramientas que las procesan. Los siguientes son algunos ejemplos de la anotación @Preview con y sin parámetros.
![Anotaciones](././images/anotacionesconparams.png)
Ejemplo de anotaciones 
![Anotaciones](././images/ejemplodeanotaciones.png)
