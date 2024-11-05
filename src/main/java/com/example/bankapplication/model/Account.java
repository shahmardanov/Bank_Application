package com.example.bankapplication.model;

import com.example.bankapplication.model.enums.City;
import com.example.bankapplication.model.enums.Currency;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long accountId;
    private Double balance;

    @Enumerated(value = EnumType.STRING)
    private City city;

    @Enumerated(value = EnumType.STRING)
    private Currency currency;
}
