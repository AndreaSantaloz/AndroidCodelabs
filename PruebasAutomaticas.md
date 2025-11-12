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

A diferencia de las pruebas locales, las pruebas de IU inician una app o parte de ella, simulan las interacciones del usuario y comprueban si la app reaccionó adecuadamente. A lo largo de este curso, las pruebas de IU se ejecutan en un dispositivo físico o emulador.

Cuando ejecutas una prueba de instrumentación en Android, el código de prueba en realidad se compila en su propio Paquete de aplicación para Android (APK), como una app para Android normal. Un APK es un archivo comprimido que contiene todo el código y los archivos necesarios para ejecutar la app en un dispositivo o emulador. Ese APK de prueba se instala en el dispositivo o emulador junto con el APK de la app normal. Luego, el APK de prueba ejecuta sus pruebas en el APK de la app.
