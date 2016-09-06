package com.sample.web.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.sample.web.entity.Customer;
import com.sample.web.repository.CustomerRepository;

@Component
public class CustomerService {

	private static final Logger log = LoggerFactory.getLogger(CustomerService.class);

	private @Autowired CustomerRepository customerRepository;

	@Transactional(readOnly = true)
	public List<Customer> get() {
		log.info("Inside get");
		return customerRepository.get();
	}

	public Customer get(Integer id) {
		return customerRepository.findOne(id);
	}
}
