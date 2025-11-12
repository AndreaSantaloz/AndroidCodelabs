# Modulo 4

## Ciclo de vida de actividades
Durante su vida útil, una actividad pasa por varios estados y, a veces, regresa a ellos. Esta transición entre estados se conoce como ciclo de vida de la actividad.

En Android, una actividad es el punto de entrada para interactuar con el usuario.

En el pasado, una actividad mostraba una pantalla en una app. Con las prácticas recomendadas actuales, una actividad puede mostrar varias pantallas, intercambiándolas según sea necesario.

El ciclo de vida de la actividad se extiende desde la creación de la actividad hasta su destrucción, cuando el sistema recupera los recursos de esa actividad. A medida que un usuario navega dentro de una actividad y fuera de ella, cada actividad pasa de un estado a otro en su ciclo de vida.

Como desarrollador de Android, debes comprender el ciclo de vida de la actividad. Si las actividades no responden correctamente a los cambios de estado del ciclo de vida, es posible que tu app genere errores extraños o comportamientos confusos para los usuarios, o que use demasiados recursos del sistema Android. Comprender el ciclo de vida de Android y responder correctamente a los cambios de estado del ciclo de vida es una parte importante del desarrollo de Android.

Cada actividad tiene lo que se conoce como un ciclo de vida. Este término es una alusión a los ciclos de vida de las plantas y los animales, como el ciclo de vida de una mariposa. Los diferentes estados de la mariposa muestran su crecimiento a lo largo de las fases de huevo, oruga, crisálida y mariposa hasta la muerte.
De manera similar, el ciclo de vida de la actividad consiste en los diferentes estados por los que puede pasar una actividad, desde que esta se inicializa hasta su destrucción, momento en el cual el sistema operativo (SO) recupera su memoria. Por lo general, el punto de entrada de un programa es el método main(). Sin embargo, las actividades de Android comienzan con el método onCreate(); este método sería equivalente a la fase del huevo en el ejemplo anterior. Ya usaste actividades muchas veces durante este curso, y quizás reconoces el método onCreate(). Cuando el usuario inicia tu app y navega dentro y fuera de ella, y entre las actividades, la actividad cambia de estado.

En el siguiente diagrama, se muestran todos los estados del ciclo de vida de la actividad. Como los nombres lo indican, estos estados representan el estado de la actividad. Ten en cuenta que, a diferencia del ciclo de vida de las mariposas, una actividad puede ir y volver entre estados durante todo el ciclo de vida, en lugar de moverse solo en una dirección.

<img width="385" height="430" alt="imagen" src="https://github.com/user-attachments/assets/d90db412-b313-4bbd-9ea2-f87b5d7c8d1a" />

A menudo, quieres cambiar algún comportamiento o ejecutar algún código cuando cambia el estado del ciclo de vida de la actividad. Por lo tanto, la clase Activity en sí misma y cualquier subclase de Activity, como ComponentActivity, implementan un conjunto de métodos de devolución de llamada de ciclo de vida. Android invoca estas devoluciones de llamada cuando la actividad pasa de un estado a otro, y puedes anular esos métodos en tus propias actividades a fin de realizar tareas en respuesta a esos cambios de estado del ciclo de vida. En el siguiente diagrama, se muestran los estados del ciclo de vida junto con las devoluciones de llamada anulables disponibles.

<img width="370" height="412" alt="imagen" src="https://github.com/user-attachments/assets/9adf0a28-09ee-4462-b38a-1808b81ee34c" />

El asterisco en el método onRestart() indica que no se llama a este método cada vez que el estado transiciona entre Created y Started. Solo se llama si se llamó a onStop() y, por lo tanto, la actividad se reinició.


Paso 1: Observa el método onCreate() y agrega registros

Para determinar lo que sucede con el ciclo de vida de Android, es útil saber cuándo se llama a los diferentes métodos de ciclo de vida. Esta información te ayuda a identificar los problemas en la app de Dessert Clicker.

Una forma sencilla de determinar esta información es usar la funcionalidad de registro de Android. El registro te permite escribir mensajes cortos en una consola mientras la app se ejecuta, y puedes usarlo para que te muestre cuándo se activan las diferentes devoluciones de llamada.

    Ejecuta la app de Dessert Clicker y presiona varias veces la imagen del postre. Observa cómo cambia el valor de Desserts sold y el importe total en dólares.
    Abre MainActivity.kt y examina el método onCreate() para esta actividad:

override fun onCreate(savedInstanceState: Bundle?) {
    // ...
}

En el diagrama del ciclo de vida de la actividad, es posible que hayas reconocido el método onCreate(), dado que ya usaste esta devolución de llamada con anterioridad. Este es el único método que deben implementar todas las actividades. El método onCreate() es aquel en el cual debes realizar las inicializaciones únicas para tu actividad. Por ejemplo, en onCreate(), debes llamar a setContent(), que especifica el diseño de la IU de la actividad.

