package com.example.healthcenterforsoldiers.entity;


import constants.Country;
import constants.Region;
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
@Table(name = "address")
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private Country country;

    private Region region;

    private String city;

    private String street;

    private String houseMember;

    @ManyToOne
    private User user;

}
