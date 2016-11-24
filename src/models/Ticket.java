package models;

public class Ticket {

    private String ticketClass;
    private double ticketPrice;

    public Ticket(String travelClass) {
	if (travelClass.equalsIgnoreCase("f")){
	    ticketClass = "First Class";
	    ticketPrice = 20000;
	} else if (travelClass.equalsIgnoreCase("e")){
	    ticketClass = "Economy Class";
	    ticketPrice = 5000;
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
