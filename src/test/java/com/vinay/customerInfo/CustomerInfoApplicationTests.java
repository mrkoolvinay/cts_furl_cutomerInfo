package com.vinay.customerInfo;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.vinay.customerInfo.entity.Customer;
import com.vinay.customerInfo.repo.CustomerRepo;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CustomerInfoApplicationTests {
	
	@Autowired
	private CustomerRepo custRepo;

	@Test
	public void contextLoads() {
	}
	
	@Test
	public void testCreateCustomer() throws Exception {
		Customer customer = new Customer();
		customer.setId(1);
		customer.setName("Vinay");
		customer.setEmail("vinay@gmail.com");
		custRepo.save(customer );
	}
	
	@Test
	public void testUpdateCustomer() throws Exception {
		Customer customer = custRepo.findById(1).orElse(null);
		customer.setName("Vinay Kumar");
		custRepo.save(customer);
		Customer customer1 = custRepo.findById(1).orElse(null);
		assertNotNull(customer1);
	}
	
	@Test
	public void testDeleteCustomer() throws Exception {
		custRepo.deleteById(1);
		Customer customer1 = custRepo.findById(1).orElse(null);
		assertNull(customer1);
	}
	
	
}
