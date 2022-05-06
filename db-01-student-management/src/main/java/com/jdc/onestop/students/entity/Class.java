package com.jdc.onestop.students.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.sql.Time;

@Entity
@Getter
@Setter
public class Class {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String classType;
    private String startDate;
    private String months;
    private Time time;
    private Time timeTo;

    @OneToOne
    private Employee employee;

    @ManyToOne
    private Course course;
}
