package in.testDao.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import in.testDao.model.Customer;
@Service("LoginService")
@Transactional(readOnly = true)
public class LoginServiceImpl implements LoginService {

	public boolean createCustomer(Customer customer) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean customerLogin(String customerName, String password) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean customerResetPassword(String customerName, String password) {
		// TODO Auto-generated method stub
		return false;
	}
}
