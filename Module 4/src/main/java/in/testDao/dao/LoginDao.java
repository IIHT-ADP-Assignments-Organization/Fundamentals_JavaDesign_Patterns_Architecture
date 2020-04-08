package in.testDao.dao;

import in.testDao.model.Customer;

public interface LoginDao {
	
	boolean createCustomer(Customer customer);
	boolean customerLogin(String customerName,String password);
	boolean customerResetPassword(String customerName,String password);	
}
