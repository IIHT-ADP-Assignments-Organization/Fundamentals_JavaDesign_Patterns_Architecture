package in.testDao.service;

import in.testDao.model.Customer;

public interface CustomerService {
	int createCustomer(Customer customer);
	Customer getCustomer(int customerId);
	boolean updateCustomer(Customer customer);
	boolean deleteCustomer(Customer customer);	
	boolean statusCustomer(Customer customer);
}
