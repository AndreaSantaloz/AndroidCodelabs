
# Android Studio y Kotlin
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
Existe también un tipo llamado null

### ¿Cómo defines una variable?
Cuando defines una variable, le asignas un nombre para identificarla de manera única. También debes decidir qué tipo de datos puede contener mediante la especificación del tipo de datos. Por último, puedes proporcionar un valor inicial que se almacenará en la variable, pero es opcional.
### Declaración de una variable como ejemplo
```
val count: Int = 2
```

Para declarar variables anulables se le pone al tipo un interrogante al lado por ejemplo --> var favoriteActor: String? = "Sandra Oh"
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

## Cómo agregar una imagen a tu proyecto

En esta tarea, descargarás una imagen de Internet y la agregarás a la app de Happy Birthday.
1. Abre la imagen de la app de tarjeta de cumpleaños desde este vínculo.
2. Haz clic en Descargar.
3. Haz clic con el botón derecho en la imagen y, luego, guarda el archivo en tu computadora como androidparty.png.
4. Toma nota de dónde guardaste la imagen.
5. En Android Studio, haz clic en View > Tool Windows > Resource Manager o en la pestaña Resource Manager junto a la ventana Project.
6. Haz clic en + (Add resources to the module) > Import Drawables.
7. En el navegador de archivos, selecciona el archivo de imagen que descargaste y haz clic en Open.
8. Android Studio te muestra una vista previa de la imagen. Selecciona Density en la lista desplegable QUALIFIER TYPE. En una sección posterior, aprenderás por qué lo haces.
9. Selecciona No Density en la lista VALUE.
10. Haz clic en Siguiente.
11. Android Studio te muestra la estructura de carpetas en la que se ubicará la imagen. Observa la carpeta drawable-nodpi.
12. Haz clic Import(C).
13. Para regresar a la vista de proyectos, haz clic en View > Tool Windows > Project o en la pestaña Project del extremo izquierdo
14. Haz clic en app > res > drawable para confirmar que la imagen se encuentra en la carpeta drawable.
15. 
Los dispositivos Android están disponibles en diferentes tamaños de pantalla (teléfonos, tablets y TVs, etc.), y sus pantallas también tienen píxeles de distintos tamaños. Es decir, hay dispositivos que tienen 160 píxeles por pulgada cuadrada y otros que adaptan 480 píxeles en el mismo espacio. Si no tienes en cuenta estas variaciones de densidad de píxeles, es posible que el sistema escale tus imágenes, lo que podría producir que se vean borrosas, imágenes grandes que consumen demasiada memoria o imágenes cuyo tamaño es incorrecto.

Cuando cambias el tamaño de las imágenes a uno más grande del que puede controlar el sistema Android, se genera un error de memoria insuficiente. En el caso de las imágenes de fondo o fotos, como la imagen actual, androidparty.png, debes colocarlas en la carpeta drawable-nodpi, ya que eso detendrá el comportamiento de cambio de tamaño.

Se abrirá el diálogo Import Drawables.
### Resource Manager
Resource Manager es una ventana de herramientas que te permite importar, crear, administrar y usar recursos en tu app.

Android Studio crea una carpeta drawable-nodpi y coloca la imagen en ella. En la vista de proyectos de Android Studio, el nombre del recurso se muestra como androidparty.png (nodpi). En el sistema de archivos de la 
computadora, Android Studio crearía una carpeta con el nombre drawable-nodpi.Si la imagen se importó correctamente, Android Studio la agregará a la lista en la pestaña Drawable. En esa lista se incluyen todos los íconos e imágenes de tu app. Ahora, puedes usar la imagen en tu app.

### Recursos en Jetpack Compose

Los recursos son los archivos adicionales y el contenido estático que usa tu código, como mapas de bits, strings de interfaz de usuario, instrucciones de animación, etc. Para obtener más información sobre los recursos en Android, consulta Información general sobre los recursos de las app.

Siempre debes separar los recursos para apps, como imágenes y strings, de tu código para que puedas mantenerlos de forma independiente. En tiempo de ejecución, Android utiliza el recurso adecuado según la configuración actual. Por ejemplo, puedes proporcionar un diseño de interfaz de la IU diferente según el tamaño de la pantalla o strings diferentes según la configuración de idioma.

