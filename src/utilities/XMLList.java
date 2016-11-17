
package utilities;

import java.util.ArrayList;
import java.util.List;
import models.CustomerCatalog;

public class XMLList {
    
   private List<CustomerCatalog> customerList = new ArrayList<CustomerCatalog>();

    public List<CustomerCatalog> getCustomerList() {
	return customerList;
    }

    public void setCustomerList(List<CustomerCatalog> customerList) {
	this.customerList = customerList;
    }
}
