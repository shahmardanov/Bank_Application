package com.example.bankapplication.response;

import com.example.bankapplication.model.enums.City;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AccountResponse {
    private String accountName;
    private Long dateOfBirth;
    private City city;
}
