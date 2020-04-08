package in.testDao.test;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import in.testDao.dao.CustomerDao;
import in.testDao.dao.LoginDao;
import in.testDao.exception.CustomerAlreadyExistException;
import in.testDao.exception.CustomerDoesNotExistException;
import in.testDao.model.Customer;
import in.testDao.service.LoginService;

public class TestException {
	
	private static AnnotationConfigApplicationContext context;
	private static CustomerDao customerDao;
	private static LoginDao loginDao;
	
	private Customer customer;

	@BeforeClass
	public static void init() {
		context = new AnnotationConfigApplicationContext();
		context.scan("in.OnlineVehicleBookingApp");
		context.refresh();
		
		customerDao = context.getBean(CustomerDao.class);
		loginDao = context.getBean(LoginDao.class);
	}

	

	@Test
	public void testForCustomerRegistration() throws CustomerAlreadyExistException { 
		Customer customer = new Customer();
		customer.setCustomerID(1);
		customer.setCustomerName("aaa");
		customer.setPassword("aaa");
		customer.setDOB("aaa");
		customer.setAddress("aaa");
		customer.setEmailId("aaa");
		customer.setMobileNo("aaa");
		customer.setOccupation("aaa");

		LoginService loginservice = (LoginService) context.getBean("LoginService");
		loginservice.createCustomer(customer);
		Assert.assertEquals(CustomerAlreadyExistException.message, "customer already exists !..please login");
	}

	@Test
	public void testForCustomerLogin() throws CustomerDoesNotExistException { 
		Customer customer = new Customer();
		customer.setCustomerID(1);
		customer.setCustomerName("aaa");
		customer.setPassword("aaa");
		customer.setDOB("aaa");
		customer.setAddress("aaa");
		customer.setEmailId("aaa");
		customer.setMobileNo("aaa");
		customer.setOccupation("aaa");
		LoginService loginservice = (LoginService) context.getBean("LoginService");
		loginservice.customerLogin(customer.getCustomerName(), customer.getPassword());
		Assert.assertEquals(CustomerDoesNotExistException.message, "customer already exists !..please login");
	}
	 
}