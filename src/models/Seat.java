package models;

public class Seat {
		
		private int id;
		private SeatStatus status;
//	Seat[] seatplan;
	int counter = 0;
		
		public Seat(int id){
			this.id = id;
			status = SeatStatus.Free;
//			seatplan = new Seat[10];
//			
		}
		
		public int getId(){
			return id;
		
		}
		
		
	public SeatStatus isOccupied(){
		return status;
		
	}

	public SeatStatus setStatus(){
		return status;
		
	}
	public void addSeat(Seat newseat){
		
		
		
		
//	for(int i = 0; i<seatplan.length ; i++){
//		if (seatplan == null) {
//			seatplan[counter]=newseat; 
//			counter++;
//		}
//	}
		
	}

	@Override
	public String toString() {
		return "Seat [id=" + id + ", " + getId() + ", isOccupied()=" + isOccupied() + "]";
	}


	//////public void toggleOccupied(){
	//////	
	//
//////		for (Seat seat : seatp){
//////			if (seat!=null) {
//////		addSeat(newseat);
//////				
//////			}
//////			System.out.println("Do you want change class as this class is full");
//////		}
	////
	////	
////		//need seat list where seats are added to chk if seat free or occupied.	
////				}
			
		

		

	}
	
