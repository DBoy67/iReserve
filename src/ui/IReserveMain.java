package ui;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;
import models.Airplane;
import models.AirplaneInterface;
import models.CustomerCatalog;
import models.EconomyClassTicket;
import models.FirstClassTicket;
import models.Seat;
<<<<<<< HEAD
//import models.Ticket;
=======
import models.Ticket;
import utilities.TravelClass;
>>>>>>> branch 'master' of https://github.com/DBoy67/iReserve.git

/**
 *
 * @author DBoy67
 * @author SirhH
 */
public class IReserveMain {
    
    private static void handleBooking(Ticket ticket, NumberFormat numberFormatter, Airplane airplane) {
        if (ticket != null) {
            System.out.println("Ticket price is: " + numberFormatter.format(ticket.getTicketPrice()));
            System.out.println("Checking for available seats in " + ticket.getTravelClass());
            if (airplane.getNextFreeSeat(TravelClass.FIRST) != null) {
                Seat assignedSeat = airplane.getNextFreeSeat(TravelClass.FIRST);
                System.out.println("You've been assigned: " + assignedSeat);
                airplane.toggleSeatStatus(assignedSeat);
                System.out.println("Seat status is now " + assignedSeat.getSeatStatus());
            } else {
                System.out.println("Sorry. This plane is fullbooked.");
            }
        }

    }

/*	public static void main(String[] args) {
		int whatToDo = 0;
		Scanner in = new Scanner(System.in);
		NumberFormat numberFormatter;
		numberFormatter =
		NumberFormat.getCurrencyInstance(Locale.forLanguageTag("sv-SE"));
                Airplane airplane = new Airplane(0, "FirstPlane", 10);
                //assigning seats in the airplane
                //seatIds will be from 0-9 
                //if 1-10 is wished for just write (i+1) in the to be the
                //seatId in the Seat constructor
                for(int i=0; i<10; i++){
                    if(i<5){
                        airplane.putSeat(i, new Seat(i, TravelClass.FIRST));
                    }else{
                        airplane.putSeat(i, new Seat(i, TravelClass.ECONOMY));
                    }
                }
		
		while (whatToDo != 8) {
			System.out.println("Welcome to the Airlines booking service. What do you want to do?");

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
					String custName;
					String classChoice;
					System.out.print("Please enter your name : ");
					custName = in.nextLine();
					CustomerCatalog customer = new CustomerCatalog(custName);
					System.out.println("Welcome " + customer.getCustomerName());
					System.out.println(" ");
					System.out.print("Please choose First Class or Economy Class (F/E): ");
					classChoice = in.nextLine().toUpperCase();
                                        Ticket ticket=null;
					if (classChoice.equals("F")) {
						ticket = new FirstClassTicket();
                                                
					} else if (classChoice.equals("E")) {
						ticket = new EconomyClassTicket();
						
					}else{
                                            System.out.println("Not a vaid command.");
                                        }
                                        handleBooking(ticket,numberFormatter,airplane);
					System.out.println(" ");
					System.out.println("Program ended.");
					whatToDo = 8;
					break;
                                case 2: break;
                                case 3: break;
                                case 4: break;
                                case 5: break;
                                case 6: break;
                                case 7: break;
				case 8:
					System.out.println("Ending program");
					in.close();
				}
			} catch (NumberFormatException nfe) {
				System.out.println("Wrong input. Please choose a number from the menu.");
				System.out.println(" ");
			}
//					plane.;
//					customer;
//					Airplane.updateSeats
//					int planeNo = plane.getPlaneNo();
//					CustomerInterface customer = new Customer(custName, );	
//					bookings.add(customer);
//					System.out.println("Welcome " + customer.getCustomerName());
//					System.out.println(" ");
//					System.out.print("Please choose First Class or Economy Class (F/E): ");
//					classChoice = in.nextLine().toUpperCase();
//					if (classChoice.equals("F")) {
//						Ticket ticket = new Ticket(classChoice);
//						System.out.println("Ticket price is: " + numberFormatter.format(ticket.getTicketPrice()));
//						System.out.println("Checking for available seats in " + ticket.getTicketClass());					   
//					} else if (classChoice.equals("E")) {
//						Ticket ticket = new Ticket(classChoice);
//						System.out.println("Ticket price is: " + numberFormatter.format(ticket.getTicketPrice()));
//						System.out.println("Checking for available seats in " + ticket.getTicketClass());

<<<<<<< HEAD
	}*/
=======
			System.out.println(" ");
			System.out.println("Program ended.");
			break;
		    case 8:
			System.out.println("Ending program");
			in.close();
		}
	    } catch (NumberFormatException nfe) {
		System.out.println("Wrong input. Please choose a number from the menu.");
		System.out.println(" ");
	    }
	}

    
>>>>>>> branch 'master' of https://github.com/DBoy67/iReserve.git
}

//
// System.out.print("Please choose First Class or Economy CLass (F/E): ");
// Ticket ticket1 = new Ticket(in.nextLine());
// System.out.println("You have chosen " + ticket1.getTicketClass() + " which
// costs " + numberFormatter.format(ticket1.getTicketPrice()));
//
// in.close();
// }
