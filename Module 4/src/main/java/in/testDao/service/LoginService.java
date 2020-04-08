package in.testDao.service;

import in.testDao.model.Customer;

public interface LoginService {
	
	boolean createCustomer(Customer customer);
	boolean customerLogin(String customerName,String password);
	boolean customerResetPassword(String customerName,String password);
}