### Cómo agrupar recursos

Siempre debes colocar cada tipo de recurso en un subdirectorio específico del directorio res/ de tu proyecto. Por ejemplo, esta es la jerarquía de archivos de un proyecto simple:
```
MyProject/
    src/
        MyActivity.kt
    res/
        drawable/
            graphic.png
        mipmap/
            icon.png
        values/
            strings.xml
```

Como se ve en este ejemplo, el directorio res/ contiene todos los recursos de los subdirectorios, que incluyen un directorio drawable/ para un recurso de imagen, un directorio mipmap/ para los íconos de selector y un directorio values/ para recursos de strings. Para obtener más información sobre el uso, el formato y la sintaxis para los recursos de la app, consulta Descripción general de los tipos de recursos.

Acceso a recursos

Jetpack Compose puede acceder a los recursos definidos en tu proyecto de Android. Se puede acceder a los recursos con los ID de recursos que se generan en la clase R de tu proyecto.

### Agrega Diseño Box
Los tres elementos de diseño estándar básicos en Compose son los elementos Column, Row y Box componibles. Aprendiste sobre los elementos Column y Row componibles en los codelabs anteriores, ahora explorarás más sobre el elemento Box componible.
El diseño Box es uno de los elementos de diseño estándar en Compose. Usa el diseño Box para apilar elementos uno sobre el otro. El diseño Box también te permite configurar la alineación específica de los elementos que contiene.

### Cómo ajustar la escala del contenido
Agregaste la imagen a tu app y la posicionaste. Ahora debes ajustar el tipo de escala de la imagen, que indica cómo ajustar el tamaño de la imagen para que se muestre en pantalla completa.
Hay bastantes tipos de ContentScale disponibles. Usa el escalamiento del parámetro ContentScale.Crop, que ajusta la escala de la imagen de manera uniforme para mantener la relación de aspecto, de modo que el ancho y el alto de esta sean iguales o mayores a la dimensión correspondiente de la pantalla.
### Cambia la opacidad
Para mejorar el contraste de la app, cambia la opacidad de la imagen de fondo.
Agrega el parámetro alpha al elemento componible Image y establécelo en 0.5F.
### Modificadores de diseño
Los modificadores se usan para decorar o agregar comportamiento a los elementos de IU de Jetpack Compose. Por ejemplo, puedes agregar fondos, padding o comportamiento a filas, texto o botones. Para configurarlos, un elemento componible o un diseño debe aceptar un modificador como parámetro.En un codelab anterior, aprendiste sobre los modificadores y usaste el modificador de padding (Modifier.padding) para agregar espacio alrededor de un Text componible. Los modificadores pueden ser muy útiles, y lo verás en este camino de aprendizaje y en los próximos.
Para establecer la posición de los elementos secundarios dentro de un Row, configura los argumentos horizontalArrangement y verticalAlignment. Para una Column, configura los argumentos verticalArrangement y horizontalAlignment.La propiedad de las disposiciones se usa para organizar los elementos secundarios cuando el tamaño del diseño es mayor que la suma de sus elementos secundarios.De la misma manera, cuando el tamaño de Row es mayor que la suma de sus tamaños secundarios, se puede especificar un horizontalArrangement para definir el posicionamiento de la elementos secundarios dentro de Row. A continuación, se muestra una ilustración de diferentes disposiciones horizontales:

### Padding
Un elemento de la IU se une a su contenido. Para evitar que la contracción sea demasiado marcada, puedes especificar una cantidad de padding a cada lado.El padding se usa como modificador, lo que significa que puedes aplicarlo a cualquier elemento componible. Para cada lado del elemento componible, el modificador padding toma un argumento opcional que define la cantidad de padding.
El texto describe el proceso para **extraer *strings* codificadas** en una aplicación de Android (escrita en Kotlin y Jetpack Compose) a **recursos de *string***. Este es el paso fundamental y más importante para facilitar la traducción de la aplicación a otros idiomas.

