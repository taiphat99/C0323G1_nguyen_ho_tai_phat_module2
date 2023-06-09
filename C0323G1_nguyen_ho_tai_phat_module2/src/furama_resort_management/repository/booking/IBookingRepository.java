package furama_resort_management.repository.booking;

import furama_resort_management.model.booking.Booking;

import java.util.Set;

public interface IBookingRepository {
    Booking findById(String bookingId);
    void add(Booking booking);
    Set<Booking> getAll();
}
