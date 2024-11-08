package com.example.bankapplication.service;

import com.example.bankapplication.exception.CustomerAlreadyExist;
import com.example.bankapplication.exception.CustomerNotFoundException;
import com.example.bankapplication.mapping.CustomerMapping;
import com.example.bankapplication.model.Customer;
import com.example.bankapplication.repository.CustomerRepository;
import com.example.bankapplication.request.CustomerRequest;
import com.example.bankapplication.response.CustomerResponse;
import lombok.RequiredArgsConstructor;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CustomerService {

    private final CustomerRepository customerRepository;
    private final CustomerMapping customerMapping;

    public CustomerResponse createCustomer(CustomerRequest customerRequest) {
        if (customerRepository.findCustomerByCustomerEmail(customerRequest.getCustomerEmail()).isPresent()) {
            throw new CustomerAlreadyExist("Customer not found");
        }
        Customer customer = customerMapping.requestToEntity(customerRequest);
        customerRepository.save(customer);
        return customerMapping.createToResponse(customer);
    }

    public List<CustomerResponse> getAllCustomers(){
        return customerRepository.findAll().stream()
        .map(customerMapping::readToResponse).toList();
    }
}
