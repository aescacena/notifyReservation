package com.notifyReservation;

public class SendNotification {

    public static void send(Notification notification){
        SendNotification.sendMail(notification);
        SendNotification.sendFax(notification);
    }

    public static void sendMail(Notification notification) {

        String mailNotification = "=========== MAIL =========== \n" + 
            "Reservation Identification: " + notification.getReservationIdentification() +"\n" +
            "Name Hotel: " + notification.getNameHotel() +"\n" +
            "City: " + notification.getCity() +"\n" +
            "Client Name: " + notification.getClientName() +"\n" +
            "Client Last Name: " + notification.getClientLastName() +"\n" +
            "Reservation Date: " + notification.getReservationDate() +"\n" +
            "Check_in: " + notification.getCheck_in() + "\n" + 
            "Check_out: " + notification.getCheck_out(); 

        System.out.println(mailNotification);
    }

    public static void sendFax(Notification notification) {

        String faxNotification = "=========== FAX =========== \n" + 
            "Reservation Identification: " + notification.getReservationIdentification() +"\n" +
            "Name Hotel: " + notification.getNameHotel() +"\n" +
            "City: " + notification.getCity() +"\n" +
            "Client Name: " + notification.getClientName() +"\n" +
            "Client Last Name: " + notification.getClientLastName() +"\n" +
            "Reservation Date: " + notification.getReservationDate() +"\n" +
            "Check_in: " + notification.getCheck_in() + "\n" + 
            "Check_out: " + notification.getCheck_out() + "\n" +
            "Credit Card Number: " + notification.getCreditCardNumber();

        System.out.println(faxNotification);
    }

}
