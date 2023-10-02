
class Bus {
    private final String busNumber;
    private final Seat[] seats;

    public Bus(String busNumber, int totalSeats) {
        this.busNumber = busNumber;
        this.seats = new Seat[totalSeats];
        initializeSeats();
    }

    private void initializeSeats() {
        for (int i = 0; i < seats.length; i++) {
            BookingClass bookingClass;
            if (i < seats.length / 3) {
                bookingClass = BookingClass.FIRST_CLASS;
            } else if (i < 2 * seats.length / 3) {
                bookingClass = BookingClass.BUSINESS;
            } else {
                bookingClass = BookingClass.ECONOMY;
            }
            seats[i] = new Seat(i + 1, bookingClass);
        }
    }

    public String getBusNumber() {
        return busNumber;
    }

    public Seat[] getSeats() {
        return seats;
    }

    public Seat getSeat(int seatNumber) {
        for (Seat seat : seats) {
            if (seat.getSeatNumber() == seatNumber) {
                return seat;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return "Bus Number: " + busNumber + " | Total Seats: " + seats.length;
    }
}

