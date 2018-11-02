package com.stackroute.redis.repo;

import java.util.Map;

import com.stackroute.redis.model.Customer;

public interface CustomerRepository {

	void save(Customer customer);
	Customer find(Long id);
	void delete(Long id);
}
