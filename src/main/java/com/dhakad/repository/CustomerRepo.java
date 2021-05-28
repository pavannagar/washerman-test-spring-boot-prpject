package com.dhakad.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.dhakad.entity.Customer;
@Repository
public interface CustomerRepo extends CrudRepository<Customer, Integer> {

}
