import java.util.ArrayList;

public class BusService {

    public static ArrayList<Bus> buses = new ArrayList<>();

    public static void createBuses() {
        int busNo = 1;

        // Coimbatore → Cumbum
        for (int i = 0; i < 3; i++)
            buses.add(new Bus(busNo++, "Coimbatore-Cumbum", "AC"));

        for (int i = 0; i < 2; i++)
            buses.add(new Bus(busNo++, "Coimbatore-Cumbum", "NON-AC"));

        // Madurai → Coimbatore
        while (buses.size() < 10) {
            buses.add(new Bus(
                    busNo++,
                    "Madurai-Coimbatore",
                    (busNo % 2 == 0) ? "AC" : "NON-AC"
            ));
        }
    }
}
