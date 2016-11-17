package models;

public class Seat {

	private int id;
	private SeatStatus status;
	private String firstClass;
	private String economyClass;

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
	public String getFirstClass() {
		return firstClass;
	}

	/**
	 * @param firstClass
	 */
	public void setFirstClass(String firstClass) {
		this.firstClass = firstClass;
	}

	/**
	 * @return
	 */
	public String getEconomyClass() {
		return economyClass;
	}

	/**
	 * @param economyClass
	 */
	public void setEconomyClass(String economyClass) {
		this.economyClass = economyClass;
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


	public static void main( String [] args){
		Seat seat = new Seat(1);
		System.out.println(seat.getId());
		System.out.println(seat.isOccupied());
		seat.setStatusOccupied();
		System.out.println(seat.isOccupied());
		System.out.println(seat.toString());
AirPlane airPlane = new AirPlane(1, 777);

	}

}

