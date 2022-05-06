package com.jdc.onestop.students.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import javax.management.relation.Role;

@Entity
@Getter
@Setter
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private Role role;
    private String phone;
    private String email;


    @ManyToOne
    private Account account;
}
