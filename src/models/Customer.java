package models;

import java.util.UUID;

/**
 *
 * @author SirhH
 * @author DBoy67
 */
public class Customer {
    private String customerName;
    private String customerID;
    
    public Customer(String customerName){
    	customerID = UUID.randomUUID().toString();
        this.customerName = customerName;
    }
    
    public String getCustomerName(){
        return customerName;
    }
    
    public String getCustomerID(){
    	return customerID;
    }
    @Override
    public String toString(){
        return "Customer: " + customerName;
    }
}