Se llama al método de ciclo de vida de onCreate() una vez, justo después de que se inicializa la actividad, cuando el SO crea el nuevo objeto Activity en la memoria. Después de que se ejecuta onCreate(), la actividad se considera creada.

Nota: Cuando anulas el método onCreate(), debes llamar a la implementación de la superclase para completar la creación de la actividad; por lo tanto, dentro de ella, debes llamar de inmediato a super.onCreate(). Lo mismo sucede con otros métodos de devolución de llamada de ciclo de vida.

    Agrega la siguiente constante en el nivel superior de MainActivity.kt, sobre la declaración de clase class MainActivity.

Una buena convención es declarar una constante TAG en tu archivo, ya que su valor no cambiará.

Para marcarla como una constante de tiempo de compilación, usa const cuando declares la variable. Una constante de tiempo de compilación es un valor que se conoce durante la compilación.

private const val TAG = "MainActivity"

    En el método onCreate(), justo después de la llamada a super.onCreate(), agrega la siguiente línea:

Log.d(TAG, "onCreate Called")

    Si es necesario, importa la clase Log (presiona Alt+Enter, o Option+Enter en una Mac, y selecciona Import). Si habilitaste las importaciones automáticas, esto debe ocurrir automáticamente.

import android.util.Log

La clase Log escribe mensajes en Logcat. Logcat es la consola para registrar mensajes. Aquí aparecen los mensajes de Android sobre tu app, incluidos los mensajes que envías de manera explícita al registro con el método Log.d() u otros métodos de clase Log.

Hay tres aspectos importantes de la instrucción Log:

    La prioridad del mensaje de registro, es decir, cuán importante es el mensaje. En este caso, Log.v() registra mensajes detallados. El método Log.d() escribe un mensaje de depuración. Otros métodos de la clase Log incluyen Log.i() para mensajes informativos, Log.w() para advertencias y Log.e() para mensajes de error.
    La etiqueta tag del registro (el primer parámetro), en este caso, "MainActivity". La etiqueta es una cadena que te permite encontrar con mayor facilidad los mensajes de registro en Logcat. La etiqueta suele ser el nombre de la clase.
    El mensaje de registro real, llamado msg, (el segundo parámetro), que es una cadena corta. En este caso, es "onCreate Called".

a4ff4aa74384ff6.png


    Compila y ejecuta la app de Dessert Clicker. No verás ninguna diferencia de comportamiento en la app cuando presiones el postre. En Android Studio, en la parte inferior de la pantalla, haz clic en la pestaña Logcat.

cedcce52592c6665.png

    En la ventana Logcat, escribe tag:MainActivity en el campo de búsqueda.

37080c4e00561b0.png

Logcat puede contener muchos mensajes, y la mayoría no te resultará útil. Puedes filtrar las entradas de Logcat de muchas maneras, pero es más sencillo realizar una búsqueda. Dado que usaste MainActivity como la etiqueta de registro en tu código, puedes usar esa etiqueta a fin de filtrar el registro. El mensaje de registro incluye la fecha y hora, la etiqueta de registro, el nombre del paquete (com.example.dessertclicker) y el mensaje en sí. Debido a que este mensaje aparece en el registro, sabes que se ejecutó onCreate().
Paso 2: Implementa el método onStart()

Se llama al método de ciclo de vida de onStart() justo después de onCreate(). Una vez que se ejecute onStart(), tu actividad se visualizará en la pantalla. A diferencia de lo que ocurre con onCreate(), que se llama solo una vez para inicializar tu actividad, el sistema puede llamar a onStart() muchas veces durante el ciclo de vida de tu actividad.

a357d2291de472d9.png

Ten en cuenta que onStart() está vinculado con el método de ciclo de vida onStop() correspondiente. Si el usuario inicia tu app y luego regresa a la pantalla principal del dispositivo, la actividad se detendrá y ya no estará visible en la pantalla.

    En Android Studio, con MainActivity.kt abierto y el cursor dentro de la clase MainActivity, selecciona Code > Override Methods o presiona Control+O. Aparecerá un diálogo con una larga lista de todos los métodos que puedes anular en esta clase.

20c34cbad8dce892.png

    Comienza a ingresar onStart a fin de buscar el método adecuado. Para desplazarte al siguiente elemento coincidente, usa la flecha hacia abajo. Selecciona onStart() de la lista y haz clic en Aceptar para insertar el código estándar de anulación. El código se verá como el siguiente ejemplo:

override fun onStart() {
    super.onStart()
}

    Dentro del método onStart(), agrega un mensaje de registro:

override fun onStart() {
    super.onStart()
    Log.d(TAG, "onStart Called")
}

    Compila y ejecuta la app DessertClicker, y abre el panel de Logcat.
    Escribe tag:MainActivity en el campo de búsqueda para filtrar el registro. Ten en cuenta que los métodos onCreate() y onStart() se llamaron uno tras otro y que tu actividad se visualiza en pantalla.
    Presiona el botón de inicio del dispositivo y luego usa la pantalla Recientes para volver a la actividad. Ten en cuenta que la actividad se reanudará donde la dejaste, con los mismos valores, y que onStart() se registrará por segunda vez en Logcat. Observa también que no se vuelve a llamar al método onCreate().

