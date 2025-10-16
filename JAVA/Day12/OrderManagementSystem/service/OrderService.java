package OrderManagementSys.service;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import OrderManagementSys.beans.Customer;
import OrderManagementSys.beans.Item;


public interface OrderService {

	boolean addNewCustomer();

	Map<Customer, List<Item>> displayAll();

	Entry<Customer, List<Item>> findByCustomer(int cid);

	boolean deleteById(int cid);

	boolean addNewItem(int cid, Item item);

	boolean removeItemById(int cid, int iid);

}
