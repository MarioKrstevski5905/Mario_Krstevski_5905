package booking;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.Collectors;

public class HotelDemo {
    public Guest createGuest(String firstName, String lastName, String passportNumber) {
        return new Guest(firstName, lastName, passportNumber);
    }

    public void displayGuestInfo(Guest guest) {
        System.out.println("First Name: " + guest.getFirstName());
        System.out.println("Last Name: " + guest.getLastName());
        System.out.println("Passport Number: " + guest.getPassportNumber());
    }

    public Reservation createReservation(String reservationCode, LocalDate checkInDate, LocalDate checkOutDate, String roomType) {
        return new Reservation(reservationCode, checkInDate, checkOutDate, roomType);
    }

    public void displayReservationInfo(Reservation reservation) {
        System.out.println("Reservation Code: " + reservation.getReservationCode());
        System.out.println("Check-In Date: " + reservation.getCheckInDate());
        System.out.println("Check-Out Date: " + reservation.getCheckOutDate());
        System.out.println("Room Type: " + reservation.getRoomType());
        System.out.println("Guests:");
        for (Guest guest : reservation.getGuests()) {
            displayGuestInfo(guest);
            System.out.println();
        }
    }

    public void addGuestToReservation(Reservation reservation, Guest guest) {
        reservation.getGuests().add(guest);
    }

    public ArrayList<Guest> findGuestsInReservation(Reservation reservation, String lastName) {
        return reservation.getGuests().stream()
                .filter(guest -> guest.getLastName().equalsIgnoreCase(lastName))
                .collect(Collectors.toCollection(ArrayList::new));
    }

    public static void main(String[] args) {
        HotelDemo demo = new HotelDemo();
        ArrayList<Guest> guestList = new ArrayList<>();
        List<String> guestNames = List.of("Mario Krstevski", "Jovan Jovanovski", "Ana Jovevska", "Milena Milenkova", "Stefan Stefanovski");
        Random random = new Random();

        for (String name : guestNames) {
            String[] parts = name.split(" ");
            String passportNumber = "PB" + (100000 + random.nextInt(900000));
            Guest guest = demo.createGuest(parts[0], parts[1], passportNumber);
            guestList.add(guest);
        }

        Reservation reservation1 = demo.createReservation("RES001", LocalDate.of(2024, 1, 1), LocalDate.of(2024, 1, 5), "Single");
        Reservation reservation2 = demo.createReservation("RES002", LocalDate.of(2024, 1, 10), LocalDate.of(2024, 1, 15), "Double");
        Reservation reservation3 = demo.createReservation("RES003", LocalDate.of(2024, 1, 20), LocalDate.of(2024, 1, 25), "Suite");

        demo.addGuestToReservation(reservation1, guestList.get(0));
        demo.addGuestToReservation(reservation1, guestList.get(1));
        demo.addGuestToReservation(reservation2, guestList.get(2));
        demo.addGuestToReservation(reservation2, guestList.get(3));
        demo.addGuestToReservation(reservation3, guestList.get(4));

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter last name to search for guests in reservation RES001: ");
        String lastName = scanner.nextLine();
        ArrayList<Guest> foundGuests = demo.findGuestsInReservation(reservation1, lastName);
        if (foundGuests.isEmpty()) {
            System.out.println("No guests found with last name: " + lastName);
        } else {
            System.out.println("Found guests:");
            for (Guest guest : foundGuests) {
                demo.displayGuestInfo(guest);
            }
        }

        System.out.println("\nReservation Information:");
        demo.displayReservationInfo(reservation1);
        demo.displayReservationInfo(reservation2);
        demo.displayReservationInfo(reservation3);

        scanner.close();
    }
}