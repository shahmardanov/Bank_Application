package com.example.bankapplication.model;

import com.example.bankapplication.model.enums.City;
import jakarta.persistence.*;
import lombok.*;

import java.util.UUID;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String customerName;
    private String customerEmail;
    private Long dateOfBirth;

    @Enumerated(EnumType.STRING)
    private City city;
    private String address;
}
