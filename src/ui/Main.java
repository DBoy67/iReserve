package ui;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;
import models.Airplane;

import models.bookingMap;
import models.Seat;
import models.Ticket;

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
	Airplane airplane = new Airplane(1710);

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
			String customerName;
			String classChoice;
			String classChoice2;
			String travelClass;
			int seatNo;

			System.out.print("Please enter your name : ");
			customerName = in.nextLine();
			System.out.println("Welcome " + customerName);
			System.out.println(" ");

			System.out.print("Please choose First Class or Economy Class (F/E): ");
			classChoice = in.nextLine();
			switch (classChoice) {
			    case "F":
				if (airplane.getFCSeatMapSize() < 2) {
				    seatNo = airplane.getFCSeatMapSize() + 1;
				    airplane.addSeat(seatNo);
				    System.out.println("You have been awarded seat no: " + seatNo);
				    break;
				} else if (airplane.getFCSeatMapSize() >= 2) {
				    System.out.println("Sorry but there are no free seats in First Class.");
				    System.out.println("Would you like to check in Economy class? (Y/N)");
				    if (in.nextLine().equalsIgnoreCase("Y")) {
					if (airplane.getECSeatMapSize() < 2) {
					    seatNo = airplane.getECSeatMapSize() + 6;
					    airplane.addSeat(seatNo);
					    System.out.println("You have been awarded seat no: " + seatNo);
					    break;
					} else if (airplane.getECSeatMapSize() >= 2) {
					    System.out.println("Sorry but it seems the plane is fully booked.");
					    break;

					} else if (in.nextLine().equalsIgnoreCase("N")) {
					    System.out.println("Very well. Welcome back");
					    break;

					}
				    }
				    break;
				}
			    case "E":
				if (airplane.getECSeatMapSize() < 5) {
				    seatNo = airplane.getECSeatMapSize() + 6;
				    airplane.addSeat(seatNo);
				    System.out.println("You have been awarded seat no: " + seatNo);
				    break;
				} else if (airplane.getECSeatMapSize() >= 5) {
				    System.out.println("Sorry but there are no free seats in Economy Class.");
				    System.out.println("Would you like to check in First class? (Y/N)");
				    if (in.nextLine().equalsIgnoreCase("Y")) {
					if (airplane.getFCSeatMapSize() < 5) {
					    seatNo = airplane.getFCSeatMapSize() + 1;
					    airplane.addSeat(seatNo);
					    System.out.println("You have been awarded seat no: " + seatNo);
					    break;
					} else if (airplane.getFCSeatMapSize() >= 5) {
					    System.out.println("Sorry but it seems the plane is fully booked.");
					    break;
					} else if (in.nextLine().equalsIgnoreCase("N")) {
					    System.out.println("Very well. Welcome back");
					    break;
					}
				    }
				}
			}
			break;

//			System.out.println("Food choice not implemented");
//			Ticket ticket;
//		ticket = new Ticket(travelClass);
//			System.out.println(" ");
//			System.out.println("Program ended.");
////
		    case 8:
			System.out.println("Ending program");
		        in.close();
			break;
		}
	    } catch (NumberFormatException nfe) {
		System.out.println("Wrong input. Please choose a number from the menu.");
		System.out.println(" ");
	    }
	}
    }

}

//
// System.out.print("Please choose First Class or Economy CLass (F/E): ");
// Ticket ticket1 = new Ticket(in.nextLine());
// System.out.println("You have chosen " + ticket1.getTicketClass() + " which
// costs " + numberFormatter.format(ticket1.getTicketPrice()));
//
// in.close();
// }
