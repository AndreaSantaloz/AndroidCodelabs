/*1. ¿Puedes escribir una función main() que imprima estos mensajes en cuatro líneas separadas?*/
/*
 * Use the val keyword when the value doesn't change. 
Use the var keyword when the value can change.
When you define a function, you define the parameters that can be passed to it. 
When you call a function, you pass arguments for the parameters.
 * */
/*
fun main() {
   println("Use the val keyword when the value doesn't change.")
   println("Use the var keyword when the value can change.")
   println("When you define a function, you define the parameters that can be passed to it.")
   println("When you call a function, you pass arguments for the parameters.")
}
*/
/*2.Este programa imprime un mensaje que le notifica al usuario que recibió un mensaje de chat de un amigo.


fun main() { 
    println("New chat message from a friend'}
}
¿Puedes determinar la causa raíz de los errores de compilación de este programa y corregirlos?
¿El código usa los símbolos apropiados para indicar la apertura y el cierre de la cadena y el argumento de la función?
*/
/*
El problema es que hay un error de signos al final de la frase en lugar de ' es " y también
que cierra mal  y debe ser con el símbolo )
*/
/*Solución*/
fun main() { 
    println("New chat message from a friend")
}

/*
3.Este programa informa a los usuarios sobre la próxima oferta promocional de un artículo en particular. Tiene una plantilla de cadenas, que se basa en la variable discountPercentage para el porcentaje de descuento y la variable item para el artículo en oferta. Sin embargo, existen errores de compilación en el código.


fun main() {
    val discountPercentage: Int = 0
    val offer: String = ""
    val item = "Google Chromecast"
    discountPercentage = 20
    offer = "Sale - Up to $discountPercentage% discount on $item! Hurry up!"
    
    println(offer)
}
¿Puedes determinar la causa raíz de esos errores y corregirlos?
¿Puedes determinar el resultado de este programa antes de ejecutar el código en Kotlin Playground?
*/
/*
Error fue que estaba declarando discountPercentage al inicio y luego lo quería cambiar
lo cual era un problema y lo otro era igual con offer.
La solución es esta:
*/
/*
fun main() {
    val discountPercentage: Int
    val offer: String 
    val item = "Google Chromecast"
    discountPercentage = 20
    offer = "Sale - Up to $discountPercentage% discount on $item! Hurry up!"
    
    println(offer)
}*/

/*
4. Este programa muestra una cantidad total de personas en una fiesta. Entre ellas, hay adultos y niños. La variable numberOfAdults contiene la cantidad de adultos en el grupo, y la variable numberOfKids, la cantidad de niños.


fun main() {
    val numberOfAdults = "20"
    val numberOfKids = "30"
    val total = numberOfAdults + numberOfKids
    println("The total party size is: $total")
}
Paso 1
¿Puedes determinar el resultado de este programa antes de ejecutar el código en Kotlin Playground?
Después de determinar el resultado, ejecuta el código en Kotlin Playground y, luego, verifica si el resultado coincide con el que se muestra.

Pista: ¿Qué sucede cuando usas el operador + en dos cadenas?

Paso 2
El código funciona y, además, imprime algunos resultados, pero los resultados no muestran la cantidad total de personas que asistirán a la fiesta.

¿Puedes encontrar el problema del código y corregirlo de modo que imprima este resultado?

The total party size is: 50
*/
/*El problema que reside es que lo estas poniendo de tipo string entonces
cuando lo suma no lo estás sumando sino concatenando por lo que da 2030,
así que para cambiarlo simplemente hay que cambiar el tipo
*/
/*Solución*/
/*
fun main() {
    val numberOfAdults:Int = 20
    val numberOfKids:Int = 30
    val total:Int = numberOfAdults + numberOfKids
    println("The total party size is: $total")
}
*/
/*Este programa muestra el salario total que recibe un empleado este mes. El salario total se divide en dos partes: la variable baseSalary, que es lo que el empleado recibe todos los meses, y la variable bonusAmount, que es una bonificación adicional otorgada al empleado.


fun main() {
    val baseSalary = 5000
    val bonusAmount = 1000
    val totalSalary = "$baseSalary + $bonusAmount"
    println("Congratulations for your bonus! You will receive a total of $totalSalary (additional bonus).")
}
¿Puedes determinar el resultado de este código antes de ejecutarlo en Kotlin Playground?
Cuando ejecutas el código en el Playground de Kotlin, ¿se imprime el resultado que esperabas?*/
/*Como no declaro el tipo de datos pues lo trato como strings basta con declarar
el tipo de dato y sumará las dos cantidades además que en totalSalary quitarle las comillas y
quitarle los dollares porque sino lo trata como string
*/
/*Solución*/
/*
fun main() {
    val baseSalary:Int = 5000
    val bonusAmount:Int = 1000
    val totalSalary:Int = baseSalary + bonusAmount
    println("Congratulations for your bonus! You will receive a total of $totalSalary (additional bonus).")
}
*/

