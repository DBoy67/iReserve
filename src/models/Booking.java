package models;

import java.util.List;
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
    private List<Food> dishes;
    private double ticketPrice;
    private double totalPrice;

    public Booking(String customerName) {
	this.customerID = UUID.randomUUID().toString();
	this.customerName = customerName;
	this.travelClass = "None";
	this.seat = null;
	this.dishes = null;
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

    public List<Food> getDish() {
	return dishes;
    }
    public void setDishes(List<Food> menu){
        dishes=menu;
    }

    public void addDish(Food dish) {
	dishes.add(dish);
    }

    public double getTicketPrice() {
	return ticketPrice;
    }

    public void setTicketPrice(double ticketPrice) {
	this.ticketPrice = ticketPrice;
    }

    public double getTotalPrice() {
        double total=ticketPrice;
        for(Food food : dishes){
            total+=food.getPrice();
        }
	return total;
    }

    public void setTotalPrice(double totalPrice) {
	this.totalPrice = totalPrice;
    }

    @Override
    public String toString() {
	return "Booking{" + "customerName=" + customerName + ", customerID=" + customerID + ", travelClass=" + travelClass + ", seat=" + seat + ", dish=" + dishes.toString() + ", ticketPrice=" + ticketPrice + ", totalPrice=" + totalPrice + '}';
    }
}
