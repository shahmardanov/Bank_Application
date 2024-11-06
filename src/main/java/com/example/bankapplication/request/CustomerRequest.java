package com.example.bankapplication.request;

import com.example.bankapplication.model.enums.City;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.*;

import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CustomerRequest {
    private String customerName;
    private String accountNumber = UUID.randomUUID().toString();
    private Long dateOfBirth;
    private City city;
    private String address;
}
