package models;

public class Seat {

	private int id;
	private SeatStatus status;

	/**
	 * @param id
	 */
	public Seat(int id){
		this.id = id;
		status = SeatStatus.Free;
	}

	/**
	 * @return
	 */
	public int getId(){
		return id;
	}

	/**
	 * @return
	 */
	public SeatStatus isOccupied(){
		return status;
	}

	/**
	 * @return
	 */
	public void setStatusOccupied(){
		status = SeatStatus.Occupied;
	}

	/**
	 * 
	 */
	public void setStatusFree(){
		status = SeatStatus.Free;
	}


	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Seat [id="  + getId() + ", isOccupied()=" + isOccupied() + "]";
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

