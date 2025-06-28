import java.util.*;

public class FlightBookingSystem {

    // Array of available flights (String format: "FlightNumber - From - To")
    static String[] availableFlights = {
        "AI101 - Delhi - Mumbai",
        "AI102 - Mumbai - Delhi",
        "AI103 - Bangalore - Chennai",
        "AI104 - Chennai - Bangalore",
        "AI105 - Delhi - Kolkata"
    };

    // List to store user bookings
    static List<String> bookings = new ArrayList<>();

    // Search flights (case-insensitive)
    public static void searchFlights(String from, String to) {
        boolean found = false;
        System.out.println("Available flights from " + from + " to " + to + ":");
        for (String flight : availableFlights) {
            if (flight.toLowerCase().contains(from.toLowerCase()) &&
                flight.toLowerCase().contains(to.toLowerCase())) {
                System.out.println(" - " + flight);
                found = true;
            }
        }
        if (!found) {
            System.out.println("No flights found.");
        }
    }

    // Book a flight by flight number
    public static void bookFlight(String flightNumber) {
        boolean exists = false;
        for (String flight : availableFlights) {
            if (flight.toLowerCase().startsWith(flightNumber.toLowerCase())) {
                bookings.add(flight);
                System.out.println("Flight booked: " + flight);
                exists = true;
                break;
            }
        }
        if (!exists) {
            System.out.println("Invalid flight number. Booking failed.");
        }
    }

    // Display all bookings
    public static void showBookings() {
        if (bookings.isEmpty()) {
            System.out.println("No bookings yet.");
        } else {
            System.out.println("Your bookings:");
            for (String booking : bookings) {
                System.out.println(" - " + booking);
            }
        }
    }

    // Main method with menu
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("\n=== Flight Booking System ===");
            System.out.println("1. Search Flights");
            System.out.println("2. Book Flight");
            System.out.println("3. View Bookings");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter source: ");
                    String from = sc.nextLine();
                    System.out.print("Enter destination: ");
                    String to = sc.nextLine();
                    searchFlights(from, to);
                    break;
                case 2:
                    System.out.print("Enter flight number to book (e.g., AI101): ");
                    String flightNumber = sc.nextLine();
                    bookFlight(flightNumber);
                    break;
                case 3:
                    showBookings();
                    break;
                case 0:
                    System.out.println("Thank you for using the system!");
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }

        } while (choice != 0);

        sc.close();
    }
}
