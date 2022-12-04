package com.example.healthcenterforsoldiers.entity;


import constants.Gender;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Builder
@Table(name = "doctor")
public class Doctor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    private String surname;

    private String patronymic;

    @Enumerated
    private Gender gender;

    @DateTimeFormat(pattern ="dd-mm-yyyy")
    private Date birtDate;

    @ManyToOne
    private Specialization specialization;

}