2024-04-26 14:54:48.721  5386-5386  MainActivity            com.example.dessertclicker           D  onCreate Called
2024-04-26 14:54:48.756  5386-5386  MainActivity            com.example.dessertclicker           D  onStart Called
2024-04-26 14:55:41.674  5386-5386  MainActivity            com.example.dessertclicker           D  onStart Called

Nota: Mientras realizas pruebas con tu dispositivo y observas las devoluciones de llamada de ciclo de vida, es posible que notes comportamientos inusuales cuando rotes el dispositivo. Aprenderás sobre ese comportamiento más adelante en este codelab.
Paso 3: Agrega más instrucciones de registro

En este paso, implementarás el registro de todos los demás métodos del ciclo de vida.

    Anula el resto de los métodos del ciclo de vida en tu MainActivity y agrega instrucciones de registro para cada uno, como se muestra en el siguiente código:

override fun onResume() {
    super.onResume()
    Log.d(TAG, "onResume Called")
}

override fun onRestart() {
    super.onRestart()
    Log.d(TAG, "onRestart Called")
}

override fun onPause() {
    super.onPause()
    Log.d(TAG, "onPause Called")
}

override fun onStop() {
    super.onStop()
    Log.d(TAG, "onStop Called")
}

override fun onDestroy() {
    super.onDestroy()
    Log.d(TAG, "onDestroy Called")
}

    Vuelve a compilar y ejecutar Dessert Clicker, y revisa Logcat.

Ten en cuenta que esta vez, además de onCreate() y onStart(), hay un mensaje de registro para la devolución de llamada de ciclo de vida onResume().

2024-04-26 14:56:48.684  5484-5484  MainActivity            com.example.dessertclicker           D  onCreate Called
2024-04-26 14:56:48.709  5484-5484  MainActivity            com.example.dessertclicker           D  onStart Called
2024-04-26 14:56:48.713  5484-5484  MainActivity            com.example.dessertclicker           D  onResume Called

Cuando una actividad se inicie desde cero, verás las tres devoluciones de llamada de ciclo de vida llamadas en orden:

    onCreate(), cuando el sistema crea la app.
    onStart(), que hace que la app sea visible en la pantalla, aunque el usuario aún no puede interactuar con ella.
    onResume(), que lleva la app al primer plano y permite que el usuario ahora interactúe con ella.

A pesar de su nombre, se llama al método onResume() durante el inicio, incluso si no hay nada para reanudar.

El esquema del ciclo de vida de la actividad
Aquí tienes un resumen conciso y ordenado de cómo se implementa un **`ViewModel`** para gestionar el estado de la IU en una aplicación Jetpack Compose, basándose en la tarea que describiste:

-----
Aquí tienes un resumen conciso de la arquitectura de aplicación recomendada, sus principios y el papel de `ViewModel` y el Estado de la IU:

---

## 🏗️ Resumen de Arquitectura de Aplicaciones Android

La arquitectura de una app bien diseñada se basa en dos principios clave para hacerla escalable, extensible y fácil de mantener:

1.  **Separación de Problemas:** Dividir la aplicación en clases o funciones, cada una con **responsabilidades independientes**.
2.  **Control de la IU a partir de un Modelo:** La interfaz de usuario debe ser impulsada por un **modelo de datos persistente**, independiente del ciclo de vida de la aplicación.

### Capas de la Arquitectura Recomendada

Toda aplicación debe tener al menos dos capas principales:

| Capa | Responsabilidad |
| :--- | :--- |
| **Capa de la IU (o Presentación)** | Muestra los datos en la pantalla y es el punto de interacción del usuario. Es **independiente** de los datos. |
| **Capa de Datos** | Almacena, recupera y expone los datos de la aplicación (la fuente de verdad). |

*(Opcionalmente, se puede incluir una Capa de Dominio para simplificar las interacciones entre estas dos).* 

---

## 📱 Capa de la IU (Presentación)

La capa de la IU es la representación visual de la aplicación y consta de:

1.  **Elementos de la IU:** Componentes que renderizan los datos en la pantalla (usando **Jetpack Compose**).
2.  **Contenedores de Estado:** Componentes que contienen, exponen y controlan la lógica de la app. El ejemplo principal es **`ViewModel`**.

### El Papel de ViewModel

El **`ViewModel`** es el **contenedor de estado** clave que:

* Contiene y expone el **Estado de la IU** (los datos transformados de la aplicación).
* Sigue el principio de controlar la IU a partir de un modelo.
* **Sobrevive a los cambios de configuración** (como la rotación del dispositivo) porque no se destruye con la Actividad, asegurando que los datos del juego o la pantalla persistan.

### Estado de la IU e Inmutabilidad

