package com.sample.web.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.sample.web.entity.Customer;
import com.sample.web.service.CustomerService;

@Controller
public class CustomerController {

	private static final Logger LOG = LoggerFactory.getLogger(CustomerController.class);

	private @Autowired CustomerService customerService;

	@RequestMapping(value = "/customers", method = RequestMethod.GET)
	public String customers(ModelMap model) {
		LOG.debug("customers");
		List<Customer> customers = customerService.get();
		model.put("customers", customers);
		return "customerListPage";
	}

	@RequestMapping(value = "/customer/{id}", method = RequestMethod.GET)
	public String customer(@PathVariable Integer id, ModelMap model) {
		LOG.debug("customer");
		Customer customer = customerService.get(id);
		model.put("customer", customer);
		return "customerDetailPage";
	}

}
