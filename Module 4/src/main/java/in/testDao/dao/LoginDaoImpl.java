package in.testDao.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import in.testDao.model.Customer;
@Component
@Repository
@Transactional
public class LoginDaoImpl implements LoginDao {
	
	@Autowired
	private SessionFactory sessionFactory;
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
