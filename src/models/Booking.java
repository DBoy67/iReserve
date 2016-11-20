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
//    private int airplaneNo;
    private int seatNo;
    private Food dish;
    private double ticketPrice;
    private double totalPrice;
    
    
    
    public Booking(String customerName){
    	this.customerID = UUID.randomUUID().toString();
        this.customerName = customerName;
    }
    
    public String getCustomerName(){
        return customerName;
    }
    
    public String getCustomerID(){
    	return customerID;
    }

    /**
     * @param customerName the customerName to set
     */
    public void setCustomerName(String customerName) {
	this.customerName = customerName;
    }

    /**
     * @param customerID the customerID to set
     */
    public void setCustomerID(String customerID) {
	this.customerID = customerID;
    }

    /**
     * @return the travelClass
     */
    public String getTravelClass() {
	return travelClass;
    }

    /**
     * @param travelClass the travelClass to set
     */
    public void setTravelClass(String travelClass) {
	this.travelClass = travelClass;
    }

//    /**
//     * @return the airplaneNo
//     */
//    public int getAirplaneNo() {
//	return airPlaneNo;
//    }

//    /**
//     * @param airplaneNo the airplaneNo to set
//     */
//    public void setAirplaneNo(int airplaneNo) {
//	this.airplaneNo = airplaneNo;
//    }
//
    /**
     * @return the seatNo
     */
    public int getSeatNo() {
	return seatNo;
    }

    /**
     * @param seatNo the seatNo to set
     */
    public void setSeatNo(int seatNo) {
	this.seatNo = seatNo;
    }

    /**
     * @return the dish
     */
    public Food getDish() {
	return dish;
    }

    /**
     * @param dish the dish to set
     */
    public void setDish(Food dish) {
	this.dish = dish;
    }

    /**
     * @return the ticketPrice
     */
    public double getTicketPrice() {
	return ticketPrice;
    }

    /**
     * @param ticketPrice the ticketPrice to set
     */
    public void setTicketPrice(double ticketPrice) {
	this.ticketPrice = ticketPrice;
    }

    /**
     * @return the totalPrice
     */
    public double getTotalPrice() {
	return totalPrice;
    }

    /**
     * @param totalPrice the totalPrice to set
     */
    public void setTotalPrice(double totalPrice) {
	this.totalPrice = totalPrice;
    }

    @Override
    public String toString() {
	return "Customer{" + "customerName=" + customerName + ", customerID=" + customerID + ", travelClass=" + travelClass + ", seatNo=" + seatNo + ", dish=" + dish + ", ticketPrice=" + ticketPrice + ", totalPrice=" + totalPrice + '}';
    }
    
}