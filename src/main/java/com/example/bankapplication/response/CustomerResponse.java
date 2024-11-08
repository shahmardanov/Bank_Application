package com.example.bankapplication.response;

import com.example.bankapplication.model.enums.City;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CustomerResponse {
    private String customerName;
    private String customerEmail;
    private City city;
    private String address;
}
