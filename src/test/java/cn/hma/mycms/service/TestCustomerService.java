package cn.hma.mycms.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import cn.hma.mycms.dao.CustomerDao;
import cn.hma.mycms.model.Customer;

import com.alibaba.fastjson.JSON;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:config/applicationContext.xml")
public class TestCustomerService {

	@Autowired
	private CustomerService cs;

	@Test
	public void tgetCustomer() {

		Customer c = cs.getCustomerById(2l);
		System.out.println(JSON.toJSONString(c));
		//System.out.println(JSON.toJSONString(customerDao.findOne((long) 2)));
		
	}

	/*
	@Test
	public void findsFirstPageOfMatthews() throws Exception {

		Page<Customer> cs = customerDao.findByLastname("雄杰", new PageRequest(0, 2));

		//System.out.println(cs.getTotalElements()+".....");
		System.out.println(JSON.toJSONString(cs));
	}

	*/
	
	 

	@Test
	public void tsaveCustomer() {
		Customer u = new Customer();
		u.setFirstname("马1");
		u.setLastname("雄杰1");
		cs.addUser(u);
		System.out.println(JSON.toJSONString(u));
		
		

	}

	 

}