## Resumen del Proceso para Facilitar las Traducciones (Traducción/Localización)

Para que tu aplicación de Android sea fácil de traducir a otros idiomas (localización), debes **evitar codificar las *strings*** (texto) directamente en el código. En su lugar, debes **extraerlas a un archivo de recursos** llamado `strings.xml`.

Aquí tienes los pasos clave para hacerlo:

### 1\. Extracción de Strings

1.  **Identifica la String Codificada:** Localiza la *string* que está escrita directamente en tu código (ej. `"Happy Birthday Sam!"`).
2.  **Usa la Herramienta de Android Studio:**
      * Selecciona la *string* sin las comillas (ej. `Happy Birthday Sam!`).
      * Haz clic en la **bombilla** 💡 (o usa la acción rápida).
      * Selecciona la opción **"Extract string resource"**.
3.  **Define el Nombre del Recurso:** En el diálogo "Extract Resource":
      * Asigna un **Resource name** (nombre del recurso) que sea en **minúsculas** y use **guiones bajos** (`_`) (ej. `happy_birthday_text`).
      * Verifica que el **Resource Value** sea la *string* correcta.
      * Haz clic en **Aceptar**.

### 2\. Resultados Clave

  * **En el Código (Kotlin/Compose):** La *string* codificada es reemplazada por una llamada a la función que recupera el recurso:

    ```kotlin
    GreetingImage(
        // Antes: message = "Happy Birthday Sam!",
        message = stringResource(R.string.happy_birthday_text), // Después
        // ...
    )
    // Nota: Necesitas importar stringResource() de androidx.compose.ui.res
    ```

  * **En el Archivo de Recursos (`app > res > values > strings.xml`):** Android Studio crea automáticamente una entrada para el nuevo recurso.

    ```xml
    <resources>
        <string name="app_name">Happy Birthday</string>
        <string name="happy_birthday_text">Happy Birthday Sam!</string>
        <string name="signature_text">From Emma</string>
    </resources>
    ```

### 3\. El Paso de la Traducción

Una vez que todas las *strings* están centralizadas en `strings.xml` (el archivo por defecto), la **traducción real** (localización) se logra creando **archivos de recursos alternativos** para cada idioma:

1.  **Crear Directorios de Idioma:** En el directorio `res`, crea un nuevo directorio llamado, por ejemplo, `values-es` (para español).
2.  **Traducir Strings:** Dentro de ese nuevo directorio (`values-es`), crea un archivo `strings.xml`.
3.  **Mantener Nombres, Traducir Valores:** Este nuevo archivo debe contener los **mismos nombres de recursos** (`name="happy_birthday_text"`), pero los valores serán las *strings* traducidas.

Android se encarga de seleccionar el archivo `strings.xml` correcto (ej. el de `values-es` si el dispositivo está en español) en tiempo de ejecución.

### **Resumen Sencillo:**

Para hacer traducciones, **extrae todo el texto de la aplicación al archivo `strings.xml`** y luego crea versiones traducidas de ese archivo para cada idioma.

### 4 Condicionales
En kotlin tienen el tipico if,if-else,if-else-if-else y when.Este último es como un switch en  java.
También en when los condicionales son  objeto -> respuesta o también podemos encontrarnos un else o el operador in que es si se encuentra en el rango in (1..n) -> print("true").También
nos podemos encontrar is para saber si el tipo de dato es adecuado is int --> print("true")


### Programación orientada a objetos

las clases proporcionan planos a partir de cuales se pueden construir objetos. Un objeto es una instancia de una clase que consiste en datos específicos de ese objeto. Puedes usar instancias de clase y objetos indistintamente.

Como analogía, imagina que construyes una casa. Una clase es similar al plan de diseño de un arquitecto, también conocido como plano. El plano no es la casa, sino las instrucciones para construirla. La casa es el objeto real que se construye a partir de ese plano.

Al igual que el plano de una casa especifica varias habitaciones, y cada una tiene su propio diseño y propósito, cada clase tiene su propio diseño y propósito. Para saber cómo diseñar tus clases, debes familiarizarte con la programación orientada a objetos (OOP), un framework que te enseña a encerrar datos, lógica y comportamiento en los objetos.

