package models;

import java.util.TreeMap;

public class bookingMap {

    private Booking booking;


    private TreeMap<String, Booking> bookingMap;

    public bookingMap() {
	bookingMap = new TreeMap<String, Booking>();
    }

	public void addBooking(Booking newBooking) {
		bookingMap.put(newBooking.getCustomerID(),newBooking);
	}
	
	public TreeMap<String,Booking> getBookingMap() {
		return bookingMap;
	}
	
	public int getNumberOfBookings() {
		return bookingMap.size();
	}
	
	public Booking findBooking(String customerName) throws BookingNotFoundException
	{
		customerName = customerName.trim();
		
		for (Booking nextBooking: bookingMap.values()) {
			if (nextBooking.getCustomerName().equalsIgnoreCase(customerName)) {
				return nextBooking;
			}
		}
		
		throw new BookingNotFoundException();
	}    
    
}