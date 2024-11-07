package com.example.bankapplication.request;

import com.example.bankapplication.model.enums.City;
import lombok.*;

import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CustomerRequest {
    private String customerName;
    private String customerEmail;
    private Long dateOfBirth;
    private City city;
    private String address;
}
