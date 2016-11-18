package models;

/**
 * @author SirhH
 * @author DBoy67
 */
public class Customer {
    private String customerName;
    
    public Customer(String customerName){
        this.customerName = customerName;
    }
    
    public String getCustomerName(){
        return customerName;
    }
  
    @Override
    public String toString(){
        return "Customer: " + customerName;
    }
}