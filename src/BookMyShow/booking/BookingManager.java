package BookMyShow.booking;

import BookMyShow.Enums.BookingStatus;
import BookMyShow.Users.Person;
import BookMyShow.movie.Show;
import BookMyShow.movie.ShowSeat;

import java.util.HashMap;
import java.util.List;

public class BookingManager {

    HashMap<Integer, Booking> bookingHashMap;

    private BookingManager(){
        bookingHashMap = new HashMap<>();
    }
    public static BookingManager instance;
    public static BookingManager getInstance() {
        if (instance == null){
            instance = new BookingManager();
        }
        return instance;
    }


    public Booking createBooking(Show show, List<ShowSeat> seatList, Person person) {

        Booking booking = new Booking();
        booking.setShow(show);
        int id = bookingHashMap.size() + 1;
        booking.setBookingId(id);
        booking.setBookingStatus(BookingStatus.PENDING);
        booking.setSeatList(seatList);
        booking.setUser(person);

        bookingHashMap.put(id, booking);
        System.out.println("Booking created for the user: " + person.getName() + "" +
                "show name is: " + show.getMovie().getTitle());

        return booking;
    }



}
