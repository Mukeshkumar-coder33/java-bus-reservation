import java.util.ArrayList;

public class Bus {
    int busNo;
    String route;
    String type; // AC or NON-AC
    ArrayList<Integer> bookedSeats = new ArrayList<>();

    public Bus(int busNo, String route, String type) {
        this.busNo = busNo;
        this.route = route;
        this.type = type;
    }

    public int availableSeats() {
        return 35 - bookedSeats.size();
    }
}
