/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.util.List;

/**
 *
 * @author Tony Eriksson <Tony.Eriksson>
 */
public interface IFlight {

    /**
     *
     * @param classChoice
     * @return
     * Accepts a string of "F" or "E" depending on what class the passenger has chosen.
     * Should search the seats in the chosen class and return true if there is a free seat.
     */
    public abstract boolean findFreeSeat(String classChoice);

    /**
     *
     * @param classChoice
     * @return
     * Accepts a string of "F" or "E" depending on what class the passenger has chosen.
     * Should search for the first free seat in the chosen class and return a seatNo.
     */
    public abstract int setSeat(String classChoice);

    
    
    public abstract void addSeat(Seat seat);
    
    public abstract void switchSeatStatus(int seatNo);
    
    public abstract List getSeatList();

    public abstract int getSeatListSize();

}