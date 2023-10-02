class Seat {
    private final int seatNumber;
    private boolean isBooked;
    private final BookingClass bookingClass;

    public Seat(int seatNumber, BookingClass bookingClass) {
        this.seatNumber = seatNumber;
        this.isBooked = false;
        this.bookingClass = bookingClass;
    }

    public int getSeatNumber() {
        return seatNumber;
    }

    public boolean isBooked() {
        return isBooked;
    }

    public void book() {
        isBooked = true;
    }

    public void unbook() {
        isBooked = false;
    }

    public BookingClass getBookingClass() {
        return bookingClass;
    }

    @Override
    public String toString() {
        return "Seat Number: " + seatNumber + " | Class: " + bookingClass + " | Booked: " + isBooked;
    }
}
