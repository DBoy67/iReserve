package models;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Surekha
 * @DBoy
 */
public abstract class PassengerPlane extends Plane {


    public PassengerPlane() {
    }

    @Override
    public int findFreeSeat(String travelClass) throws BookedFullException {
	return seatNo;
    }
    
    @Override
    public void switchSeatStatus(int seatNo) {
    }

    @Override
    public void addSeat(Seat seat) {
	seatList.add(seat);
    }

    @Override
    public int getSeatListSize() {
	return seatList.size();
    }

    @Override
    public List<Seat> getSeatList() {
	return seatList;
    }
}
