package models;

import utilities.TravelClass;
import java.util.HashMap;

public class Airplane {

	private int planeNo;
	private String planeName;
	private int maxSeats;

	private HashMap<Integer, Seat> seatMap;

	public Airplane(int planeNo, String planeName, int maxSeats){
		this.planeName = planeName ;
		this.planeNo = planeNo;
		this.maxSeats = maxSeats;
		seatMap = new HashMap<Integer, Seat>();
	}

	public void setPlaneNo(int planeNo){
		this.planeNo = planeNo;

	}

	public int getPlaneNo(){
		return planeNo;
	}

	public void setPlaneName(String planeName){
		this.planeName = planeName;
	}

	public String getPlaneName(){
		return planeName;
	}

	public void setMaxSeats(int maxSeats){
		this.maxSeats = maxSeats;
	}

	public int getMaxSeats(){
		return maxSeats;
	}

	public HashMap<Integer, Seat> getSeats(){
		return seatMap;
	}

	public void selectSeat(Integer seatNo , Seat seat){
		seatMap.put(seatNo, seat);
	}

	public Seat getSeat(Integer seatNo){
		return seatMap.get(seatNo);
	}

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
