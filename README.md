# ENVIAR Y ORDENAR NOTIFICACIONES

Este programa genera notificaciones de reservas online de forma aleatoria según los argumentos que se proporcionen de entrada, para posteriormente ordenar dichas notificaciones por fechas de reserva y enviar un email al cliente y un fax al establecimiento donde se reservo.

## 1. Generar .jar

Ejecutamos en consola el comando:

```
mvn package
```

Esto primero compilará si es necesario, pasará las clases de test de JUnit y si no hay fallos, meterá en el directorio target nuestro jar, que por defecto tendrá un nombre parecido al siguiente:

- notifyReservation-0.0.1-SNAPSHOT.jar

## 2. Ejecutamos .jar

Ejecutamos comando:

```
java -jar target/notifyReservation-0.0.1-SNAPSHOT.jar initialDate finalDate numNotificationsGenerates
```

Donde los parámetros corresponden:

- `initialDate:` Indicamos fecha inicial para generar fechas random con formato dd/MM/yyyy.
- `finalDate:` Indicamos fecha final para generar fechas random con formato dd/MM/yyyy.
- `numNotificationsGenerates:` Indicamos el número de notificaciones random que se generarán.