package models;

public class CustomerCatalog {

	String custName;
	String customerID;

	public CustomerCatalog(String custName) {
		this.custName = custName;
	}

	public String getCustomerName() {
		return custName;
	}

}
