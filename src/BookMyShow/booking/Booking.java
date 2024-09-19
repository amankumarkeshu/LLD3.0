package BookMyShow.booking;

import BookMyShow.Enums.BookingStatus;
import BookMyShow.Users.Person;
import BookMyShow.movie.Show;
import BookMyShow.movie.ShowSeat;

import java.util.Date;
import java.util.List;

public class Booking {

    int bookingId;

    List<ShowSeat> seatList;
    Show show;
    BookingStatus bookingStatus;

    Person user;

    Date createdAt;

    public void setBookingId(int bookingId) {
        this.bookingId = bookingId;
    }

    public void setSeatList(List<ShowSeat> seatList) {
        this.seatList = seatList;
    }

    public void setShow(Show show) {
        this.show = show;
    }

    public void setBookingStatus(BookingStatus bookingStatus) {
        this.bookingStatus = bookingStatus;
    }

    public void setUser(Person user) {
        this.user = user;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }



}
