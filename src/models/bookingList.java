package models;

import java.util.ArrayList;
import java.util.List;

public class bookingList {

    private Booking booking;


    private List<Booking> bookingList;

    public bookingList() {
	bookingList = new ArrayList<>();
    }

	public void addBooking(Booking newBooking) {
		bookingList.add(booking);
	}
	
	public List<Booking> getBookingList() {
		return bookingList;
	}
	
	public int getNumberOfBookings() {
		return bookingList.size();
	}
	
	public Booking findBooking(String customerName) throws BookingNotFoundException
	{
		customerName = customerName.trim();
		
		for (Booking nextBooking: bookingList) {
			if (nextBooking.getCustomerName().equalsIgnoreCase(customerName)) {
				return nextBooking;
			}
		}
		
		throw new BookingNotFoundException();
	}    
    
}