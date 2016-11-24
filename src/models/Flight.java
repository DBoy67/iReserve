package models;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Tony Eriksson <Tony.Eriksson>
 */
public class Flight implements IFlight {

    private HashMap<Integer, Seat> bookedSeatsTotal;
    private HashMap<Integer, Seat> bookedSeatsFirst;
    private HashMap<Integer, Seat> bookedSeatsEconomy;
    private int maxSeats;
    private static int economySeatNo = 6;
    private static int firstSeatNo = 1;

    public Flight() {
        this.maxSeats = 10;
        bookedSeatsTotal = new HashMap<>();
        bookedSeatsFirst = new HashMap<>();
        bookedSeatsEconomy = new HashMap<>();

    }

    public Map<Integer, Seat> getBookedSeatsTotal() {
        return Collections.unmodifiableMap(bookedSeatsTotal);
    }

    public Map<Integer, Seat> getBookedSeatsFirst() {
        return Collections.unmodifiableMap(bookedSeatsFirst);
    }

    public Map<Integer, Seat> getBookedSeatsEconomy() {
        return Collections.unmodifiableMap(bookedSeatsEconomy);
    }

    public static int getEconomySeatNo() {
        return economySeatNo;
    }

    public static int getFirstSeatNo() {
        return firstSeatNo;
    }

    public Seat getSeat(Integer seatNo) {
        return bookedSeatsTotal.get(seatNo);
    }

    public int getMaxSeats() {
        return maxSeats;
    }

    public boolean isSeatFree(Integer seatNo, String travelClass) {
        if (bookedSeatsTotal.containsKey(seatNo)) {
            return false;
        }
        if ((seatNo > 0 && seatNo <= 5 && travelClass.equalsIgnoreCase("f")) || ((seatNo > 6 && seatNo <= 10) && travelClass.equalsIgnoreCase("e"))) {
            return true;
        }
        return false;
    }

    public void selectSeat(Integer seatNo, Seat seat, String travelClass) {
        bookedSeatsTotal.put(seatNo, seat);
//		if(String.valueOf(travelClass).equals("Business")){
        if (travelClass.equals("First Class")) {
            bookedSeatsFirst.put(seatNo, seat);
        } else if (travelClass.equals("Economy Class")) {
            bookedSeatsEconomy.put(seatNo, seat);
        }
    }

    /**
     *
     * @param classChoice
     * @return Accepts a string of "F" or "E" depending on what class the
     * passenger has chosen. Should search the seats in the chosen class and
     * return true if there is a free seat.
     */
    @Override
    public boolean findFreeSeat(String classChoice) {
        for (int i = 0; i < maxSeats; i++) {
            if (this.isSeatFree(i, classChoice)) {
                return true;
            }
        }

        return false;
    }

    /**
     *
     * @param classChoice
     * @return Accepts a string of "F" or "E" depending on what class the
     * passenger has chosen. Should search for the first free seat in the chosen
     * class and return a seatNo. Returns -1 if no free seat was avaible.
     */
    @Override
    public int setSeat(String classChoice) {

        if (this.findFreeSeat(classChoice)) {
            if (classChoice.equalsIgnoreCase("f") && firstSeatNo > 0 && firstSeatNo < 6) {
                return firstSeatNo++;
            } else if (classChoice.equalsIgnoreCase("e") && economySeatNo > 5 && economySeatNo < 11) {
                return economySeatNo++;

            }
        }

        return -1;
    }

    @Override
    public void addSeat(Seat seat) {
        if (seat.getSeatNo() > 0 && seat.getSeatNo() < 6) {
            this.selectSeat(seat.getSeatNo(), seat, "First Class");
        } else if (seat.getSeatNo() > 5 && seat.getSeatNo() < 11) {
            this.selectSeat(seat.getSeatNo(), seat, "Economy Class");
        }
    }

    @Override
    public void switchSeatStatus(int seatNo) {
        Seat seat = bookedSeatsTotal.get(seatNo);
        if (seat.getSeatStatus().equals("OCCUPIED")) {
            bookedSeatsTotal.get(seatNo).setStatusFree();
        } else if (seat.getSeatStatus().equals("FREE")) {
            bookedSeatsTotal.get(seatNo).setStatusOccupied();
        }
    }

    @Override
    public List getSeatList() {
        ArrayList<Seat> list = new ArrayList<>();
        for (Seat seat : bookedSeatsTotal.values()) {
            list.add(seat);
        }
        return Collections.unmodifiableList(list);
    }

    @Override
    public int getSeatListSize() {
        return bookedSeatsTotal.size();
    }

}
