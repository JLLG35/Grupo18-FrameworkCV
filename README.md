# Ciclo de Vida de la Automatización - Pruebas en CVwizard (Página web para armado de CV)

1. Descripción general:
    - La automatización tiene como objetivo realizar pruebas funcionales en el sitio web de CVwizard, para verificar su correcto funcionamiento.
    - El alcance incluye las funcionalidades de inicio de sesión, navegación por las pestañas y modulos de la web.
    - Los objetivos son mejorar la eficiencia de las pruebas,  y la reducción de los errores humanos.

2. Configuración del entorno:
    - Sistema operativo: Windows 11.
    - Navegadores: Google Chrome (Supports Chrome version 115)
    - Lenguaje de programación: Java
    - Dependencias: ChromeDriver, selenium-java, cucumber-java, cucumber-junit.

3. Diseño de la arquitectura:
    - Patrón de diseño utilizado: Page Object Model (POM).
    - Estructura del proyecto: Módulos separados para páginas, casos de prueba y configuración.

4. Casos de prueba:
    - Caso de prueba 1: Navegar en CVwizard
        - Descripción: Verificar que el usuario pueda navegar correctamente.
        - Pasos:
            1. Abrir navegador de google chrome.
            2. Ingresar a página de CVwizard.
            3. Maximizar la pantalla.
            4. Verificar que imprima el titulo.

        - Expectativas de resultado: El usuario debería poder imprimir el título "Crear un Curriculum Vitae profesional".

5. Configuración y gestión de datos de prueba:
    - Los datos de prueba se definen en el propio código de automatización.

6. Estrategia de ejecución:
    - Ejecutar los casos de prueba de forma secuencial.
    - Agrupar los casos de prueba en suites según su funcionalidad.
    - Generar informes de ejecución utilizando la herramienta de informes pytest-html.

7. Manejo de errores y excepciones:
    - Utilizar bloques try-catch para capturar y manejar excepciones durante la ejecución.
    - Generar informes detallados de errores en los informes de ejecución.

8. Mantenimiento y actualización:
    - Realizar revisiones periódicas del código de automatización.
    - Actualizar los casos de prueba según los cambios en la interfaz de la aplicación.
    - Mejorar la estructura del código y la reutilización de componentes.

9. Limitaciones y riesgos:
    - La automatización depende de la estabilidad y disponibilidad de la web de CVwizard.
    - Los cambios en la interfaz de usuario pueden afectar la ejecución de las pruebas automatizadas.
    - Riesgo de dependencias externas, como la velocidad de conexión a Internet.

10. Recursos adicionales:
    - Documentación de Selenium WebDriver: https://selenium.dev/documentation/en/
    - Documentación de cucumber: https://cucumber.io/docs/cucumber/
    - Documentación de Junit: https://junit.org/junit5/docs/current/user-guide/

11. Para generar el reporte:
    - Ejecutar el CucumberRunner que esta en la ruta src/main/java/CucumberRunner
    - Ubicarte en la ruta del proyecto y ejecutar el mvn verify -DskipTests en el cmd


BUENAS PRACTICAS PARA AUTOMATIZAR

1.Nombres descriptivos: Utiliza nombres descriptivos y significativos para tus casos de prueba y métodos. Esto facilitará la comprensión de las pruebas por parte de otros miembros del equipo y ayudará en la depuración de errores.

2.Modularidad: Divide tus pruebas en casos de prueba más pequeños y modularizados. Esto mejora la legibilidad y mantenibilidad del código, ya que cada caso de prueba se enfoca en una funcionalidad específica.

3.Datos de prueba independientes: Evita dependencias entre los datos de prueba y los casos de prueba. Utiliza datos independientes y configurables para cada caso de prueba, ya sea mediante el uso de archivos de datos o herramientas de generación de datos.

4.Configuración y limpieza del entorno: Asegúrate de configurar el entorno de prueba de manera adecuada antes de ejecutar las pruebas y realiza una limpieza después de su finalización. Esto ayuda a mantener la consistencia y confiabilidad de las pruebas.

5.Gestión de dependencias: Utiliza herramientas de gestión de dependencias, como Maven o Gradle, para administrar las bibliotecas y dependencias necesarias en tu proyecto de automatización. Esto facilita la gestión de las versiones y actualizaciones de las dependencias.

6.Control de versiones: Utiliza un sistema de control de versiones, como Git, para gestionar y rastrear los cambios en tu código de automatización. Esto te permite mantener un historial de cambios, colaborar con otros miembros del equipo y revertir cambios si es necesario.

7.Informes detallados: Genera informes detallados sobre el resultado de las pruebas automatizadas. Utiliza herramientas de generación de informes, como Cucumber Reports o Allure, para visualizar los resultados de las pruebas de manera clara y comprensible.

8.Ejecución en paralelo: Si es posible, configura tu suite de pruebas para que se ejecute en paralelo en múltiples hilos o dispositivos. Esto ayuda a ahorrar tiempo y permite una mayor cobertura de pruebas.