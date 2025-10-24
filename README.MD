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
<br>
Ejemplo de anotaciones con parametros
<br>
![Anotaciones](././images/ejemplodeanotaciones.png)

## Funciones de componibilidad
La función de componibilidad tiene la anotación @Composable. Todas estas funciones deben tener esta anotación. La anotación informa al compilador de Compose que esta función está diseñada para convertir datos en IU. Te recordamos que un compilador es un programa especial que toma el código que escribiste, lo analiza línea por línea y lo traduce a algo que la computadora puede comprender (lenguaje automático).Este fragmento de código es un ejemplo de una función simple de componibilidad a la que le pasan datos (el parámetro de la función name) y los usa para renderizar un elemento de texto en la pantalla.
```
@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}
```
Algunas notas sobre las funciones de componibilidad:

Jetpack Compose se basa en funciones de componibilidad. Estas funciones te permiten definir la IU de tu app de manera programática describiendo cómo debería verse, en lugar de enfocarse en el proceso de construcción de la IU. Para crear una función de componibilidad, agrega la anotación @Composable al nombre de la función.

Estas funciones pueden aceptar parámetros, que permiten que la lógica de la app describa o modifique la IU. En este caso, tu elemento de la IU acepta una String para que pueda saludar al usuario por su nombre.

La función de Compose que no devuelve nada y lleva la anotación @Composable DEBE tener un nombre con letra mayúscula inicial (pascal case). Esta es una convención de nomenclatura según la cual la primera letra de cada palabra de una palabra compuesta lleva mayúsculas. La diferencia entre este formato y el de mayúsculas mediales (camel case) es que, en el primer caso, todas las palabras se escriben con mayúscula inicial. En el segundo caso, la primera palabra puede estar en cualquiera de las dos opciones.
La función de Compose tiene las siguientes características:
DEBE ser un sustantivo: DoneButton().
NO debe ser un verbo ni una frase verbal: DrawTextField().
NO debe ser una preposición convertida en sustantivo: TextFieldWithLink().
NO debe ser un adjetivo: Bright().
NO debe ser un adverbio: Outside().
Los sustantivos PUEDEN estar precedidos por adjetivos descriptivos: RoundIcon().
<br>
Ejemplo de funciones componibles

```
// Do: This function is a descriptive PascalCased noun as a visual UI element
@Composable
fun FancyButton(text: String) {}


// Do: This function is a descriptive PascalCased noun as a non-visual element
// with presence in the composition
@Composable
fun BackButtonHandler() {}


// Don't: This function is a noun but is not PascalCased!
@Composable
fun fancyButton(text: String) {}


// Don't: This function is PascalCased but is not a noun!
@Composable
fun RenderFancyButton(text: String) {}


// Don't: This function is neither PascalCased nor a noun!
@Composable
fun drawProfileImage(image: ImageAsset) {}
```
## Panel Design de Android Studio
Android Studio te permite obtener una vista previa de las funciones de componibilidad dentro del IDE, en lugar de instalar la app en un emulador o dispositivo Android. Como aprendiste en la ruta de aprendizaje anterior, puedes obtener una vista previa de la apariencia de tu app en el panel Design de Android Studio.
La función de componibilidad debe proporcionar valores predeterminados para cualquier parámetro para obtener una vista previa. Por este motivo, se recomienda no obtener una vista previa de la función Greeting() directamente. En su lugar, debes agregar otra función (BirthdayCardPreview() en este caso) que llame a la función Greeting() con un parámetro adecuado.
```
@Preview(showBackground = true)
@Composable
fun BirthdayCardPreview() {
    HappyBirthdayTheme {
        Greeting("Android")
    }
}

```
## Jerarquía de la IU
La jerarquía de la IU se basa en la contención, es decir, un componente puede contener uno o más componentes. A veces, se usan los términos superior y secundario. El contexto aquí es que los elementos superiores de la IU contienen elementos secundarios de la IU, los cuales, a su vez, pueden contener elementos secundarios de la IU. En esta sección, aprenderás sobre los elementos componibles Column, Row y Box, que pueden actuar como elementos superiores de la IU.Los tres elementos de diseño estándar básicos en Compose son los elementos Column, Row y Box componibles. En el siguiente codelab, obtendrás más información sobre el elemento Box componible.Column, Row y Box son funciones de componibilidad, y toman contenido de este tipo como argumentos, por lo que puedes colocar elementos dentro de estos componentes de diseño. Por ejemplo, cada elemento secundario dentro de un elemento Row que admite composición se coloca de forma horizontal uno al lado del otro en una fila.
![JerarquíaUI](././images/JerarquiaUI.png)
```
// Don't copy.
Row {
    Text("First Column")
    Text("Second Column")
}
```
Estos elementos de texto se muestran uno al lado del otro en la pantalla, como se ve en esta imagen.

Los bordes azules son solo para fines de demostración y no se mostrarán.
![JerarquíaUI](././images/JerarquiaUI2.png)

## Sintaxis de expresión lambda final
En el fragmento de código anterior, observa que se usan llaves en lugar de paréntesis en la función de componibilidad Row. Esto se llama sintaxis de expresión lambda final. Más adelante en el curso, aprenderás sobre las lambdas y la sintaxis de expresión lambda final en detalle. Por ahora, familiarízate con esta sintaxis de Compose de uso general.

Kotlin ofrece una sintaxis especial para pasar funciones como parámetros a funciones cuando el último parámetro es una función.
![lambda](././images/lambda.png)
Cuando pasas una función como ese parámetro, puedes usar la sintaxis de expresión lambda final. En lugar de colocar la función dentro de los paréntesis, puedes colocarla fuera de los paréntesis y entre llaves. Esta práctica es recomendada y común en Compose, por lo que debes familiarizarte con la apariencia del código.

Por ejemplo, el último parámetro en la función de componibilidad Row() es el parámetro content, una función que describe los elementos secundarios de la IU. Supongamos que deseas crear una fila que contenga tres elementos de texto. Este código funcionaría, pero es muy engorroso usar el parámetro con nombre para la expresión lambda final:
```
Row(
    content = {
        Text("Some text")
        Text("Some more text")
        Text("Last text")
    }
)
```
Como el parámetro content es el último de la firma de la función y pasas su valor como una expresión lambda (por ahora, no hay problema si no sabes qué es una lambda; solo familiarízate con la sintaxis), puedes quitar el parámetro content y los paréntesis de la siguiente manera:
```
Row {
    Text("Some text")
    Text("Some more text")
    Text("Last text")
}
```
Apartado de inserción de imagen y bases de compose  para 25/10/2025
Apartado de crear app de tarjetas desde 25/10 a 26/10

