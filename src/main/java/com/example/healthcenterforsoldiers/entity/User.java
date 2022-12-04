package com.example.healthcenterforsoldiers.entity;


import constants.BloodType;
import constants.Gender;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Builder
@Table(name = "user")

public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String surname;
    private String email;
    private String password;
    private String phoneNumber;
    private String birthDate;
    @Enumerated(value = EnumType.STRING)
    private BloodType bloodType;
    @Enumerated(value =EnumType.STRING )
    private Gender gender;
    @Enumerated(value = EnumType.STRING)
    private Role role;
    private double height;
    private double weight;


}