* El **Estado de la IU** es lo que la aplicación **indica** que el usuario debe ver; la IU es la **representación visual** de ese estado.
* El estado de la IU debe ser **inmutable** (generalmente definido con `data class`) para garantizar que el estado no sea alterado por múltiples fuentes simultáneamente.
* **Principio Fundamental:** La IU solo debe **leer** el estado y **nunca modificarlo directamente** (a menos que sea la única fuente de datos) para evitar inconsistencias y errores.
## 🏗️ Implementación Resumida de ViewModel en Compose

El objetivo es usar el **`ViewModel`** para almacenar el estado del juego (`GameUiState`) y asegurar que sobreviva a los cambios de configuración (como la rotación de pantalla).

### 1\. Dependencia (Build Setup)

Se agrega la dependencia específica de Compose para `ViewModel` en el archivo `build.gradle.kts` (Module :app):

```kotlin
implementation("androidx.lifecycle:lifecycle-viewmodel-compose:2.6.1")
```

### 2\. Clase de Estado de la IU (`GameUiState`)

Se define una clase **`data class`** inmutable para sostener todos los datos necesarios para la IU, asegurando que el estado sea claro y fácil de gestionar:

```kotlin
data class GameUiState(
    val currentScrambledWord: String = ""
    // Aquí se agregarían: score, wordCount, etc.
)
```

### 3\. Clase `ViewModel` (`GameViewModel`)

Se crea la clase principal que extiende de `ViewModel` y que contiene la lógica del juego.

#### a. Gestión del Estado (StateFlow y Propiedad de Copia de Seguridad)

Se utiliza **`MutableStateFlow`** para contener el estado de la IU y se expone como un **`StateFlow`** de solo lectura. Esto se conoce como **Propiedad de Copia de Seguridad (*Backing Property*)** y protege el estado de modificaciones externas no deseadas.

```kotlin
private val _uiState = MutableStateFlow(GameUiState())
val uiState: StateFlow<GameUiState> = _uiState.asStateFlow() // La IU solo lee de 'uiState'
```

#### b. Lógica y Datos Auxiliares

Se añaden las propiedades y métodos necesarios para el juego, como:

  * `private lateinit var currentWord: String`: Para guardar la palabra correcta actual.
  * `private var usedWords: MutableSet<String> = mutableSetOf()`: Para rastrear palabras ya usadas.
  * `pickRandomWordAndShuffle()`: Lógica para seleccionar una palabra no usada y desordenarla.

#### c. Inicialización del Juego (`resetGame()`)

Se incluye una función para inicializar o reiniciar el juego, que es llamada inmediatamente al crear el ViewModel:

```kotlin
fun resetGame() {
    usedWords.clear()
    // Actualiza el MutableStateFlow (y por ende la IU) con la nueva palabra
    _uiState.value = GameUiState(currentScrambledWord = pickRandomWordAndShuffle())
}

init {
    resetGame() // Llama a resetGame() la primera vez que se instancia el ViewModel
}
```

### Resumen del Flujo

1.  La **IU (Composables)** observa la propiedad **`uiState`** (`StateFlow`).
2.  La **Lógica del Juego (ViewModel)** actualiza el estado modificando **`_uiState.value`** (`MutableStateFlow`).
3.  `StateFlow` emite automáticamente el nuevo valor, y la **IU se recompone** con los datos actualizados.

Aquí tienes un resumen de cómo se crea la arquitectura de la IU de Compose siguiendo el patrón de **Flujo de Datos Unidireccional (UDF)** y cómo se conectan el `ViewModel` y los elementos componibles.

-----

## 🔁 Flujo de Datos Unidireccional (UDF) en Compose

El patrón UDF garantiza que el estado de la aplicación fluya en una única dirección, haciendo que la lógica sea predecible:

1.  **Estado (State) ⬇️ Fluye Hacia Abajo:** El `ViewModel` expone el estado, que es consumido por la IU (los elementos componibles).
2.  **Eventos (Events) ⬆️ Fluyen Hacia Arriba:** La IU genera eventos (clics, cambios de texto) y los notifica al `ViewModel` para que los procese y actualice el estado.

### Implementación del Patrón

#### 1\. Conexión del `ViewModel` a la IU

  * **Paso 1: Inyección del ViewModel:** Se pasa una instancia de `GameViewModel` a la función componible principal (`GameScreen`) usando la función `viewModel()`.
    ```kotlin
    @Composable
    fun GameScreen(gameViewModel: GameViewModel = viewModel()) { /* ... */ }
    ```
  * **Paso 2: Observación del Estado:** Se utiliza **`collectAsState()`** en el `StateFlow` (`uiState`) del `ViewModel` para convertir el flujo de datos en un objeto `State` que Compose puede observar. Cualquier cambio en `uiState` dispara una **recomposición** de la IU.
    ```kotlin
    val gameUiState by gameViewModel.uiState.collectAsState()
    ```

#### 2\. Visualización del Estado (Ejemplo: Palabra Desordenada)

  * La `GameScreen` pasa el estado actual (`gameUiState.currentScrambledWord`) hacia abajo a elementos componibles menores (`GameLayout`) como un **parámetro inmutable**.
  * El elemento `GameLayout` utiliza este `String` para mostrar la palabra desordenada en el `Text` correspondiente.

