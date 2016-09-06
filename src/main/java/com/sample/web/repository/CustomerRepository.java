package com.sample.web.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.sample.web.entity.Customer;

public interface CustomerRepository extends CrudRepository<Customer, Integer> {

	@Query("select c from Customer c")
	public List<Customer> get();
}
