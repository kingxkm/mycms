package org.kingxkm.myssm.dao;

import org.kingxkm.myssm.model.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface CustomerDao extends PagingAndSortingRepository<Customer, Long> {
	Customer findByfirstname(String fn);

	Customer findByLastname(String lastname);

	Page<Customer> findByLastname(String lastname, Pageable pageable);
}
