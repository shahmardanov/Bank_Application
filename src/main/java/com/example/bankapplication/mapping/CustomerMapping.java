package com.example.bankapplication.mapping;

import com.example.bankapplication.model.Customer;
import com.example.bankapplication.request.CustomerRequest;
import com.example.bankapplication.response.CustomerResponse;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE,
        unmappedSourcePolicy = ReportingPolicy.IGNORE)
public interface CustomerMapping {

    Customer requestToEntity(CustomerRequest customerRequest);

    CustomerResponse createToResponse(Customer customer);

    CustomerResponse readToResponse(Customer customer);

    CustomerResponse updateToResponse(Customer customer);

    CustomerResponse toLong (Customer customerId);

    Customer updateCustomerToUpdateResponse(CustomerRequest customerRequest, @MappingTarget Customer customer);

    


}
