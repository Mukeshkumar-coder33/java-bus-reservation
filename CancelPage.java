import java.util.Scanner;

public class CancelPage {

    static Scanner sc = new Scanner(System.in);

    public static void cancelSeat() {

        System.out.print("Enter Bus Number: ");
        int busNo = sc.nextInt();

        System.out.print("Enter Seat Number (1-35): ");
        int seatNo = sc.nextInt();

        for (Bus bus : BusService.buses) {
            if (bus.busNo == busNo) {
                if (bus.bookedSeats.contains(seatNo)) {
                    bus.bookedSeats.remove(Integer.valueOf(seatNo));
                    System.out.println("Seat cancelled successfully");
                } else {
                    System.out.println("Seat already available");
                }
                return;
            }
        }

        System.out.println("Invalid bus number");
    }
}
