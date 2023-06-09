package furama_resort_management.repository.booking.impl;

import furama_resort_management.model.booking.Booking;
import furama_resort_management.repository.booking.IBookingRepository;

import java.util.Set;
import java.util.TreeSet;

public class BookingRepository implements IBookingRepository {

    private static Set<Booking> bookingSet = new TreeSet<>();

    static {
    bookingSet.add(new Booking("BK-1234","2023-06-05","2023-06-01","2023-06-10","KH-6666","SVVL-1111"));
    bookingSet.add(new Booking("BK-2345","2023-06-01","2023-06-06","2023-06-10","KH-6666","SVVL-1234"));
    bookingSet.add(new Booking("BK-3456","2023-01-09","2023-06-03","2023-06-10","KH-6666","SVVL-1234"));
    bookingSet.add(new Booking("BK-3956","2023-01-06","2023-06-09","2023-06-10","KH-6666","SVVL-1234"));
    bookingSet.add(new Booking("BK-3556","2023-02-05","2023-06-09","2023-06-10","KH-6666","SVVL-1234"));
    bookingSet.add(new Booking("BK-3056","2023-01-03","2023-06-01","2023-06-11","KH-6666","SVVL-1234"));

    }

    public void add(Booking booking) {
        bookingSet.add(booking);
    }
    public Set<Booking> getAll(){
        return bookingSet;
    }
    @Override
    public Booking findById(String bookingId) {
      return null;
    }
}
