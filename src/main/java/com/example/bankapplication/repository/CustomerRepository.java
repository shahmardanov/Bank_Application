package com.example.bankapplication.repository;

import com.example.bankapplication.model.Customer;
import com.example.bankapplication.response.CustomerResponse;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
    Optional<Customer> findCustomerByCustomerEmail(String customerEmail);

}
