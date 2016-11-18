package models;

import utilities.TravelClass;
import java.util.HashMap;
import utilities.SeatStatus;

/**
 * @author Surekha
 *
 */
public class Airplane {

	private int planeNo;
	private String planeName;
	private int maxSeats;

	private HashMap<Integer, Seat> seatMap;

	/**
	 * @param planeNo
	 * @param planeName
	 * @param maxSeats
	 */
	public Airplane(int planeNo, String planeName, int maxSeats){
		this.planeName = planeName ;
		this.planeNo = planeNo;
		this.maxSeats = maxSeats;
		seatMap = new HashMap<Integer, Seat>();
	}

	/**
	 * @param planeNo
	 */
	public void setPlaneNo(int planeNo){
		this.planeNo = planeNo;

	}

	/**
	 * @return
	 */
	public int getPlaneNo(){
		return planeNo;
	}

	/**
	 * @param planeName
	 */
	public void setPlaneName(String planeName){
		this.planeName = planeName;
	}

	/**
	 * @return
	 */
	public String getPlaneName(){
		return planeName;
	}

	/**
	 * @param maxSeats
	 */
	public void setMaxSeats(int maxSeats){
		this.maxSeats = maxSeats;
	}

	/**
	 * @return
	 */
	public int getMaxSeats(){
		return maxSeats;
	}

	/**
	 * @return
	 */
	public HashMap<Integer, Seat> getSeats(){
		return seatMap;
	}

	/**
	 * @param seatNo
	 * @param seat
	 */
	public void putSeat(Integer seatNo , Seat seat){
		seatMap.put(seatNo, seat);
	}

	/**
	 * @param seatNo
	 * @return
	 */
	public Seat getSeat(Integer seatNo){
		return seatMap.get(seatNo);
	}
        /**
         * 
         * Takes a @param travelClass to look for free seats for that travelClass
         * and @return the first found free seat, if no seat is found the return
         * will be null
         */
        public Seat getNextFreeSeat(TravelClass travelClass){
            for(Seat s: seatMap.values()){
                if(s.getSeatStatus()==SeatStatus.FREE && s.getTravelClass()==travelClass){
                    return s;
                }
            }
            return null;
        }
        /**
         * 
         * @param seat
         * Takes the specified seat and sets an occupied seat to free and vise
         * versa by calling the methods in the seat class
         */
        public void toggleSeatStatus(Seat seat){
            if(seat.getSeatStatus()==SeatStatus.OCCUPIED)
		seat.setStatusFree();
            else{
                seat.setStatusOccupied();
            }
	}

        
        @Override
        public String toString(){
            return getPlaneName() + getSeats().toString();
        }

	/**
	 * for test purpose
	 * @param args
	 */
	public static void main(String []args){

		Airplane airplane = new Airplane(1710, "boeing777", 10);
		Seat seat5 = new Seat(5, TravelClass.FIRST);
		Seat seat2 = new Seat(2, TravelClass.ECONOMY);
		airplane.putSeat(5,seat5);
		airplane.putSeat(2, seat2);
		System.out.println("is seat no 2 booked ? : " + airplane.seatMap.containsKey(2) );
		System.out.println("is seat no 7 booked ? : " + airplane.seatMap.containsKey(7) );
		System.out.println("Total seats booked in the plane : " +airplane.seatMap.size());

	}
}
