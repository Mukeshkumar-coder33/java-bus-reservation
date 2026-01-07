import java.util.Scanner;

public class main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        BusService.createBuses();

        while (true) {
            System.out.println("\n--- BUS RESERVATION SYSTEM ---");
            System.out.println("1. Book a Bus");
            System.out.println("2. Cancel Bus Seat");
            System.out.println("3. Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1 -> BookingPage.bookBus();
                case 2 -> CancelPage.cancelSeat();
                case 3 -> {
                    System.out.println("Thank you! Exiting...");
                    sc.close();
                    return;
                }
                default -> System.out.println("Invalid choice");
            }
        }
    }
}
