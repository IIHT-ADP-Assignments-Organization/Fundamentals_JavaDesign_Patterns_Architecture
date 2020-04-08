package in.testDao.test;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import in.testDao.dao.CustomerDao;
import in.testDao.dao.LoginDao;
import in.testDao.model.Customer;

public class TestFunctional {

	private static AnnotationConfigApplicationContext context;

	private static CustomerDao customerDao;
	private static LoginDao loginDao;

	private Customer customer;

	@BeforeClass
	public static void init() {
		context = new AnnotationConfigApplicationContext();
		context.scan("in.OnlineVehicleBookingApp");
		context.refresh();
		customerDao = (CustomerDao) context.getBean(CustomerDao.class);
		loginDao = (LoginDao) context.getBean(LoginDao.class);
	}



	
	
	@Test
	public void testCreateCustomer() {
		Customer customer = new Customer();
		customer.setCustomerID(1);
		customer.setCustomerName("Shashidhar");
		customer.setPassword("nonofyourbussiness");
		customer.setDOB("11-11-1998");
		customer.setAddress("Hyderabad");
		customer.setEmailId("Shashi.2346@gmail.com");
		customer.setMobileNo("9494879694");
		customer.setOccupation("S/W Engi");
		customer.setStatus("activated");				
		assertEquals("Saved in to admin table", customer.getCustomerID(), customerDao.createCustomer(customer));
	}
		 
}
