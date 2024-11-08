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
    private Long id;
    private String customerName;
    private String customerEmail;
    private City city;
    private String address;
}
