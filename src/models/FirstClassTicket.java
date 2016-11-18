package models;

import utilities.*;

public abstract class FirstClassTicket {

	private TravelClass ticketClass;
	private double ticketPrice;

	public TravelClass getTicketClass() {
		return this.ticketClass;
	}

	/**
	 * 
	 * @param travelClass
	 */
	public FirstClassTicket(TravelClass travelClass) {

	}

}