#### 3\. Flujo de Eventos (Ejemplo: Propuesta del Usuario)

Para que el usuario pueda escribir, se utiliza un estado `userGuess` dentro del `ViewModel`, observable por Compose (`mutableStateOf`).

  * **Paso 1: Flujo del Evento (⬆️ Arriba):** El componente de la IU (`OutlinedTextField` dentro de `GameLayout`) expone una devolución de llamada (`onUserGuessChanged`).
  * **Paso 2: Manejo del Evento:** La `GameScreen` conecta esta devolución de llamada al método del `ViewModel` (`gameViewModel.updateUserGuess(it)`).
  * **Paso 3: Actualización del Estado (ViewModel):** El `ViewModel` actualiza su estado interno (`userGuess = guessedWord`).
  * **Paso 4: Flujo del Estado (⬇️ Abajo):** La `GameScreen` pasa el valor actualizado de vuelta a la IU (`userGuess = gameViewModel.userGuess`).

Este ciclo asegura que la **IU solo muestre el estado** y el **ViewModel solo lo controle y actualice**, logrando una arquitectura limpia y predecible.

Aquí tienes un resumen conciso de cómo agregar dependencias para pruebas en una aplicación Android con Gradle:

-----

## ⚙️ Resumen: Adición de Dependencias de Prueba

El objetivo principal al añadir dependencias de prueba es usar configuraciones que las **excluyan del archivo de paquete de la aplicación (APK)** final, ya que no son necesarias para el usuario y solo aumentarían el tamaño del archivo.

### 1\. Configuración de Dependencias

Se utiliza la configuración **`testImplementation`** en el bloque `dependencies{}` del archivo **`build.gradle.kts`** del módulo de la aplicación:

| Configuración | Propósito | Incluido en APK |
| :--- | :--- | :--- |
| **`implementation`** | Dependencias necesarias para el código fuente de la app. | **Sí** |
| **`testImplementation`** | Dependencias necesarias **solo para el código fuente de prueba local** (pruebas de unidad). | **No** |
| **`androidTestImplementation`** | Dependencias necesarias para las pruebas que se ejecutan en un dispositivo (pruebas de instrumentación). | **No** |

### 2\. Adición de JUnit

Para usar el framework de pruebas de unidades **JUnit**, se agrega la siguiente línea al bloque `dependencies{}`:

```kotlin
dependencies {
    // ... otras dependencias
    testImplementation("junit:junit:4.13.2")
}
```

### 3\. Lista de Materiales (BoM) de Compose

La **BoM (Bill of Materials)** de Compose es la forma recomendada para gestionar las versiones de las bibliotecas de Compose.

  * Al importar la BoM (`implementation(platform(...))`), no es necesario especificar los números de versión para las dependencias individuales de Compose, ya que la BoM garantiza que todas usen versiones compatibles.
  * Para usar la BoM con las bibliotecas de pruebas de instrumentación, se debe importar la BoM usando la configuración **`androidTestImplementation`** también.

Una vez que se añade o modifica una dependencia, siempre se debe hacer clic en **"Sync Now"** en Android Studio para que Gradle procese los cambios.

Aquí tienes un resumen de la estrategia de prueba y cómo se aplican los principios en las pruebas de unidad del `GameViewModel`:

---

## 📝 Resumen de la Estrategia de Prueba y Pruebas de Unidad

### I. Estrategia de Prueba (Categorías)

Una buena estrategia de prueba considera diferentes escenarios de ejecución en el código, que se categorizan en tres tipos principales:

1.  **Ruta de Éxito (Ruta Viable):**
    * Se enfoca en el **flujo positivo** y el comportamiento previsto (sin errores).
    * *Ejemplo:* Ingresar una palabra **correcta** y verificar que la **puntuación se actualiza** y la palabra desordenada cambia.
2.  **Ruta de Error (Flujo Negativo):**
    * Se enfoca en verificar cómo la aplicación responde a **condiciones de error** o entradas no válidas.
    * *Ejemplo:* Ingresar una palabra **incorrecta** y verificar que la **puntuación no cambia** y se activa una bandera de error (`isGuessedWordWrong = true`).
3.  **Caso Límite (Condiciones Borde):**
    * Se enfoca en probar las **condiciones límite** de la aplicación.
    * *Ejemplos:* Verificar el **estado inicial** del juego y el estado al **finalizar el juego** (cuando se alcanza el `MAX_NO_OF_WORDS`).

---

### II. Propiedades de una Buena Prueba de Unidad

Una prueba de unidad efectiva debe ser:

* **Enfoque:** Probar solo una pequeña **unidad** de código (clase o método).
* **Comprensible:** Simple y fácil de entender a primera vista.
* **Determinista:** Siempre produce el mismo resultado (pasa o falla) si el código no cambia.
* **Independiente:** Se ejecuta de forma **aislada** sin depender de otras pruebas, interacción humana o configuraciones externas.

---

### III. Aplicación en `GameViewModelTest`

