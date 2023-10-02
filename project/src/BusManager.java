
class BusManager {
    private static final int MAX_BUSES = 100;
    public Bus[] buses;
    private int numberOfBuses;

    public BusManager() {
        buses = new Bus[MAX_BUSES];
        numberOfBuses = 0;
    }

    // Method to add a bus to the array
    public void addBus(String busNumber, int totalSeats) {
        if (numberOfBuses < MAX_BUSES) {
            buses[numberOfBuses++] = new Bus(busNumber, totalSeats);
            System.out.println("Bus added successfully.");
        } else {
            System.out.println("Bus database is full. Cannot add more buses.");
        }
    }

    // Method to remove a bus from the array by bus number
    public void removeBus(String busNumber) {
        for (int i = 0; i < numberOfBuses; i++) {
            if (buses[i].getBusNumber().equals(busNumber)) {
                for (int j = i; j < numberOfBuses - 1; j++) {
                    buses[j] = buses[j + 1];
                }
                numberOfBuses--;
                System.out.println("Bus removed successfully.");
                return;
            }
        }
        System.out.println("Bus with number " + busNumber + " not found.");
    }

    // Method to display all buses in the array
    public void displayBuses() {
        System.out.println("List of Buses:");
        for (int i = 0; i < numberOfBuses; i++) {
            System.out.println(buses[i]);
        }
    }
}
