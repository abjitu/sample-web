package com.sample.web.service;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.sample.web.entity.Customer;
import com.sample.web.repository.CustomerRepository;

@Component
public class SimulatorService {

	private static final Logger log = LoggerFactory.getLogger(SimulatorService.class);

	private @Autowired CustomerRepository customerRepository;

	@Transactional(readOnly = false)
	public void simulate() {
		log.info("Inside Simulate");
		List<Customer> customers = new ArrayList<>();
		for (int i = 1; i < 100; i++) {
			customers.add(customerRepository.save(new Customer("Test" + i)));
		}

		log.info("Exiting Simulate");
	}
}
