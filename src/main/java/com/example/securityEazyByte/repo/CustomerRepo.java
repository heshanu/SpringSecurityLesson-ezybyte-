package com.example.securityEazyByte.repo;

import com.example.securityEazyByte.model.Customer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerRepo extends CrudRepository<Customer,Long> {

    List<Customer> findByEmail(String email);
}
