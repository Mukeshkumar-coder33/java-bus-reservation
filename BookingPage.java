import java.util.Scanner;

public class BookingPage {

    static Scanner sc = new Scanner(System.in);

    public static void bookBus() {

        sc.nextLine();
        System.out.print("Enter User Name: ");
        String name = sc.nextLine();

        System.out.println("\nAvailable Routes:");
        System.out.println("1. Coimbatore-Cumbum");
        System.out.println("2. Madurai-Coimbatore");
        System.out.print("Choose route: ");
        int routeChoice = sc.nextInt();

        String route = (routeChoice == 1)
                ? "Coimbatore-Cumbum"
                : "Madurai-Coimbatore";

        System.out.println("\nAvailable Bus Types:");
        System.out.println("1. AC");
        System.out.println("2. NON-AC");
        System.out.print("Choose bus type: ");
        int typeChoice = sc.nextInt();

        String type = (typeChoice == 1) ? "AC" : "NON-AC";

        System.out.print("Enter number of seats needed: ");
        int seatsNeeded = sc.nextInt();

        for (Bus bus : BusService.buses) {
            if (bus.route.equals(route)
                    && bus.type.equals(type)
                    && bus.availableSeats() >= seatsNeeded) {

                int seatNo = 1, booked = 0;

                while (seatNo <= 35 && booked < seatsNeeded) {
                    if (!bus.bookedSeats.contains(seatNo)) {
                        bus.bookedSeats.add(seatNo);
                        System.out.println("Seat " + seatNo + " booked");
                        booked++;
                    }
                    seatNo++;
                }

                System.out.println("\nBooking Successful!");
                System.out.println("Passenger Name: " + name);
                System.out.println("Bus No: " + bus.busNo);
                return;
            }
        }

        System.out.println("Seats not available / Already booked");
    }
}
