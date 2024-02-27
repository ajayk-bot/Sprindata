package com.example.SPRINGDATA.models;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "studentaddress")
public class StudentAddress {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int pinCode;
    private String address;
    private String laneName;
    private String countryName;
    private String stateName;


}
