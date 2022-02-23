# CalculadoraSpringApp
Proyecto de prueba de un microservicio que funciona como una calculadora.

## Crear JAR con Maven
El proyecto está preparado para ejecutar las clases de test cada vez que se compile. Usar el siguiente comando:

>mvn clean install

Si no se quiere compilar pasando los test, utilizar el parametro -DskipTests, de esta forma:

>mvn clean install -DskipTests

## Arrancar aplicacion
Una vez generado el JAR, vamos a la carpeta target y ejecutamos:

>java -jar CalculadoraApp-0.0.1-SNAPSHOT.jar

Al tratarse de una aplicacion SpringBoot y no haber especificado lo contrario en las properties, arranca en el puerto 8080

## Documentacion Swagger
Una vez arrancada correctamente la aplicacion podemos ver los controladores expuestos en la direccion:

>http://localhost:8080/swagger-ui/

![image](https://user-images.githubusercontent.com/61191456/155313228-588ad9d0-ad00-4ba9-9cf3-71f248f4e315.png)

Gracias a Swagger podemos documentar los endpoints. Informar de que parametros necesita recibir, posibles respuestas de error, etc...
