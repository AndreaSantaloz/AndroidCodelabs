 /*
 1.¿Puedes leer el código en este programa y adivinar el resultado (sin ejecutarlo en el Playground de Kotlin)?
 */
 /*
fun main() {
    println("1")
    println("2")
    println("3")
}
*/
/*
Simplemente muestra en la consola los números 1,2 y 3 en una linea distinta
ya que salta de línea
*/
/*
2.Usa el Playground de Kotlin para crear un programa que genere los siguientes mensajes:
I'm
learning
Kotlin!
*/
/*
fun main(){
    println("I'm")
    println("learning")
    println("Koltin!")
}*/
/*Simplemente hace lo mismo que el ejercicio anterior pero cen lugar de numeros
son palabras
*/
/*
3.Copia y pega este programa en el Playground de Kotlin.
fun main() {
    println("Tuesday")
    println("Thursday")
    println("Wednesday")
    println("Friday")
    println("Monday")
}
Corrige el programa para que imprima este resultado:
Monday
Tuesday
Wednesday
Thursday
Friday

A modo de práctica anticipada sobre la solución de problemas, corrige los errores en los siguientes ejercicios.
En cada ejercicio, copia el código en el Playground de Kotlin en tu navegador.
Intenta ejecutar el programa. Aparecerá un mensaje de error.
*/
/*
fun main(){
    println("Monday")
    println("Tuesday")
    println("Wednesday")
    println("Thursday")
    println("Friday")
    
}*/
/*
Simplemente cambie el orden de los println para que apareciera como pedía el ejercicio
*/
/*
4.Corrige el error de este programa para que produzca el resultado deseado.

fun main() {
    println("Tomorrow is rainy")
Resultado deseado:

Tomorrow is rainy
*/
/*El error ocurre que le falta el simbolo que cierra la función(paréntesis) por lo que una vez puesto funciona*/
/*Solución*/
/*
fun main() {
    println("Tomorrow is rainy")
}*/
/*5.Corrige el error de este programa para que produzca el resultado deseado.

fun main() {
    printLine("There is a chance of snow")
}
Resultado deseado:


There is a chance of snow
*/
/*La función printLine no existe en Kotlin con que solo basta con cambiar el comando a println o print*/
/*
fun main() {
    println("There is a chance of snow")
}*/
/*
6. Corrige el error de este programa para que produzca el resultado deseado.

fun main() {
    println("Cloudy") println("Partly Cloudy") println("Windy")
}
Resultado deseado:


Cloudy
Partly Cloudy
Windy
*/
/*El error esta en la línea donde no se puede poner varios println en la misma línea con que 
  los pongas en filas independientes funciona como lo siguente
*/
/*
fun main() {
    println("Cloudy")
    println("Partly Cloudy") 
    println("Windy")
}*/
/*7.Corrige el error de este programa para que produzca el resultado deseado.

fun main() (
    println("How's the weather today?")
)
Resultado deseado:
How's the weather today?
*/
/*El error es que se equivoco en poner los tipos de simbolos que cierran la función que son {} como el siguiente código*/
/*
fun main() {
      println("How's the weather today?")
}
 */