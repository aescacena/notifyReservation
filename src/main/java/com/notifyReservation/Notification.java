package com.notifyReservation;

import java.util.Comparator;
import java.util.Date;

public class Notification implements Comparable<Notification>{

    String reservationIdentification = null;
    String nameHotel = null;
    String city = null;
    String clientName = null;
    String clientLastName = null;
    Date reservationDate = null;
    Date check_in = null;
    Date check_out = null;
    long creditCardNumber = -1L;

    public Notification(String reservationIdentification, String nameHotel, String city, String clientName,
            String clientLastName, Date reservationDate, Date check_in, Date check_out, long creditCardNumber) {
        this.reservationIdentification = reservationIdentification;
        this.nameHotel = nameHotel;
        this.city = city;
        this.clientName = clientName;
        this.clientLastName = clientLastName;
        this.reservationDate = reservationDate;
        this.check_in = check_in;
        this.check_out = check_out;
        this.creditCardNumber = creditCardNumber;
    }

    public String getReservationIdentification() {
        return reservationIdentification;
    }

    public void setReservationIdentification(String reservationIdentification) {
        this.reservationIdentification = reservationIdentification;
    }

    public String getNameHotel() {
        return nameHotel;
    }

    public void setNameHotel(String nameHotel) {
        this.nameHotel = nameHotel;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public String getClientLastName() {
        return clientLastName;
    }

    public void setClientLastName(String clientLastName) {
        this.clientLastName = clientLastName;
    }

    public Date getReservationDate() {
        return reservationDate;
    }

    public void setReservationDate(Date reservationDate) {
        this.reservationDate = reservationDate;
    }

    public Date getCheck_in() {
        return check_in;
    }

    public void setCheck_in(Date check_in) {
        this.check_in = check_in;
    }

    public Date getCheck_out() {
        return check_out;
    }

    public void setCheck_out(Date check_out) {
        this.check_out = check_out;
    }

    public long getCreditCardNumber() {
        return creditCardNumber;
    }

    public void setCreditCardNumber(long creditCardNumber) {
        this.creditCardNumber = creditCardNumber;
    }

    @Override
    public int compareTo(Notification o) {
        if (getReservationDate() == null || o.getReservationDate() == null)
            return 0;
        return getReservationDate().compareTo(o.getReservationDate());
    }

}