Se crea la clase **`GameViewModelTest`** con la instancia del `viewModel` para probar sus métodos y el estado de la IU (`GameUiState`).

#### A. Pruebas de Ruta de Éxito (`gameViewModel_CorrectWordGuessed_ScoreUpdated...`)
1.  Obtener la palabra correcta.
2.  Llamar a `viewModel.updateUserGuess()` y `viewModel.checkUserGuess()`.
3.  **Aserciones:** Verificar que el puntaje (`score`) se **actualice** (a 20) y que la bandera de error (`isGuessedWordWrong`) esté en **`false`**.

#### B. Pruebas de Ruta de Error (`gameViewModel_IncorrectGuess_ErrorFlagSet`)
1.  Usar una palabra incorrecta ("and").
2.  Llamar a `viewModel.updateUserGuess()` y `viewModel.checkUserGuess()`.
3.  **Aserciones:** Verificar que el puntaje (`score`) **no se modifique** (sigue en 0) y que la bandera de error (`isGuessedWordWrong`) esté en **`true`**.

#### C. Pruebas de Caso Límite
1.  **Inicialización:** Verificar que la palabra esté desordenada, la cuenta de palabras (`currentWordCount`) sea 1, el puntaje sea 0, y el juego no haya terminado (`isGameOver` es `false`).
2.  **Juego Terminado:** Ejecutar el ciclo de adivinanza correcta (`updateUserGuess` y `checkUserGuess`) la cantidad máxima de veces (`MAX_NO_OF_WORDS`).
    * **Aserciones:** Verificar que el puntaje final sea el esperado, la cuenta de palabras sea igual a `MAX_NO_OF_WORDS`, y que **`isGameOver`** esté en **`true`**.

### IV. Ciclo de Vida de la Instancia de Prueba

* **Comportamiento por Defecto (JUnit):** Por defecto, JUnit crea una **nueva instancia de la clase de prueba** (`GameViewModelTest`) **antes de ejecutar cada método `@Test`**.
* **Independencia:** Esto asegura que cada prueba tenga su **propia copia fresca** e independiente de la propiedad `viewModel`, garantizando que la ejecución de una prueba no afecte el estado de las demás.

* Aquí tienes un resumen conciso sobre la introducción a la cobertura de código y cómo usarla en Android Studio:

---

## 📊 Resumen: Introducción a la Cobertura de Código

La **cobertura de código** es una herramienta esencial en Android Studio que ayuda a medir si las pruebas de unidad están abarcando adecuadamente las clases, métodos y líneas de código de tu aplicación.

### 1. Ejecución con Cobertura

Para generar un informe de cobertura, se ejecuta la prueba de unidad (por ejemplo, `GameViewModelTest.kt`) haciendo clic derecho y seleccionando **"Run '...' with Coverage"**.

### 2. Análisis del Informe

El informe de cobertura proporciona métricas clave, generalmente divididas en:

| Métrica | Significado |
| :--- | :--- |
| **Métodos Cubiertos (%)** | Porcentaje de **métodos** de una clase que fueron ejecutados durante la prueba. |
| **Líneas Cubiertas (%)** | Porcentaje de **líneas de código** que fueron ejecutadas durante la prueba. |

Android Studio utiliza **codificación de color** en el archivo de código fuente (`GameViewModel.kt`) para mostrar qué líneas fueron ejecutadas:

* **Verde Brillante:** Líneas de código **cubiertas** (ejecutadas).
* **Rosa Claro:** Líneas de código **no cubiertas** (omitidas).

### 3. Mejora de la Cobertura

Para mejorar el porcentaje de cobertura, debes:

1.  **Identificar la Ruta Faltante:** Usar el informe y el código fuente coloreado para encontrar las líneas no cubiertas.
2.  **Escribir una Prueba:** Crear una nueva prueba de unidad que fuerce la ejecución de ese código faltante.
    * *Ejemplo:* Agregar la prueba **`gameViewModel_WordSkipped_ScoreUnchangedAndWordCountIncreased()`** para cubrir la ruta de "omisión de palabra".

### 4. Cobertura Alta vs. Calidad

Es crucial entender la diferencia entre cobertura y calidad:

* **Cobertura Alta (Ej: 100%)** significa que las pruebas **ejecutaron** la mayoría del código, pero **no garantiza la alta calidad** del código.
* **Una prueba sin aserciones** (`assertEquals`, `assertTrue`, etc.) aún contará como cubierta, pero no verifica el **comportamiento** correcto de la aplicación.
* **Cobertura Baja** es un claro indicador de que grandes porciones de tu código están **sin probar**.

La cobertura de código debe usarse como una **herramienta para encontrar código sin ejecutar**, no como una métrica única para medir la calidad de tus pruebas.

## Navegación

Aquí tienes un resumen conciso de cómo definir las rutas, crear el `NavHostController` y configurar el `NavHost` para la navegación en Jetpack Compose, según la tarea descrita.

-----

## 🧭 Configuración de la Navegación en Compose (`CupcakeApp`)

La navegación en Compose se basa en tres componentes principales: `NavController`, `NavGraph` y `NavHost`.

