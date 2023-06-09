package furama_resort_management.model.booking;

import java.time.LocalDate;
import java.util.Objects;

public class Booking implements Comparable<Booking> {
    private String bookingId;
    private String bookingDate;
    private String startedDate;
    private String endedDate;
    private String customerId;
    private String facilityId;

    public Booking(String bookingId, String bookingDate, String startedDate, String endedDate, String customerId, String facilityId) {
        this.bookingId = bookingId;
        this.bookingDate = bookingDate;
        this.startedDate = startedDate;
        this.endedDate = endedDate;
        this.customerId = customerId;
        this.facilityId = facilityId;
    }

    public String getBookingId() {
        return bookingId;
    }

    public void setBookingId(String bookingId) {
        this.bookingId = bookingId;
    }

    public String getBookingDate() {
        return bookingDate;
    }

    public void setBookingDate(String bookingDate) {
        this.bookingDate = bookingDate;
    }

    public String getStartedDate() {
        return startedDate;
    }

    public void setStartedDate(String startedDate) {
        this.startedDate = startedDate;
    }

    public String getEndedDate() {
        return endedDate;
    }

    public void setEndedDate(String endedDate) {
        this.endedDate = endedDate;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getFacilityId() {
        return facilityId;
    }

    public void setFacilityId(String facilityId) {
        this.facilityId = facilityId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Booking booking = (Booking) o;
        return Objects.equals(bookingId, booking.bookingId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookingId);
    }

    @Override
    public String toString() {
        return "Booking: " +
                "Booking ID = " + bookingId +
                ", Booking Date = " + bookingDate +
                ", Started Date = " + startedDate +
                ", Ended Date = " + endedDate +
                ", Customer ID = " + customerId +
                ", Facility ID = " + facilityId;
    }


    @Override
    public int compareTo(Booking o) {
        LocalDate startedDate = LocalDate.parse(this.startedDate);
        LocalDate oStartedDate = LocalDate.parse(o.startedDate);
        LocalDate endedDate = LocalDate.parse(this.endedDate);
        LocalDate oEndedDate = LocalDate.parse(o.endedDate);
        if (startedDate.equals(oStartedDate)) {
            if (endedDate.equals(oEndedDate)) {
                return this.bookingId.compareTo(o.bookingId);
            }
            return endedDate.compareTo(oEndedDate);
        } else {
            return startedDate.compareTo(oStartedDate);
        }
    }
}

