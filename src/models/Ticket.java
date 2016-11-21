package models;

public class Ticket {

    private String ticketClass;
    private double ticketPrice;

    public Ticket(String travelClass) {
	if (travelClass.contentEquals("F")){
	    ticketClass = "First Class";
	    ticketPrice = 20000;
	} else if (travelClass.contentEquals("E")){
	    ticketClass = "Economy Class";
	    ticketPrice = 20000;
	}
    }

    public double getTicketPrice() {
	return ticketPrice;
    }

    public String getTicketClass() {
	return ticketClass;
    }

    @Override
    public String toString() {
	return "Ticket{" + "ticketClass=" + ticketClass + ", ticketPrice=" + ticketPrice + '}';
    }

}