### 1\. Definición de Rutas (Routes)

Las rutas son **cadenas de texto únicas** que identifican cada pantalla (`Composable`) de la aplicación. Se suelen definir usando una clase `enum` por su claridad:

```kotlin
enum class CupcakeScreen() {
    Start, // Pantalla de inicio
    Flavor, // Pantalla de sabor
    Pickup, // Pantalla de fecha de retiro
    Summary // Pantalla de resumen
}
```

### 2\. Creación del NavHostController

El `NavController` (`NavHostController`) es responsable de ejecutar la navegación entre destinos (pantallas). Se obtiene dentro del elemento componible raíz (`CupcakeApp`) para que esté disponible para el `NavHost` y la barra de aplicaciones (`AppBar`).

```kotlin
// Dentro de CupcakeApp()
val navController = rememberNavController() // Inicializa y recuerda el controlador
```

### 3\. Configuración del NavHost

El `NavHost` es el **contenedor componible** que muestra la pantalla actual según la ruta activa.

Se llama a `NavHost` dentro del `Scaffold` (o contenedor principal) de la aplicación, y requiere tres parámetros clave:

| Parámetro | Valor | Propósito |
| :--- | :--- | :--- |
| **`navController`** | La instancia obtenida de `rememberNavController()`. | Gestiona el movimiento entre pantallas. |
| **`startDestination`** | La ruta inicial (ej: `CupcakeScreen.Start.name`). | Define la pantalla que se muestra al iniciar la app. |
| **`modifier`** | Se usa para aplicar relleno y otros ajustes visuales. | Asegura que el contenido se ajuste correctamente (por ejemplo, debajo de la `AppBar`). |

```kotlin
NavHost(
    navController = navController,
    startDestination = CupcakeScreen.Start.name,
    modifier = Modifier.padding(innerPadding)
) {
    // Definición de destinos...
}
```

### 4\. Definición de Destinos (`composable()`)

Dentro del bloque lambda del `NavHost`, se utiliza la función **`composable()`** para mapear cada ruta a un elemento componible específico.

  * **`composable(route = ...)`:** Se llama una vez por cada pantalla definida en el `enum`.
  * **Contenido:** Dentro de la lambda de `composable()`, se llama al elemento componible que representa la pantalla.

**Ejemplos de Mapeo de Destinos:**

```kotlin
// Mapeo de la ruta de inicio
composable(route = CupcakeScreen.Start.name) {
    StartOrderScreen(
        quantityOptions = DataSource.quantityOptions,
        // ... otros parámetros
    )
}

// Mapeo de la ruta de sabores (usando ViewModel y Contexto)
composable(route = CupcakeScreen.Flavor.name) {
    val context = LocalContext.current
    SelectOptionScreen(
        subtotal = uiState.price,
        options = DataSource.flavors.map { id -> context.resources.getString(id) },
        onSelectionChanged = { viewModel.setFlavor(it) }, // Se pasa el evento al ViewModel
        // ...
    )
}

// Mapeo de la ruta de resumen
composable(route = CupcakeScreen.Summary.name) {
    OrderSummaryScreen(
        orderUiState = uiState,
        // ...
    )
}
```

Al completar esta configuración, la aplicación ya sabe **qué pantalla mostrar** para cada ruta definida. El siguiente paso sería implementar las llamadas a **`navController.navigate()`** en los botones para viajar entre estas pantallas.
Aquí tienes un resumen conciso de la estrategia para navegar entre rutas en Compose, evitando pasar directamente el `NavController` a los elementos componibles.

-----

## 🚀 Resumen: Navegación entre Rutas y Flujo de Eventos

La estrategia recomendada es seguir el patrón de **Flujo de Datos Unidireccional (UDF)**: la lógica de navegación (el `NavController`) se mantiene centralizada en el `NavHost`, y los elementos componibles solo envían eventos (lambdas) hacia arriba para solicitar la navegación.

### 1\. Principio Clave: No Pasar el `NavController`

En lugar de pasar el `NavController` como parámetro a cada pantalla, se pasa un **tipo de función (`() -> Unit`)** (un evento) que se llama cuando se presiona un botón. Esto asegura que:

  * La **lógica de navegación** se aísle en un solo lugar (el `NavHost` dentro de `CupcakeApp`).
  * Las pantallas individuales (`StartOrderScreen`, etc.) son más **independientes** y no necesitan saber sobre otras rutas.

### 2\. Implementación de los Eventos

Se modifican los elementos componibles de la IU para que acepten lambdas de evento:

| Pantalla (`Composable`) | Evento Agregado | Lógica que debe realizar (Implementación en `CupcakeApp`) |
| :--- | :--- | :--- |
| **`StartOrderScreen`** | `onNextButtonClicked: (Int) -> Unit` | 1. Llama a `viewModel.setQuantity(it)`. 2. Llama a **`navController.navigate(CupcakeScreen.Flavor.name)`**. |
| **`SelectOptionScreen`** | `onNextButtonClicked: () -> Unit` | Llama a **`navController.navigate(...)`** a la siguiente pantalla (Pickup o Summary). |
| **`SelectOptionScreen`** | `onCancelButtonClicked: () -> Unit` | Llama a la función auxiliar `cancelOrderAndNavigateToStart(...)`. |
| **`OrderSummaryScreen`** | `onCancelButtonClicked: () -> Unit` | Llama a la función auxiliar `cancelOrderAndNavigateToStart(...)`. |

