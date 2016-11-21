package models;

import java.util.List;

/**
 *
 * @author Tony Eriksson <Tony.Eriksson>
 */
public class Flight implements IFlight {

    /**
     *
     * @param classChoice
     * @return Accepts a string of "F" or "E" depending on what class the passenger has chosen. Should search the seats in the chosen class and return true if there is a free seat.
     */
    @Override
    public boolean findFreeSeat(String classChoice) {
	throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     *
     * @param classChoice
     * @return Accepts a string of "F" or "E" depending on what class the passenger has chosen. Should search for the first free seat in the chosen class and return a seatNo.
     */
    @Override
    public int setSeat(String classChoice) {
	throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void addSeat(Seat seat) {
    }

    @Override
    public void switchSeatStatus(int seatNo) {

    }

    @Override
    public List getSeatList() {
	throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getSeatListSize() {
	throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
