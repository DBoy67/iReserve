package ui;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;
import models.Booking;
import models.Flight;
import models.IFlight;
import models.Seat;
import models.Ticket;

/**
 *
 * @author DBoy67
 */
public class BookerMain {

    public static void main(String[] args) {
	int whatToDo = 0;
	Scanner in = new Scanner(System.in);
	NumberFormat numberFormatter;
	numberFormatter = NumberFormat.getCurrencyInstance(Locale.forLanguageTag("sv-SE"));
	IFlight flight = new Flight();

	while (whatToDo != 8) {
	    System.out.println("Welcome. What do you want to do?");

	    System.out.println("1. Book a flight.");
	    System.out.println("8. Exit");
	    System.out.print("Please choose a number: ");

	    try {

		whatToDo = Integer.parseInt(in.nextLine());

		switch (whatToDo) {
		    case 1:
			String passengerName;
			String classChoice;
			String travelClass;
			boolean freeSeat;
			int seatNo;
			String wannaSwitchClass;

			System.out.print("Please enter your name : ");
			passengerName = in.nextLine();
			Booking booking = new Booking(passengerName);
			System.out.println("Welcome " + booking.getCustomerName());
			System.out.println(" ");

			System.out.print("Please choose First Class or Economy Class (F/E): ");
			classChoice = in.nextLine();

			if (classChoice.equalsIgnoreCase("F")) {
			    freeSeat = flight.findFreeSeat(classChoice);

			    if (freeSeat == true) {
				Ticket ticket = new Ticket(classChoice);
				seatNo = flight.setSeat(classChoice);
				Seat seat = new Seat(seatNo, classChoice, "Occupied");
				booking.setSeat(seat);
				booking.setTravelClass(ticket.getTicketClass());
				booking.setTicketPrice(ticket.getTicketPrice());
				System.out.println("Your seat nr in " + booking.getTravelClass() + " is " + booking.getSeat().getSeatNo() + " and the ticket price is " + numberFormatter.format(booking.getTicketPrice()));
				break;
			    } else if (freeSeat == false) {
				System.out.println("Sorry. There are no free seats in First Class");
				System.out.print("Would you like to check for free seats in Economy Class (Y/N)? ");
				wannaSwitchClass = in.nextLine();
				if (wannaSwitchClass.equalsIgnoreCase("Y")) {
				    classChoice = "E";
				    freeSeat = flight.findFreeSeat(classChoice);
				    if (freeSeat == true) {
					Ticket ticket = new Ticket(classChoice);
					seatNo = flight.setSeat(classChoice);
					Seat seat = new Seat(seatNo, classChoice, "Occupied");
					booking.setSeat(seat);
					booking.setTravelClass(ticket.getTicketClass());
					booking.setTicketPrice(ticket.getTicketPrice());
					System.out.println("Your seat nr in " + booking.getTravelClass() + " is " + booking.getSeat().getSeatNo() + " and the ticket price is " + numberFormatter.format(booking.getTicketPrice()));
					break;
				    } else if (wannaSwitchClass.equalsIgnoreCase("N")) {
					System.out.println("Sorry but the the flight is fully booked.");
					break;
				    }
				}
			    }
			}
			if (classChoice.equalsIgnoreCase("E")) {
			    freeSeat = flight.findFreeSeat(classChoice);
			    if (freeSeat == true) {
				Ticket ticket = new Ticket(classChoice);
				seatNo = flight.setSeat(classChoice);
				Seat seat = new Seat(seatNo, classChoice, "Occupied");
				booking.setSeat(seat);
				booking.setTravelClass(ticket.getTicketClass());
				booking.setTicketPrice(ticket.getTicketPrice());
				System.out.println("Your seat nr in " + booking.getTravelClass() + " is " + booking.getSeat().getSeatNo() + " and the ticket price is " + numberFormatter.format(booking.getTicketPrice()));
				break;
			    } else if (freeSeat == false) {
				System.out.println("Sorry. There are no free seats in Economy Class");
				System.out.print("Would you like to check for free seats in First Class (Y/N)? ");
				wannaSwitchClass = in.nextLine();
				if (wannaSwitchClass.equalsIgnoreCase("Y")) {
				    classChoice = "F";
				    freeSeat = flight.findFreeSeat(classChoice);
				    if (freeSeat == true) {
					Ticket ticket = new Ticket(classChoice);
					seatNo = flight.setSeat(classChoice);
					Seat seat = new Seat(seatNo, classChoice, "Occupied");
					booking.setSeat(seat);
					booking.setTravelClass(ticket.getTicketClass());
					booking.setTicketPrice(ticket.getTicketPrice());
					System.out.println("Your seat nr in " + booking.getTravelClass() + " is " + booking.getSeat().getSeatNo() + " and the ticket price is " + numberFormatter.format(booking.getTicketPrice()));
					break;
				    } else if (wannaSwitchClass.equalsIgnoreCase("N")) {
					System.out.println("Sorry but the the flight is fully booked.");
					break;
				    }
				}
			    }
			}
		    case 8:
			in.close();
			System.exit(0);
		}
	    } catch (NumberFormatException nfe) {
		System.out.println("Wrong input. Please choose a number from the menu.");
		System.out.println(" ");
	    }
	}
    }

}
