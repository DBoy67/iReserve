package models;

//import java.util.ListIterator;
import java.util.UUID;

public class CustomerCatalog {

	// String customerList = "customerList.xml";

	// XMLList xml;

	// public void readFile() throws IOException {
	// xml = XmlIO.loadObject(customerList, XMLList.class);
	// }

	String custName;
	String customerID;

	public CustomerCatalog(String custName) {
		this.custName = custName;
		this.customerID = UUID.randomUUID().toString();
	}

	public String getCustomerName() {
		return custName;
	}

}