/*
5.En este ejercicio, escribirás un programa que realice operaciones matemáticas básicas y, luego, imprima el resultado.

Paso 1
La función main() contiene un error de compilación:


fun main() {
    val firstNumber = 10
    val secondNumber = 5
    
    println("$firstNumber + $secondNumber = $result")
}
¿Puedes corregir el error de modo que el programa imprima este resultado?

10 + 5 = 15
Paso 2
El código funciona, pero la lógica para sumar dos números se encuentra dentro de la variable de resultado, lo que hace que el código sea menos flexible a la hora de volver a usarlo. En su lugar, puedes extraer la operación de suma en una función add() para que el código se pueda volver a usar. Para ello, actualiza el código con el que se muestra a continuación. Observa que el código ahora presenta una nueva variable val, llamada thirdNumber, e imprime el resultado de esta variable nueva con firstNumber.


fun main() {
    val firstNumber = 10
    val secondNumber = 5
    val thirdNumber = 8
    
    val result = add(firstNumber, secondNumber)
    val anotherResult = add(firstNumber, thirdNumber)

    println("$firstNumber + $secondNumber = $result")
    println("$firstNumber + $thirdNumber = $anotherResult")
}

// Define add() function below this line
¿Puedes definir la función add() de modo que el programa imprima este resultado?

10 + 5 = 15
10 + 8 = 18
Paso 3
Ahora tienes una función reutilizable capaz de sumar dos números.

¿Puedes implementar la función subtract() de la misma manera en que implementaste la función add()? Modifica la función main() también para usar la función subtract(), de modo que puedas verificar que funcione como se espera.
Pista: Piensa en la diferencia entre la suma, la resta y otras operaciones matemáticas. Comienza a trabajar en el código de la solución a partir de allí.
*/
/*
Para el primer apartado simplemente hice una variable total donde sume los numeros
y la puse en el println
fun main() {
    val firstNumber = 10
    val secondNumber = 5
    val total = firstNumber+secondNumber
    println("$firstNumber + $secondNumber = $total")
}
*/
/*Para el segundo apartado era algo muy simple crear una función que sea capaz 
de sumar e imprimir el resultado ;sin embargo para hacer el código más legible 
pues cree una segunda función para imprimir lo siguiente es el resultado
*/
/*

fun main() {
    val firstNumber = 10
    val secondNumber = 5
    val thirdNumber = 8
    
    add(firstNumber, secondNumber)
    add(firstNumber, thirdNumber)


}
fun add(firstNumber:Int,secondNumber:Int){
    printResults(firstNumber,secondNumber, firstNumber+secondNumber)
}
fun printResults(firstNumber:Int,secondNumber:Int,total:Int){
     println("$firstNumber + $secondNumber = $total")
}
*/
/*Ampliaré el código para que pueda hacer más que sumar como indica el apartado 3 puede restar
,multiplicar y dividir*/
/*

fun main() {
    val firstNumber = 10
    val secondNumber = 5
    val thirdNumber = 2
    
    add(firstNumber, secondNumber)
    subtract(firstNumber, thirdNumber)
    multiplication(firstNumber, thirdNumber)
    division(firstNumber, thirdNumber)
   


}
fun add(firstNumber:Int,secondNumber:Int){
    printResults(firstNumber,secondNumber, firstNumber+secondNumber,"+")
}
fun subtract(firstNumber:Int,secondNumber:Int){
    printResults(firstNumber,secondNumber, firstNumber-secondNumber,"-")
}
fun multiplication(firstNumber:Int,secondNumber:Int){
    printResults(firstNumber,secondNumber, firstNumber*secondNumber,"*")
}
fun division(firstNumber:Int,secondNumber:Int){
    printResults(firstNumber,secondNumber, firstNumber/secondNumber,"/")
}



fun printResults(firstNumber:Int,secondNumber:Int,total:Int,Symbol:String){
     println("$firstNumber $Symbol $secondNumber = $total")
}
*/

