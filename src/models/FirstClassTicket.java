package models;

import utilities.*;
/**
     * This classs takes everything from the Ticket class, there is no methods
     * exclusive to this class yet.
     */
public class FirstClassTicket extends Ticket {
    
    public FirstClassTicket() {
        super(TravelClass.FIRST, 20_000);
    }

}