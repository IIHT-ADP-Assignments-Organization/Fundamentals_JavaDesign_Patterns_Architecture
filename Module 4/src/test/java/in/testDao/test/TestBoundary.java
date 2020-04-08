package in.testDao.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import in.testDao.model.Customer;

public class TestBoundary {

	@Test
	public void testPasswordLength() {
		Customer customer = new Customer();
		customer.setCustomerID(1);
		customer.setCustomerName("aaa");
		customer.setPassword("aaa");
		customer.setDOB("aaa");
		customer.setAddress("aaa");
		customer.setEmailId("aaa");
		customer.setMobileNo("aaa");
		customer.setOccupation("aaa");

		int passwordLength = 5;
		assertEquals(passwordLength, customer.getPassword().length());
	}

	@Test
	public void testPhoneNumberLength() {
		Customer customer = new Customer();
		customer.setCustomerID(1);
		customer.setCustomerName("aaa");
		customer.setPassword("aaa");
		customer.setDOB("aaa");
		customer.setAddress("aaa");
		customer.setEmailId("aaa");
		customer.setMobileNo("aaa");
		customer.setOccupation("aaa");

		int phoneNumberLength=10;
		int getLengthOfNumber = ((customer.getMobileNo()).length());
		assertEquals(phoneNumberLength, getLengthOfNumber);
	}

	@Test
	public void testUserNameLength() {
		Customer customer = new Customer();
		customer.setCustomerID(1);
		customer.setCustomerName("aaa");
		customer.setPassword("aaa");
		customer.setDOB("aaa");
		customer.setAddress("aaa");
		customer.setEmailId("aaa");
		customer.setMobileNo("aaa");
		customer.setOccupation("aaa");
		
		int maxChar = 5;
		boolean usernameLength = ((customer.getCustomerName().length()) >= maxChar);
		assertEquals(usernameLength, true);
	}

}
