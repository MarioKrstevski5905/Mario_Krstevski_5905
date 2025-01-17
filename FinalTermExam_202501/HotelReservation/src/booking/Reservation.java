package booking;

import java.time.LocalDate;
import java.util.ArrayList;

public class Reservation {
    private String reservationCode;
    private LocalDate checkInDate;
    private LocalDate checkOutDate;
    private String roomType;
    private ArrayList<Guest> guests;

    public Reservation() {
        guests = new ArrayList<>();
    }

    public Reservation(String reservationCode, LocalDate checkInDate, LocalDate checkOutDate, String roomType) {
        this.reservationCode = reservationCode;
        this.checkInDate = checkInDate;
        this.checkOutDate = checkOutDate;
        this.roomType = roomType;
        this.guests = new ArrayList<>();
    }

    public String getReservationCode() {
        return reservationCode;
    }

    public void setReservationCode(String reservationCode) {
        this.reservationCode = reservationCode;
    }

    public LocalDate getCheckInDate() {
        return checkInDate;
    }

    public void setCheckInDate(LocalDate checkInDate) {
        this.checkInDate = checkInDate;
    }

    public LocalDate getCheckOutDate() {
        return checkOutDate;
    }

    public void setCheckOutDate(LocalDate checkOutDate) {
        this.checkOutDate = checkOutDate;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public ArrayList<Guest> getGuests() {
        return guests;
    }

    public void setGuests(ArrayList<Guest> guests) {
        this.guests = guests;
    }
}