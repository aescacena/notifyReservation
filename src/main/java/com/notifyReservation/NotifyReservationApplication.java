package com.notifyReservation;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class NotifyReservationApplication {

	public static void main(String[] args) throws ParseException {
		SpringApplication.run(NotifyReservationApplication.class, args);

		List<Notification> notifications = new ArrayList<>();

		if (args.length == 3) {
			
			Date d1 = new SimpleDateFormat("dd/MM/yyyy").parse(args[0]);
			Date d2 = new SimpleDateFormat("dd/MM/yyyy").parse(args[1]);
			int numNotifications = Integer.parseInt(args[2]);

			if ((d1.compareTo(d2) < 0) && (numNotifications > 0)){
				for (int i = 0; i < numNotifications; i++) {
					Date reservationDate = new Date(ThreadLocalRandom.current().nextLong(d1.getTime(), d2.getTime()));
					Date checkInDate = new Date(
							ThreadLocalRandom.current().nextLong(reservationDate.getTime(), d2.getTime()));
					Date checkOutDate = new Date(ThreadLocalRandom.current().nextLong(checkInDate.getTime(), d2.getTime()));
					long creditCardNumber = 1000000000000000L
							+ (long) (Math.random() * (9999999999999999L - 1000000000000000L));
					Notification notificacion = new Notification("id-" + i, "Hotel-" + i, "City-" + i, "clientName-" + i,
							"clientLastName" + i, reservationDate, checkInDate, checkOutDate, i);
					notifications.add(notificacion);
				}
	
				Collections.sort(notifications);
	
				for (Notification notification : notifications) {
					System.out.println(" ");
					SendNotification.send(notification);
				}
			}else{
				System.out.println("Argumentos incorrectos, revisar");
			}
		} else {
			System.out.println("Número de argumentos enviados incorrectos");
		}
	}
}
