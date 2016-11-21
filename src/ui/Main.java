package ui;

import models.BookedFullException;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;
import models.PassengerPlane;
import models.Booking;
import models.IPlane;

/**
 *
 * @author DBoy67
 */
public class Main {

    public static void main(String[] args) {
	int whatToDo = 0;
	Scanner in = new Scanner(System.in);
	NumberFormat numberFormatter;
	numberFormatter = NumberFormat.getCurrencyInstance(Locale.forLanguageTag("sv-SE"));

	IPlane passengerPlane = new PassengerPlane();

	while (whatToDo != 8) {
	    System.out.println("Welcome. What do you want to do?");

	    System.out.println("1. Book a flight.");
	    // System.out.println("2. Change class.");
	    // System.out.println("3. Order food.");
	    // System.out.println("4. Find a booking.");
	    // System.out.println("5. Find a customer.");
	    // System.out.println("6. List all bookings.");
	    // System.out.println("7. List all customers");
	    System.out.println("8. Exit");
	    System.out.print("Please choose a number: ");

	    try {

		whatToDo = Integer.parseInt(in.nextLine());

		switch (whatToDo) {
		    case 1:
			String passengerName;
			String classChoice;
			String travelClass;
			int seatNo;

			System.out.print("Please enter your name : ");
			passengerName = in.nextLine();
			Booking booking = new Booking(passengerName);
			System.out.println("Welcome " + booking.getCustomerName());
			System.out.println(" ");

			System.out.print("Please choose First Class or Economy Class (F/E): ");
			classChoice = in.nextLine();
			try {
			    seatNo = passengerPlane.findFreeSeat(classChoice);
			    System.out.println("Your seatnumber is: " + seatNo);
			} catch (BookedFullException b) {
			    System.out.println("Error: " + b);

			}
			

		}
	    } catch (NumberFormatException nfe) {
		System.out.println("Wrong input. Please choose a number from the menu.");
		System.out.println(" ");
	    }
	}
    }

}
