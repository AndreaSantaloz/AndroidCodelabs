# Pruebas automáticas


En el contexto de un software, las pruebas son un método estructurado para verificar el software para garantizar que funcione correctamente. Las pruebas automatizadas son códigos que comprueban que otro fragmento del código que escribiste funcione correctamente.

Probar la app es una parte importante del proceso de desarrollo. Al ejecutar pruebas de la app de manera coherente, puedes verificar la corrección, el comportamiento funcional y la usabilidad de la app antes de lanzarla públicamente.

Las pruebas también proporcionan una manera de verificar continuamente el código existente a medida que se introducen cambios.

Si bien las pruebas manuales casi siempre se realizan en un lugar específico, las pruebas en Android a menudo se pueden automatizar. Durante lo que queda del curso, te enfocarás en las pruebas automatizadas para probar el código de la app y los requisitos funcionales de esta. En este codelab, aprenderás los conceptos básicos de las pruebas en Android. En los próximos, aprenderás más prácticas avanzadas de prueba de apps para Android.

A medida que te familiarices con el desarrollo y las pruebas de apps para Android, deberías escribir una prueba de manera periódica junto al código de tu app. Si creas una prueba cada vez que creas una función nueva en tu app, se reducirá la carga de trabajo más adelante cuando la app crezca. También es una forma conveniente de asegurarte de que tu app funciona de manera correcta sin invertir demasiado tiempo en probarla manualmente.

Las pruebas automatizadas son una parte esencial del desarrollo de software, y el desarrollo de Android no es la excepción. Por lo tanto, este es el momento indicado para hablar del tema.
Por qué son importantes las pruebas automatizadas

Al principio, puede parecer que no necesitas hacer pruebas en tu app. Sin embargo, las apps de todos los tamaños y complejidades necesitan pruebas.

Para ampliar tu base de código, debes probar la funcionalidad preexistente a medida que agregas nuevas partes, lo cual solo es posible si tienes pruebas preexistentes. A medida que tu app crece, las pruebas manuales requieren mucho más esfuerzo que las pruebas automatizadas. Además, una vez que comienzas a trabajar en apps en producción, las pruebas se vuelven esenciales cuando tienes una base de usuarios de mayor tamaño. Por ejemplo, debes tener en cuenta muchos tipos diferentes de dispositivos que ejecutan varias versiones de Android.

Con el tiempo, llegarás a un punto en el que las pruebas automatizadas puedan representar la mayoría de los casos de uso más rápido y de forma significativa que las pruebas manuales. Cuando ejecutas pruebas antes de lanzar código nuevo, puedes realizar cambios al existente a fin de evitar la actualización de una app con comportamientos inesperados.

Recuerda que las pruebas automatizadas son aquellas que se ejecutan mediante software, a diferencia de las manuales, que realizan las personas que interactúan de forma directa con un dispositivo. Las pruebas automatizadas y manuales desempeñan una función esencial a los efectos de garantizar que los usuarios de tu producto tengan una experiencia agradable. Sin embargo, las automatizadas pueden resultar más precisas y optimizar la productividad de tu equipo, ya que se pueden ejecutar mucho más rápido que una prueba manual y no se necesita que una persona las ejecute.
Tipo de pruebas automatizadas
Pruebas locales

Las pruebas locales son un tipo de prueba automatizada que prueban directamente un fragmento pequeño de código para garantizar que funcione correctamente. Con las pruebas locales, puedes probar funciones, clases y propiedades. Las pruebas locales se ejecutan en la estación de trabajo, lo que significa que se ejecutan en un entorno de desarrollo sin necesidad de un dispositivo o emulador. Es una forma sofisticada de decir que las pruebas locales se ejecutan en tu computadora. Además, tienen una sobrecarga muy baja de recursos informáticos, por lo que pueden ejecutarse rápido incluso con recursos limitados. Android Studio está listo para ejecutar pruebas de unidades automáticamente.
Pruebas de instrumentación

Para el desarrollo de Android, una prueba de instrumentación es una prueba de IU. Las pruebas de instrumentación te permiten probar partes de una app que dependen de la API de Android, así como las APIs y los servicios de su plataforma.
# Cómo crear un directorio de prueba en Android Studio

## **Pasos Detallados:**

### **1. Cambiar a la vista Project**
- En la pestaña **Project** (normalmente en la parte superior izquierda)
- Cambiar de "Android" a **"Project"** para ver la estructura completa del proyecto

### **2. Crear el directorio test**
- Haz clic derecho sobre el directorio **`src`**
- Selecciona **New > Directory**
- En la ventana "New Directory", selecciona **`test/java`**
- Presiona **Enter** o **Return**

### **3. Crear la estructura de paquetes**
El directorio `test` debe replicar exactamente la estructura de paquetes del código principal:

- Haz clic derecho en **`test/java`**
- Selecciona **New > Package**
- En "New Package", escribe el mismo paquete que usas en tu app:
  - Ejemplo: **`com.example.tiptime`**
  - (Reemplaza con el nombre de tu paquete específico)

## **Estructura Final Esperada:**
```
app/
├── src/
│   ├── main/
│   │   └── java/
│   │       └── com/
│   │           └── example/
│   │               └── tiptime/
│   │                   └── MainActivity.kt
│   └── test/                    ← Nuevo directorio
│       └── java/
│           └── com/
│               └── example/
│                   └── tiptime/  ← Mismo paquete
│                       └── TipCalculatorTests.kt
```

## **Verificación Visual:**
- Deberías ver el directorio `test` paralelo al directorio `main`
- La estructura de carpetas dentro de `test/java` debe ser idéntica a `main/java`

