package ui;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

import models.Customer;
import models.Ticket;

/**
 *
 * @author DBoy67
 */
public class IReserveMain {
	
	
	public static void main(String[] args) {
		
		NumberFormat numberFormatter;
	    numberFormatter = NumberFormat.getCurrencyInstance(Locale.forLanguageTag("sv-SE"));
		Scanner in = new Scanner(System.in);
		System.out.print("Welcome. Please enter your name: ");
		Customer customer1 = new Customer(in.nextLine());
		System.out.println("Welcome " + customer1.getCustomerName());

		System.out.print("Please choose First Class or Economy CLass (F/E): ");
		Ticket ticket1 = new Ticket(in.nextLine());
		System.out.println("You have chosen " + ticket1.getTicketClass() + " which costs " + numberFormatter.format(ticket1.getTicketPrice()));
		
		in.close();

    }

}