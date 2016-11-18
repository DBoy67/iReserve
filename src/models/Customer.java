package models;

import java.util.UUID;

/**
 *
 * @author SirhH
 * @author DBoy67
 */
public class Customer implements CustomerInterface {
    private String customerName;
    private UUID customerID;
    
    public Customer(String customerName){
        this.customerName = customerName;
	this.customerID = UUID.randomUUID();
    }
    
    @Override
    public String getCustomerName(){
        return customerName;
    }
    
    @Override
    public String getCustomerID(){
	return customerID.toString();
    }
    
    public String toString(){
        return "Customer: " + customerName + "CustomerID: " + customerID;
    }
}