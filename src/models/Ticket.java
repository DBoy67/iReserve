package models;

import utilities.TravelClass;

/**
 *
 * @author Tony Eriksson <Tony.Eriksson>
 */
public class Ticket {
    
    private TravelClass travelClass;
    private double ticketPrice;
    
    public Ticket (TravelClass travelClass, double ticketPrice){
	this.travelClass = travelClass;
	this.ticketPrice = ticketPrice;
    }
    /**
     * @return the ticketPrice
     */
    public double getTicketPrice() {
	return ticketPrice;
    }

    /**
     * @return the travelClass
     */
    public TravelClass getTicketClass() {
	return travelClass;
    }
}
