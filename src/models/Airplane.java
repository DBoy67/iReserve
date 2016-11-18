package models;

import utilities.TravelClass;
import java.util.HashMap;

/**
 * @author Surekha
 *
 */
public class Airplane implements AirplaneInterface {

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
    @Override
	public void setPlaneNo(int planeNo){
		this.planeNo = planeNo;

	}

	/**
	 * @return
	 */
    @Override
	public int getPlaneNo(){
		return planeNo;
	}

	/**
	 * @param planeName
	 */
    @Override
	public void setPlaneName(String planeName){
		this.planeName = planeName;
	}

	/**
	 * @return
	 */
    @Override
	public String getPlaneName(){
		return planeName;
	}

	/**
	 * @param maxSeats
	 */
    @Override
	public void setMaxSeats(int maxSeats){
		this.maxSeats = maxSeats;
	}

	/**
	 * @return
	 */
    @Override
	public int getMaxSeats(){
		return maxSeats;
	}

	/**
	 * @return
	 */
    @Override
	public HashMap<Integer, Seat> getSeats(){
		return seatMap;
	}

	/**
	 * @param seatNo
	 * @param seat
	 */
    @Override
	public void selectSeat(Integer seatNo , Seat seat){
		seatMap.put(seatNo, seat);
	}

	/**
	 * @param seatNo
	 * @return
	 */
    @Override
	public Seat getSeat(Integer seatNo){
		return seatMap.get(seatNo);
	}

	/**
	 * for test purpose
	 * @param args
	 */
	public static void main(String []args){

		Airplane airplane = new Airplane(1710, "boeing777", 10);
		Seat seat5 = new Seat(5, TravelClass.FIRST);
		Seat seat2 = new Seat(2, TravelClass.ECONOMY);
		airplane.selectSeat(5,seat5);
		airplane.selectSeat(2, seat2);
		System.out.println("is seat no 2 booked ? : " + airplane.seatMap.containsKey(2) );
		System.out.println("is seat no 7 booked ? : " + airplane.seatMap.containsKey(7) );
		System.out.println("Total seats booked in the plane : " +airplane.seatMap.size());

	}
}
