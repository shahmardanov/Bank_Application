package com.example.bankapplication.service;

import com.example.bankapplication.exception.CustomerNotFoundException;
import com.example.bankapplication.mapping.CustomerMapping;
import com.example.bankapplication.model.Customer;
import com.example.bankapplication.repository.CustomerRepository;
import com.example.bankapplication.request.CustomerRequest;
import com.example.bankapplication.response.CustomerResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CustomerService {

    private final CustomerRepository customerRepository;
    private final CustomerMapping customerMapping;

    public CustomerResponse createCustomer(CustomerRequest customerRequest) {
        if (customerRepository.findCustomerByAccountNumber(customerRequest.getAccountNumber()).isPresent()) {
            throw new CustomerNotFoundException("Customer not found");
        }
        Customer customer = customerMapping.requestToEntity(customerRequest);
        customerRepository.save(customer);
        return customerMapping.createToResponse(customer);
    }
}