OOP ayuda a simplificar problemas complejos del mundo real en objetos más pequeños. Hay cuatro conceptos básicos de OOP, cada uno de los cuales aprenderás más adelante en este codelab:

   1.  Encapsulamiento. Envuelve las propiedades y los métodos relacionados que realizan acciones en esas propiedades en una clase. Por ejemplo, considera tu teléfono móvil. Encapsula una cámara, una pantalla, tarjetas de memoria y varios componentes de hardware y software. No tienes que preocuparte por la forma en que los componentes se conectan de forma interna.
<br>
    2. Abstracción. Es una extensión del encapsulamiento. La idea es ocultar la lógica de implementación interna tanto como sea posible. Por ejemplo, para tomar una foto con tu teléfono móvil, solo debes abrir la app de la cámara, apuntar el teléfono hacia la escena que deseas capturar y hacer clic en un botón para capturar la foto. No necesitas saber cómo se compila la app de la cámara ni cómo funciona realmente el hardware de la cámara del teléfono. En resumen, los mecanismos internos de la aplicación de cámara y la forma en que una cámara móvil captura las fotos se abstraen para permitirte realizar las tareas importantes.
<br>
    3. Herencia. Permite crear una clase en función de las características y el comportamiento de otras clases estableciendo una relación de superior y secundario. Por ejemplo, hay distintos fabricantes que producen una variedad de dispositivos móviles que ejecutan el SO Android, pero la IU de cada uno es diferente. En otras palabras, los fabricantes heredan la función del SO Android y compilan sus personalizaciones a partir de ella.
<br>
    4. Polimorfismo. La palabra es una adaptación de la raíz griega poly-, que significa muchas, y -morphism, que significa formas. El polimorfismo es la capacidad de usar objetos diferentes de una manera común. Por ejemplo, cuando conectas una bocina Bluetooth a tu teléfono móvil, este solo necesita saber si hay un dispositivo que puede reproducir audio mediante Bluetooth. Sin embargo, puedes elegir entre una variedad de bocinas Bluetooth, y tu teléfono no necesita saber cómo trabajar con cada una de ellas a nivel específico.
<br>


#### Definir una clase
Ejemplo de como se hace
```kotlin
    class SmartDevice {
    // empty body
}

fun main() {
}

```


#### Definir una instancia ejemplo

```kotlin
    fun main() {
    val smartTvDevice = SmartDevice()
}

#### Cómo se definen metodos en las clases

```kotlin

class SmartDevice {
    fun turnOn() {
        // A valid use case to call the turnOff() method could be to turn off the TV when available power doesn't meet the requirement.
        turnOff()
        ...
    }

    ...
}

```

#### Cómo se construye un constructor

```kotlin
class SmartDevice(val name: String, val category: String) {

    var deviceStatus = "online"

    fun turnOn() {
        println("Smart device is turned on.")
    }

    fun turnOff() {
        println("Smart device is turned off.")
    }
}


```

#### Cómo se construye un constructor secundario

```kotlin
class SmartDevice(val name: String, val category: String) {
    var deviceStatus = "online"

    constructor(name: String, category: String, statusCode: Int) : this(name, category) {
        deviceStatus = when (statusCode) {
            0 -> "offline"
            1 -> "online"
            else -> "unknown"
        }
    }
    ...
}
```
#### Cómo implementar herencia
La palabra open espesifica herencia
<br>

```kotlin
open class SmartDevice(val name: String, val category: String) {

    var deviceStatus = "online"

    open fun turnOn() {
        // function body
    }

    open fun turnOff() {
        // function body
    }
}


