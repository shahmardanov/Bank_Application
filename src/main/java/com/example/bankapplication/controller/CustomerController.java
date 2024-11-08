package com.example.bankapplication.controller;

import com.example.bankapplication.model.Customer;
import com.example.bankapplication.request.CustomerRequest;
import com.example.bankapplication.response.CustomerResponse;
import com.example.bankapplication.service.CustomerService;
import lombok.RequiredArgsConstructor;

import java.util.List;
import java.util.Optional;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/customer")
@RequiredArgsConstructor
public class CustomerController {
    private final CustomerService customerService;

    @PostMapping("/create")
    public ResponseEntity<CustomerResponse> createCustomer(@RequestBody CustomerRequest customerRequest) {
        return ResponseEntity.ok(customerService.createCustomer(customerRequest));
    }

    @GetMapping("/getAll")
    public ResponseEntity<List<CustomerResponse>> getAllCustomers() {
        return ResponseEntity.ok(customerService.getAllCustomers());
    }

    @GetMapping("/getById/{id}")
    public ResponseEntity<Optional<CustomerResponse>> getCustomerByID(@PathVariable(name = "id") Long customerId) {
        return ResponseEntity.ok(customerService.getCustomerById(customerId));
    }

    @GetMapping("/getByEmail/{customerEmail}")
    public ResponseEntity<Optional<CustomerResponse>> getCustomerByEmail(@PathVariable(name = "customerEmail") String email){
        return ResponseEntity.ok(customerService.getCustomerByEmail(email));
    }
}
