# Enviar email

Implementar una aplicación Java utilizando el framework **JavaFX,** cumpliendo el patrón de diseño **MVC**, y que permita enviar mensajes de correo electrónico.

Se deberá crear un **proyecto Maven** en Eclipse (recuerda marcar "Create a simple project" al crear el proyecto).

La aplicación utilizará la librería [Apache Commons Email](https://commons.apache.org/proper/commons-email/index.html) para enviar los correos, por lo que añadiremos la siguiente dependencia al fichero "pom.xml":

```
<dependency>
    <groupId>org.apache.commons</groupId>
    <artifactId>commons-email</artifactId>
    <version>1.5</version>
</dependency>
```

La interfaz de la aplicación debe ser como la siguiente y deberá implementarse en **FXML**:

![](https://github.com/Ayoamaro/EnviarEmail/blob/main/docs/images/enviar-email-01.png?raw=true)

Intentar en la medida de lo posible que se parezca lo máximo posible y que al redimensionarse se adepte a la ventana (Stage) de forma adecuada y decorosa ;-D. 

El icono de la aplicación se puede descargar al final del enunciado.

Dispones del ejemplo "[A simple text email](https://commons.apache.org/proper/commons-email/userguide.html)" desde el que se muestra como enviar un email sencillo sin adjuntos y en texto plano con la librería Commons Email. Nos basaremos en este ejemplo para enviar los email. Como puede observarse en la imagen anterior, desde la interfaz gráfica se recogerán todos los datos necesarios.

En cuanto a la funcionalidad de los botones:

- **Enviar**: enviará un email empleando los parámetros introducidos. 

En caso de error se mostrará un aviso como el siguiente (se deberá mostrar el mensaje de la excepción como contenido del aviso):

![](https://github.com/Ayoamaro/EnviarEmail/blob/main/docs/images/enviar-email-02.png?raw=true)

Si el mensaje se envía correctamente, se mostrará un mensaje como el siguiente y sólo se vaciarán los campos "Destinatario", "Asunto" y "Mensaje".

![](https://github.com/Ayoamaro/EnviarEmail/blob/main/docs/images/enviar-email-03.png?raw=true)

- **Vaciar:** limpiará el contenido de todos los campos.
- **Cerrar**: cerrará la ventana y terminará el programa