```

#### Tipos de relaciones
Relaciones IS-A es una relación unidireccional
Relaciones HAS-A se conoce como composición.

#### Modificadores

Los modificadores de visibilidad son importantes para lograr el encapsulamiento:

    En una clase, te permiten ocultar tus propiedades y métodos para evitar el acceso no autorizado fuera de la clase.
    En un paquete, te permiten ocultar las interfaces y clases para evitar el acceso no autorizado fuera del paquete.

Kotlin ofrece cuatro modificadores de visibilidad:

    public. Es el modificador de visibilidad predeterminado. Permite que la declaración sea accesible en todas partes. Las propiedades y los métodos que deseas usar fuera de la clase se marcan como públicos.
    private. Permite que se pueda acceder a la declaración en la misma clase o archivo de origen.

Es probable que algunos métodos y propiedades solo se usen dentro de la clase, y que no necesariamente quieras que se usen otras clases. Estos métodos y propiedades se pueden marcar con el modificador de visibilidad private para garantizar que otra clase no pueda acceder a ellos de forma accidental.

    protected. Hace que la declaración sea accesible en subclases. Las propiedades y los métodos que deseas usar en la clase que los define y las subclases se marcan con el modificador de visibilidad protected.
    internal. Permite que se pueda acceder a la declaración en el mismo módulo. } El modificador interno es similar al privado, pero puedes acceder a propiedades y métodos internos desde fuera de la clase, siempre y cuando lo hagas en el mismo módulo.

#### Delegados de Propiedad

Esta lección se centra en el uso de Delegados de Propiedad en Kotlin para eliminar el código duplicado y encapsular la lógica de acceso y mutación de las propiedades (las funciones get y set).

1. Definición de Delegado de Propiedad

Un Delegado de Propiedad es un objeto que toma la responsabilidad de administrar el valor de una propiedad, incluyendo las operaciones que normalmente se harían en las funciones accesoras get() y set().

    Sintaxis: Se usa la palabra clave by para "delegar" la gestión de la propiedad a una instancia de una clase delegada:
    Kotlin

    var propiedad: Tipo by ObjetoDelegado

2. El Problema Resuelto (Duplicación de Código)

Antes de los delegados, la lógica para verificar si un valor está dentro de un rango (ej. para speakerVolume, channelNumber, brightnessLevel) se repetía en el bloque set de cada propiedad en varias clases (SmartTvDevice y SmartLightDevice).

    Objetivo: Reutilizar esta lógica de verificación de rango en una sola clase delegada.

3. Implementación del Delegado (RangeRegulator)

Para crear un delegado que maneje una propiedad de tipo var (lectura y escritura), la clase debe implementar la interfaz ReadWriteProperty.

A. La Interfaz Clave: ReadWriteProperty

Esta interfaz es el "contrato" que debe cumplir el delegado. Requiere la implementación de dos métodos:

    getValue(...): Actúa como la función get() de la propiedad. Devuelve el valor actual.

    setValue(...): Actúa como la función set() de la propiedad. Recibe el nuevo valor y aplica la lógica antes de almacenarlo.

B. La Clase RangeRegulator

Se crea una clase genérica que almacena el valor y aplica la lógica de rango:
Kotlin

import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

class RangeRegulator(
    initialValue: Int,
    private val minValue: Int,
    private val maxValue: Int
) : ReadWriteProperty<Any?, Int> {

    // 1. El campo de copia de seguridad real que almacena el valor
    var fieldData = initialValue

    // 2. Implementación de getValue (actúa como el 'get')
    override fun getValue(thisRef: Any?, property: KProperty<*>): Int {
        return fieldData
    }

    // 3. Implementación de setValue (actúa como el 'set')
    override fun setValue(thisRef: Any?, property: KProperty<*>, value: Int) {
        // Lógica reutilizable: solo asigna si el valor está en el rango
        if (value in minValue..maxValue) {
            fieldData = value
        }
    }
}

4. Uso del Delegado en las Propiedades

Finalmente, se utiliza el delegado RangeRegulator en las clases SmartTvDevice y SmartLightDevice para delegarle la gestión de las propiedades:
Kotlin

// Antes: Tenía que definir el 'set' con la lógica de rango aquí
// private var speakerVolume: Int = 2 

// Ahora: El delegado RangeRegulator se encarga del 'get' y el 'set' con la lógica de rango
private var speakerVolume by RangeRegulator(initialValue = 2, minValue = 0, maxValue = 100)

// Igual para otras propiedades con lógica de rango:
private var channelNumber by RangeRegulator(initialValue = 1, minValue = 0, maxValue = 200)

Conclusión: Los Delegados de Propiedad son una herramienta poderosa de Kotlin que promueve la reutilización de código y la abstracción, permitiendo encapsular la lógica común (como la validación de rango) fuera de la clase principal.

#### Funciones como dato

La lección demuestra que en Kotlin, las funciones no son solo bloques de código ejecutables; son valores que pueden ser almacenados en variables, pasados como argumentos, y devueltos como resultados de otras funciones.

1. 🥇 Las Funciones como Tipo de Datos

En Kotlin, puedes especificar el tipo de una variable o parámetro como una función.

    Sintaxis del Tipo de Función: El tipo se expresa con la forma: (Tipo1, Tipo2, ...) -> TipoDeRetorno

        Los parámetros de entrada van dentro de los paréntesis ().

        La flecha -> separa los parámetros del tipo de dato que se devuelve.

    Ejemplo Clave:

        Una función sin parámetros que no devuelve nada tiene el tipo: () -> Unit.

        Una función que toma dos Int y devuelve un Int tiene el tipo: (Int, Int) -> Int.

2. Almacenar Funciones en Variables

Puedes declarar una variable y asignarle una expresión lambda (una función anónima) y, opcionalmente, especificar su tipo de función explícitamente:
Kotlin

// Inferencia de tipo: Kotlin infiere que 'trick' es de tipo () -> Unit
val trick = {
    println("No treats!")
}

// Tipo de función explícito: Se declara el tipo () -> Unit
val treat: () -> Unit = {
    println("Have a treat!")
}

3. Devolver una Función desde otra Función

Una función puede devolver otra función como su resultado, utilizando la sintaxis de tipo de función como el tipo de retorno.

    Función trickOrTreat(): Esta función utiliza un valor booleano (isTrick) para decidir qué función devolverá: trick o treat.
    Kotlin

    fun trickOrTreat(isTrick: Boolean): () -> Unit {
        if (isTrick) {
            return trick // Devuelve la función 'trick'
        } else {
            return treat // Devuelve la función 'treat'
        }
    }

    fun main() {
        val treatFunction = trickOrTreat(false) // treatFunction ahora es la función 'treat'
        treatFunction()                       // Esto ejecuta 'Have a treat!'
    }

4. Pasar una Función como Argumento (Funciones de Orden Superior)

Las funciones pueden ser pasadas como argumentos a otras funciones, creando Funciones de Orden Superior que permiten personalizar el comportamiento.

    Para lograr esto, se declara un parámetro de la función usando la Sintaxis del Tipo de Función.

    Actualización de trickOrTreat(): La lección actualiza la función para aceptar una función como argumento (extraTreat), permitiendo un comportamiento personalizado:
    Kotlin

    // El parámetro 'extraTreat' es una función que toma un Int y devuelve un String
    fun trickOrTreat(isTrick: Boolean, extraTreat: (Int) -> String) { 
        // ... (el código posterior usa este parámetro)
    }

        Lambda con Parámetros: Si la función pasada como argumento (la lambda) tiene parámetros, estos se nombran y se separan del cuerpo con una flecha -> (ej. { nombreParam -> cuerpo }).

El concepto central es que el uso de funciones como tipos de datos permite escribir código más flexible, modular y reutilizable, un pilar de la programación funcional en Kotlin.


### Lambda
Las expresiones lambda en Kotlin ofrecen varias formas de escribir código más conciso y legible, especialmente cuando se utilizan como argumentos de funciones de orden superior.

1. Omitir el Nombre del Parámetro (Uso Implícito de it)

Cuando una función lambda tiene un único parámetro y no se le proporciona un nombre de forma explícita, Kotlin le asigna implícitamente el nombre it.

    Regla: Puedes omitir el nombre del parámetro y el símbolo ->.

    Sintaxis Original:
    Kotlin

val coins: (Int) -> String = { quantity ->
    "$quantity quarters"
}

Sintaxis Abreviada (usando it):
Kotlin

    val coins: (Int) -> String = {
        "$it quarters" // 'it' se refiere al parámetro Int
    }

2. Pasar una Expresión Lambda Directamente a una Función

Las expresiones lambda son literales de función y, al igual que los literales de String o Int, se pueden pasar directamente como argumentos a la llamada de una función, eliminando la necesidad de una variable intermedia.

    Concepto: Se pasa la lambda { ... } directamente a la llamada a la función que la acepta como parámetro.

    Antes (usando una variable):
    Kotlin

val coins: (Int) -> String = { "$it quarters" }
val treatFunction = trickOrTreat(false, coins)

Ahora (pasando directamente):
Kotlin

    val treatFunction = trickOrTreat(false, { "$it quarters" })

3. Sintaxis de Expresión Lambda al Final (Trailing Lambda)

Cuando el último parámetro de una función es un tipo de función (una lambda), puedes mover la expresión lambda fuera de los paréntesis de la llamada a la función.

    Propósito: Mejora la legibilidad, ya que la lógica de la lambda se separa de los demás argumentos.

    Sintaxis Normal:
    Kotlin

val treatFunction = trickOrTreat(false, { "$it quarters" })

Sintaxis de Expresión Lambda al Final:
Kotlin

    val treatFunction = trickOrTreat(false) { "$it quarters" } // La lambda va DESPUÉS del paréntesis de cierre

Esta sintaxis final es muy común en funciones de componibilidad (Composable functions) que se usan para declarar la Interfaz de Usuario (IU) en bibliotecas como Jetpack Compose.

#### Comando repeat
¡Claro! Con gusto te hago un resumen sobre el uso de la función de orden superior repeat() en Kotlin para ejecutar código repetidamente, junto con la sintaxis de expresión lambda al final y el uso del parámetro implícito it.

🔁 Resumen de la Función de Orden Superior repeat()

Una función de orden superior es aquella que toma una función como argumento y/o devuelve una función. La función repeat() es un ejemplo conciso de una función de orden superior proporcionada por Kotlin para realizar un bucle.

Firma de la Función repeat()

La función repeat() tiene la siguiente estructura:
Kotlin

repeat(times: Int, action: (Int) -> Unit)

    times: Int: Especifica la cantidad de veces que se debe ejecutar la acción.

    action: (Int) -> Unit: Es la función lambda que se ejecutará repetidamente.

        Toma un único parámetro Int (el índice de la iteración, comenzando en 0).

        Devuelve Unit (no devuelve un valor significativo).

Implementación y Sintaxis

La función repeat() se utiliza como una alternativa más concisa a un bucle for simple, especialmente cuando no es necesario un bucle for completo.

1. Uso de la Sintaxis Lambda al Final

Como el parámetro action (el tipo de función) es el último parámetro de la función repeat(), se puede usar la sintaxis de expresión lambda al final (Trailing Lambda):
Kotlin

repeat(4) {
    // Código a repetir
}

2. Omisión del Parámetro Implícito it

El parámetro Int de la lambda action es el índice de la iteración (0, 1, 2, 3...). Si no necesitas usar este índice dentro del bloque, puedes omitir por completo su nombre y el símbolo ->. Kotlin le asignaría implícitamente el nombre it, pero si no se usa, la sintaxis queda simplemente:
Kotlin

repeat(4) {
    // El índice 'it' existe, pero no se usa aquí.
    treatFunction()
}

Código Final Actualizado

Al aplicar repeat(4) con la sintaxis lambda al final y mover la llamada a treatFunction() dentro del bloque de acción, el código logra que la acción se ejecute cuatro veces:
Kotlin

fun main() {
    val treatFunction = trickOrTreat(false) { "$it quarters" }
    val trickFunction = trickOrTreat(true, null)
    
    // Repite la acción de 'treatFunction()' 4 veces
    repeat(4) { 
        treatFunction()
    }
    
    trickFunction()
}

El resultado de la ejecución es que la cadena "Have a treat!" se imprime cuatro veces seguidas, antes de que se ejecute la llamada final a trickFunction():

5 quarters
Have a treat!
Have a treat!
Have a treat!
Have a treat!
No treats!