/*
8.Gmail tiene una función que envía notificaciones al usuario cada vez que se intenta acceder a una cuenta en un dispositivo nuevo.

En este ejercicio, escribirás un programa que muestra un mensaje a los usuarios con esta plantilla de mensaje:


There's a new sign-in request on operatingSystem for your Google Account emailId.
Deberás implementar una función que acepte un parámetro operatingSystem y un parámetro emailId, cree un mensaje en el formato dado y lo muestre.

Por ejemplo, si se llamó a la función con "Chrome OS" para el operatingSystem y "sample@gmail.com" para el emailId, se debería mostrar esta cadena:


There's a new sign-in request on Chrome OS for your Google Account sample@gmail.com.
Paso 1
¿Puedes implementar la función displayAlertMessage() en este programa de modo que imprima el resultado que se muestra?

fun main() {
    val operatingSystem = "Chrome OS"
    val emailId = "sample@gmail.com"

    println(displayAlertMessage(operatingSystem, emailId))
}

// Define your displayAlertMessage() below this line.
¿El programa imprime este resultado?

There's a new sign-in request on Chrome OS for your Google Account sample@gmail.com.
Paso 2
¡Bien hecho! Mostraste el mensaje. Sin embargo, en algunos escenarios, notas que no puedes determinar el sistema operativo del usuario. En esos casos, deberás especificar el nombre del sistema operativo como Unknown OS. Puedes optimizar aún más el código para que no necesites pasar el argumento Unknown OS cada vez que se llame a la función.

¿Puedes encontrar una manera de optimizar el código con esta información de modo que imprima este resultado?

There's a new sign-in request on Unknown OS for your Google Account user_one@gmail.com.

There's a new sign-in request on Windows for your Google Account user_two@gmail.com. 

There's a new sign-in request on Mac OS for your Google Account user_three@gmail.com. 
Para imprimir el mensaje anterior, reemplaza la implementación de la función main() por la siguiente:

fun main() {
    val firstUserEmailId = "user_one@gmail.com"

    // The following line of code assumes that you named your parameter as emailId. 
    // If you named it differently, feel free to update the name.
    println(displayAlertMessage(emailId = firstUserEmailId))
    println()

    val secondUserOperatingSystem = "Windows"
    val secondUserEmailId = "user_two@gmail.com"

    println(displayAlertMessage(secondUserOperatingSystem, secondUserEmailId))
    println()

    val thirdUserOperatingSystem = "Mac OS"
    val thirdUserEmailId = "user_three@gmail.com"

    println(displayAlertMessage(thirdUserOperatingSystem, thirdUserEmailId))
    println()
}
*/
#Apartado 1
/*
fun main() {
    val operatingSystem:String = "Chrome OS"
    val emailId:String = "sample@gmail.com"

  	displayAlertMessage(operatingSystem, emailId)
}

fun displayAlertMessage(value1:String,value2:String){
     println( "There's a new sign-in request on $value1 for your $value2 emailId.")
}
*/
#Apartado2
/*
fun main() {
    const users = arrayOf("user_one@gmail.com", "user_two@gmail.com", "user_three@gmail.com")
    const operationSos = arrayOf("Windows", "Amazon", "Mac OS")
     for(i in 0..2){
         displayAlertMessage(operationSos[i],users[i])
    }
  
    
}
fun displayAlertMessage(operationSo:String,email:String){
      println( "There's a new sign-in request on $operationSo for your Google Account $email. ")
}

*/