package models;

import utilities.SeatStatus;
import utilities.TravelClass;

public class Seat {

	private Integer seatNo;
	private SeatStatus status;
	private TravelClass travelClass;

	/**
	 * @param id
	 */
	public Seat(Integer seatNo, TravelClass travelClass){
		this.seatNo = seatNo;
		this.travelClass = travelClass;
		status = SeatStatus.FREE;
	}

	/**
	 * @return
	 */
	public Integer getSeatNo(){
		return seatNo;
	}

	
	/**
	 * @param seatNo
	 */
	public void setSeatNo(Integer seatNo){
		this.seatNo = seatNo ;
	}
	
	/**
	 * @return
	 */
	public SeatStatus getSeatStatus(){
		return status;
	}

	/**
	 * @return
	 */
	public void setStatusOccupied(){
		status = SeatStatus.OCCUPIED;
	}

	/**
	 * 
	 */
	public void setStatusFree(){
		status = SeatStatus.FREE;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
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

}

