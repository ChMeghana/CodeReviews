package collections;

import java.util.TreeSet;
import java.util.Scanner;

public class NextAvailableSeat {
    public static void main(String[] args) {
        // Example available seat numbers
        TreeSet<Integer> seats = new TreeSet<>();
        seats.add(1);
        seats.add(3);
        seats.add(5);
        seats.add(7);
        seats.add(9);

        System.out.println("Available seats: " + seats);

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter seat number to book: ");
        int bookedSeat = sc.nextInt();

        // Remove the booked seat from available seats
        if (seats.remove(bookedSeat)) {
            System.out.println("Seat " + bookedSeat + " booked successfully.");
        } else {
            System.out.println("Seat " + bookedSeat + " is not available.");
        }

        // Find the next higher available seat
        Integer nextSeat = seats.higher(bookedSeat);

        if (nextSeat != null) {
            System.out.println("Next available seat after " + bookedSeat + " is: " + nextSeat);
        } else {
            System.out.println("No higher seat available after " + bookedSeat);
        }

        sc.close();
    }
}

