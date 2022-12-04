package com.example.healthcenterforsoldiers.entity;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Builder
@Table(name = "register_time")
public class RegisterTime {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "date")
    @DateTimeFormat(pattern ="dd-mm-yyyy")
    private String date;

    @Column(name = "active")
    private Integer  active;


    @ManyToOne
    private User user;

    private Doctor doctor;

}
