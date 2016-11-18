package models;

import java.util.ArrayList;
import java.util.HashSet;

public class CustomerCatalog {
	
	private HashSet<Customer> bookings;
	
	public CustomerCatalog()
	{
		bookings = new HashSet<Customer>();
	}
	
	public void add(Customer customer) {
		bookings.add(customer);
	}
	
	public Customer findByName(String name) throws CustomerNotFoundException{
		for (Customer customer: bookings) {
			if (customer.getCustomerName().equals(name)) {
				return customer;
			}
		}
		throw new CustomerNotFoundException();
	}
	
	public int getNumberOfCustomers()
	{
		return bookings.size();
	}
}