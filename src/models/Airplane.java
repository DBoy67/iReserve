package models;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Surekha
 * @DBoy
 */
public class Airplane {

    private List<Seat> firstClassSeatList;
    private List<Seat> economyClassSeatList;
    private int seatNo;

    public Airplane() {
	firstClassSeatList = new ArrayList<>();
	economyClassSeatList = new ArrayList<>();
    }

    public int findFreeSeat(String travelClass) {
	switch (travelClass) {
	    case "F":
		if (firstClassSeatList.size() < 6) {
		    seatNo = firstClassSeatList.size();
		    seatNo++;
		    Seat seat = new Seat(seatNo, "First Class", "Occupied");
		    addSeat(seat);
		    break;
		} else if (firstClassSeatList.size() >= 6) {
		System.out.println("I am sorry. First Class is fully booked.");
		System.out.print("Would you like to check for seats in Economy Class? (Y/N)");
		break;
	    }
	}
	return seatNo;
    }

    public void addSeat(Seat seat) {
	firstClassSeatList.add(seat);
    }

    public int getFCSeatListSize() {
	return firstClassSeatList.size();
    }

    public int getECSeatListSize() {
	return economyClassSeatList.size();
    }

    public List<Seat> getFirstClassSeatList() {
	return firstClassSeatList;
    }

    public List<Seat> getEconomyClassSeatList() {
	return economyClassSeatList;
    }
    
}
