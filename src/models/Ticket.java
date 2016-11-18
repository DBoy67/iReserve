/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import utilities.TravelClass;

/**
 *
 * @author Sir H
 */
public abstract class Ticket {

    private TravelClass travelClass;
    private double ticketPrice;

    public Ticket(TravelClass travelClass, double ticketPrice) {
        this.travelClass=travelClass; 
        this.ticketPrice=ticketPrice;
    }

    public TravelClass getTravelClass() {
        return travelClass;
    }
    public double getTicketPrice(){
        return ticketPrice;
    }
}
