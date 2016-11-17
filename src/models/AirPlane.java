package models;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;





public class AirPlane {


	HashMap<Integer, Seat> myHashMap ;
	// private List<Seat> seatList = new ArrayList<>();
	private int id;
	private Seat seat;
	private int airplaneId;
	private int maxSeat;

	public AirPlane(int id,int airplaneId) {
		this.id = id;
		myHashMap = new HashMap<>();
		this.maxSeat=10;
	}

	/**
	 * @return
	 */
	public <myHashMap> HashMap<Integer, Seat> getSeat(){
		return myHashMap;


	}

	public void addSeats(){
		myHashMap.put(seat.getId(),seat);
		myHashMap.containsKey(seat);
		System.out.println("Seat added" +seat.getId() );

	}


	public void findFreeSeat(){



	}


}
