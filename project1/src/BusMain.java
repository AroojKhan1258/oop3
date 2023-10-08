public class BusMain {
    public static void main(String[] args) {
        BusManager busManager = new BusManager();

        busManager.addBus("ABC123", 30);
        busManager.addBus("XYZ789", 40);

        busManager.displayBuses();

        // Example of booking a seat
        Bus bus = busManager.buses[0];
        Seat seatToBook = bus.getSeat(5);
        if (seatToBook != null) {
            seatToBook.book();
            System.out.println("Seat " + seatToBook.getSeatNumber() + " booked.");
        }


    }
}