### 3\. Navegación a la Siguiente Ruta

Para avanzar, se utiliza el método **`Maps(route: String)`** en la expresión lambda del evento `onNextButtonClicked` de cada pantalla.

```kotlin
// Ejemplo en StartOrderScreen:
onNextButtonClicked = { quantity ->
    viewModel.setQuantity(quantity)
    navController.navigate(CupcakeScreen.Flavor.name) // Avanza a la siguiente ruta
}
```

Esto agrega el nuevo destino a la **pila de actividades** (`Back Stack`).

### 4\. Regresar a la Pantalla de Inicio (`Cancel`)

El botón **Cancel** no debe usar simplemente el botón de atrás del sistema, sino que debe regresar al inicio y restablecer el estado del pedido. Esto se logra con una función auxiliar:

  * **Función Auxiliar:** `cancelOrderAndNavigateToStart(viewModel, navController)`
  * **Acciones:**
    1.  Llama a `viewModel.resetOrder()` para limpiar los datos del pedido.
    2.  Llama a **`navController.popBackStack(CupcakeScreen.Start.name, inclusive = false)`**.

El método **`popBackStack()`** se utiliza para:

  * Eliminar todos los destinos de la pila hasta llegar a la ruta especificada (`CupcakeScreen.Start.name`).
  * El parámetro `inclusive = false` asegura que el destino `Start` permanezca en la pila como la pantalla visible.

Aquí tienes un resumen sobre cómo navegar desde tu aplicación a otra aplicación o a una interfaz del sistema, como una hoja de acciones para compartir (`ShareSheet`), utilizando un `Intent`.

-----

## 📲 Resumen: Navegación a Otras Aplicaciones (Intents)

Para interactuar con componentes del sistema operativo Android o lanzar otras aplicaciones (que el `NavController` de Compose no puede manejar), se utiliza un **`Intent`**.

Un `Intent` es esencialmente una **solicitud** enviada al sistema Android para realizar una acción, como iniciar una nueva actividad.

### 1\. El Proceso del Intent (`ACTION_SEND`)

El proceso para crear y enviar un pedido a través de la interfaz de compartir (ShareSheet) utiliza el `Intent` de acción `ACTION_SEND`:

1.  **Creación del Intent:** Se crea un objeto `Intent` con la acción **`Intent.ACTION_SEND`**.
2.  **Definición del Tipo:** Se especifica el tipo de datos que se compartirán (`type = "text/plain"` para texto simple).
3.  **Adición de Datos (Extras):** Se adjuntan los datos reales (el pedido) al intent usando **`putExtra()`**:
      * **`Intent.EXTRA_SUBJECT`**: El asunto del mensaje.
      * **`Intent.EXTRA_TEXT`**: El contenido o cuerpo del mensaje.
4.  **Lanzamiento:** Se le pide al sistema que inicie la actividad apropiada utilizando **`context.startActivity()`**.

### 2\. Implementación de `shareOrder()`

La lógica para compartir se encapsula en una función auxiliar, **`shareOrder()`**, que toma el `Context`, el `subject` y el `summary`:

```kotlin
private fun shareOrder(context: Context, subject: String, summary: String) {
    val intent = Intent(Intent.ACTION_SEND).apply {
        type = "text/plain"
        // 1. Agregar el asunto y el resumen (los datos a compartir)
        putExtra(Intent.EXTRA_SUBJECT, subject)
        putExtra(Intent.EXTRA_TEXT, summary)
    }

    // 2. Iniciar la actividad (muestra la ShareSheet del sistema)
    context.startActivity(
        Intent.createChooser( // Muestra un selector de aplicaciones
            intent,
            context.getString(R.string.new_cupcake_order) // Título del selector
        )
    )
}
```

### 3\. Conexión a la IU de Compose

La función `shareOrder()` se conecta al evento `onSendButtonClicked` de la pantalla de resumen (`OrderSummaryScreen`).

Para obtener el contexto necesario, se usa **`LocalContext.current`** dentro de la lambda `composable()`:

```kotlin
composable(route = CupcakeScreen.Summary.name) {
    val context = LocalContext.current // Se obtiene el Contexto aquí

    OrderSummaryScreen(
        // ...
        onSendButtonClicked = { subject: String, summary: String ->
            // Se llama a la función para interactuar con el sistema
            shareOrder(context, subject = subject, summary = summary)
        }
    )
}
```

Al ejecutar esta lógica, el sistema operativo presentará la interfaz de compartir con aplicaciones como Mensajería, Correo Electrónico o Bluetooth, permitiendo al usuario completar el pedido.
