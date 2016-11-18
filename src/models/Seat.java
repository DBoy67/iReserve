package models;

import utilities.SeatStatus;
import utilities.TravelClass;

public class Seat {

	private int seatNo;
	private SeatStatus seatStatus;
	private TravelClass travelClass;

	public Seat(int seatNo, TravelClass travelClass){
		this.seatNo = seatNo;
		this.travelClass = travelClass;
		seatStatus = SeatStatus.FREE;
	}

	public int getSeatNo(){
		return seatNo;
	}
	
	public void setSeatNo(int seatNo){
		this.seatNo = seatNo ;
	}
	
	public SeatStatus getSeatStatus(){
		return seatStatus;
	}

	public void setStatusOccupied(){
		seatStatus = SeatStatus.OCCUPIED;
	}

	public void setStatusFree(){
		seatStatus = SeatStatus.FREE;
	}

	@Override
	public String toString() {
		return "Seat [Seat No="  + getSeatNo()+ ", isOccupied()=" + getSeatStatus() + "]";
	}


	/*	public static void main( String [] args){
		Seat seat = new Seat(1);
		System.out.println(seat.getId());
		System.out.println(seat.isOccupied());
		seat.setStatusOccupied();
		System.out.println(seat.isOccupied());
System.out.println(seat.toString());
	}*/

<<<<<<< HEAD
}
=======
}
>>>>>>> branch 'master' of https://github.com/DBoy67/iReserve.git
