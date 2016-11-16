package models;

public class Ticket {

	private String ticketClass;
	private double ticketPrice;

	public Ticket(String travelClass) {
		switch (travelClass) {
		case "F":
			ticketClass = "First Class";
			ticketPrice = 20000;
			break;
		case "E":
			ticketClass = "Economy Class";
			ticketPrice = 5000;
			break;
		default:
			System.out.println("Invalid input");
			break;
		}

	}

	public String getTicketClass() {
		return ticketClass;
	}
	
	public double getTicketPrice(){
		return ticketPrice;
	}

}
