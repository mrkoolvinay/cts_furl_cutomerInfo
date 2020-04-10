package com.vinay.customerInfo.repo;

import org.springframework.data.repository.CrudRepository;

import com.vinay.customerInfo.entity.Customer;

public interface CustomerRepo extends CrudRepository<Customer, Integer>{

}
