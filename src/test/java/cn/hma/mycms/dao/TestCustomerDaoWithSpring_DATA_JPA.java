package cn.hma.mycms.dao;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import cn.hma.mycms.model.Customer;

import com.alibaba.fastjson.JSON;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:config/applicationContext.xml")
public class TestCustomerDaoWithSpring_DATA_JPA {

	@Resource
	private CustomerDao customerDao;

	@Test
	public void tgetCustomer() {

		Customer c = customerDao.findByfirstname("张");
		System.out.println(JSON.toJSONString(c));
		//System.out.println(JSON.toJSONString(customerDao.findOne((long) 2)));
		
	}

	@Test
	public void findsFirstPageOfMatthews() throws Exception {

		Page<Customer> cs = customerDao.findByLastname("雄杰", new PageRequest(0, 2));

		//System.out.println(cs.getTotalElements()+".....");
		System.out.println(JSON.toJSONString(cs));
	}

	
	
	 

	@Test
	public void tsaveCustomer() {
		Customer u = new Customer();
		u.setFirstname("马");
		u.setLastname("雄杰");
		customerDao.save(u);
		System.out.println(JSON.toJSONString(u));
		
		

	}

	 

}
