[![Build Status](https://img.shields.io/badge/spring--boot-v2.4.5-green)](https://nodesource.com)
[![Build Status](https://img.shields.io/badge/mongo-No--Sql-red)](https://nodesource.com)

#EXAMPLE API

# Para correr esta api

> mvn spring-boot:run -Dspring-boot.run.profiles=dev

Esta es un api de ejemplo, con el crearemos un ejemplo generico
de api rest y le iremos incluyendo dependencias

La cual posee los siguientes componentes

| DEPENDENCIA | VERSION |
| ------ | ------ |
| loombok | 1.18.20 |
| spring-boot-starter-data-mongodb-reactive| 2.4.4 |

# DOCKER    

Example Api tiene un plugin de docker que permite
crear y subir la imagen de docker con el jar a ejecutar
para poder crear y subir dicha imagen deberemos usar el siguiente comando:

> mvn clean package -P docker -DskipTests

Este nos creara el jar y asi mismo la imagen de docker.

Para correr dicha imagen usamos el comando:


> docker run --publish 8080:8080 arreguen/example-api:[tag]

Podemos valernnos del perfil de Spring Boot para modificar
el perfil de ambiente estamos necesitando

> mvn clean package -P docker -DskipTests -Dspring-boot.run.profiles=dev

Podemos anular el subir la imagen de docker al repositorio si anulamos goal push

```
<goals>
   <goal>build</goal>
  <!-- <goal>push</goal>  -Con esto no subira la imagen al repositorio-->
</goals>
```