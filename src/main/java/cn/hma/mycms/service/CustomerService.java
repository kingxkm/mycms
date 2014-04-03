package cn.hma.mycms.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.hma.mycms.dao.CustomerDao;
import cn.hma.mycms.model.Customer;

@Service
@Transactional(readOnly = true)
public class CustomerService {
	@Autowired
	private CustomerDao customerDao;

	public Customer getCustomerById(Long id) {
		return customerDao.findOne(id);
	}

	public void addUser(Customer u) {
		customerDao.save(u);

	}
}
