package models;

import java.util.UUID;

/**
 *
 * @author DBoy67
 */
public class Booking {

    private String customerName;
    private String customerID;
    private String travelClass;
    private Seat seat;
    private Food dish;
    private double ticketPrice;
    private double totalPrice;

    public Booking(String customerName) {
	this.customerID = UUID.randomUUID().toString();
	this.customerName = customerName;
	this.travelClass = "None";
	this.seat = null;
	this.dish = null;
	this.ticketPrice = 0;
	this.totalPrice = 0;

    }

    public String getCustomerName() {
	return customerName;
    }

    public void setCustomerName(String customerName) {
	this.customerName = customerName;
    }

    public String getCustomerID() {
	return customerID;
    }

    public void setCustomerID(String customerID) {
	this.customerID = customerID;
    }

    public String getTravelClass() {
	return travelClass;
    }

    public void setTravelClass(String travelClass) {
	this.travelClass = travelClass;
    }

    public Seat getSeat() {
	return seat;
    }

    public void setSeat(Seat seat) {
	this.seat = seat;
    }

    public Food getDish() {
	return dish;
    }

    public void setDish(Food dish) {
	this.dish = dish;
    }

    public double getTicketPrice() {
	return ticketPrice;
    }

    public void setTicketPrice(double ticketPrice) {
	this.ticketPrice = ticketPrice;
    }

    public double getTotalPrice() {
	return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
	this.totalPrice = totalPrice;
    }

    @Override
    public String toString() {
	return "Booking{" + "customerName=" + customerName + ", customerID=" + customerID + ", travelClass=" + travelClass + ", seat=" + seat + ", dish=" + dish + ", ticketPrice=" + ticketPrice + ", totalPrice=" + totalPrice + '}';
    }


}
