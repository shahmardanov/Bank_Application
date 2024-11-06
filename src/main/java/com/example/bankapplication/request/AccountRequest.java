package com.example.bankapplication.request;

import com.example.bankapplication.model.enums.City;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AccountRequest {

    private String accountName;
    private Long dateOfBirth;
    private City city;
    private String address;
}
