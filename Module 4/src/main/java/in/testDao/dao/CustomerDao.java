package in.testDao.dao;

import in.testDao.model.Customer;

public interface CustomerDao {
	
	int createCustomer(Customer customer);

	Customer getCustomer(int customerId);

	boolean updateCustomer(Customer customer);

	boolean deleteCustomer(Customer customer);
}
