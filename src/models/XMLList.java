
package models;

import java.util.ArrayList;
import java.util.List;

public class XMLList {
    
   private List<CustomerCatalog> customerList = new ArrayList<CustomerCatalog>();

    public List<CustomerCatalog> getCustomerList() {
	return customerList;
    }

    public void setCustomerList(List<CustomerCatalog> customerList) {
	this.customerList = customerList;
    }
}
