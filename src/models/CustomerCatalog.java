package models;

//import java.util.ListIterator;

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
	}

	public String getCustomerName() {
		return custName;
	}

}
