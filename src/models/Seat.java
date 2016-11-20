package models;

public class Seat {

	private int seatNo;
	private String seatStatus;
	private String travelClass;

	public Seat(int seatNo, String travelClass, String seatStatus){
		this.seatNo = seatNo;
		this.travelClass = travelClass;
		this.seatStatus = seatStatus;
	}
	
	public int getSeatNo(){
		return seatNo;
	}
	
	public String getSeatStatus(){
		return seatStatus;
	}

	public void setStatusOccupied(){
		seatStatus = "OCCUPIED";
	}

	public void setStatusFree(){
		seatStatus = "FREE";
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

}