## **¿Por qué esta estructura?**
- **Consistencia:** Las pruebas deben estar en el mismo paquete que las clases que prueban
- **Organización:** Facilita encontrar pruebas relacionadas con cada clase
- **Acceso:** Permite probar métodos `internal` dentro del mismo paquete

## **Alternativa con Gradle:**
Si prefieres usar la línea de comandos, puedes crear la estructura con:
```bash
mkdir -p app/src/test/java/com/example/tiptime
```

¡Una vez creada esta estructura, ya puedes comenzar a escribir tus pruebas locales!

## Resumen de la Lección: Cómo escribir pruebas locales

### **Propósito de las pruebas locales**
- Probar directamente métodos específicos del código de la aplicación
- Verificar que la lógica de funciones individuales funcione correctamente

### **Pasos Clave:**

1. **Preparar el código para pruebas:**
   - Cambiar métodos `private` a `internal` para hacerlos accesibles
   - Agregar anotación `@VisibleForTesting` para indicar que es público solo para pruebas

2. **Estructura de directorios:**
   - Crear directorio `test` en `app/src/`
   - Replicar la misma estructura de paquetes que en `main/java/`

3. **Crear clase de prueba:**
   - Nueva clase Kotlin en el paquete de pruebas
   - Nombre descriptivo (ej: `TipCalculatorTests`)

4. **Escribir la prueba:**
   - **Anotación:** `@Test` para identificar métodos de prueba
   - **Nomenclatura:** Nombres descriptivos que indiquen qué se prueba
   - **Estructura:**
     - Configurar variables de entrada
     - Definir resultado esperado
     - Llamar al método bajo prueba
     - Verificar con aserciones

### **Ejemplo de Prueba:**
```kotlin
@Test
fun calculateTip_20PercentNoRoundup() {
    val amount = 10.00
    val tipPercent = 20.00
    val expectedTip = NumberFormat.getCurrencyInstance().format(2)
    val actualTip = calculateTip(amount = amount, tipPercent = tipPercent, false)
    assertEquals(expectedTip, actualTip)
}
```

### **Aserciones Comunes:**
- `assertEquals()` - verifica igualdad
- `assertTrue()`/`assertFalse()` - verifica condiciones booleanas
- `assertNull()`/`assertNotNull()` - verifica valores nulos

### **Ejecución:**
- Usar las flechas en el margen del IDE para ejecutar pruebas individuales o toda la clase
- Ver resultados en el panel "Run"

### **Conceptos Importantes:**
- Las pruebas verifican resultados esperados vs. resultados reales
- No contienen lógica compleja como el código de producción
- Se enfocan en verificar comportamientos específicos
- Las aserciones son fundamentales para validar los resultados
# 📱 Resumen Ejecutivo: Pruebas de Instrumentación en Jetpack Compose

## 🎯 **Propósito Principal**
Verificar el funcionamiento de la interfaz de usuario y las interacciones del usuario en condiciones reales (dispositivo físico o emulador).

## 🏗️ **Componentes Clave**

### **1. Configuración Inicial**
```kotlin
@get:Rule
val composeTestRule = createComposeRule()
```

### **2. Diferenciación por Directorio**
- **`androidTest`** → Pruebas de instrumentación
- **`test`** → Pruebas locales

## 🔄 **Flujo de Trabajo en 3 Pasos**

### **Paso 1: Configurar la UI**
```kotlin
composeTestRule.setContent {
    TipTimeTheme {
        TipTimeLayout()
    }
}
```

### **Paso 2: Interactuar con Elementos**
```kotlin
// Localizar y escribir en campos
.onNodeWithText("Bill Amount").performTextInput("10")
.onNodeWithText("Tip Percentage").performTextInput("20")
```

### **Paso 3: Verificar Resultados**
```kotlin
val expectedTip = NumberFormat.getCurrencyInstance().format(2)
.onNodeWithText("Tip Amount: $expectedTip").assertExists("Mensaje de error")
```

## 📋 **Casos de Uso Típicos**
- ✅ Probar flujos completos de usuario
- ✅ Verificar cálculos en tiempo real
- ✅ Validar formato y visualización de datos
- ✅ Confirmar interacciones de UI

## ⚠️ **Consideraciones Clave**
- **Configuración regional** afecta formatos de moneda
- **Textos exactos** deben coincidir con la UI real
- **Mensajes de error** descriptivos para debugging

## 🚀 **Ejecución**
- Click en flechas del IDE para ejecutar
- Se prueba en dispositivo/emulador real
- Resultados visibles en panel "Run"

## 🎖️ **Beneficios**
- Pruebas desde la perspectiva del usuario final
- Detección de errores de UI/UX
- Validación de integración entre componentes

**Esta aproximación garantiza que la aplicación funcione correctamente en un entorno real, más allá del código puro.**
A diferencia de las pruebas locales, las pruebas de IU inician una app o parte de ella, simulan las interacciones del usuario y comprueban si la app reaccionó adecuadamente. A lo largo de este curso, las pruebas de IU se ejecutan en un dispositivo físico o emulador.

Cuando ejecutas una prueba de instrumentación en Android, el código de prueba en realidad se compila en su propio Paquete de aplicación para Android (APK), como una app para Android normal. Un APK es un archivo comprimido que contiene todo el código y los archivos necesarios para ejecutar la app en un dispositivo o emulador. Ese APK de prueba se instala en el dispositivo o emulador junto con el APK de la app normal. Luego, el APK de prueba ejecuta sus pruebas en el APK de la app.
