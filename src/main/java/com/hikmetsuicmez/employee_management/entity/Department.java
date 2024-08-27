package com.hikmetsuicmez.employee_management.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "departments")
public class Department {

    @Id
    @GeneratedValue
    private Long id;
    private String name;

    @OneToMany(mappedBy = "department", cascade = CascadeType.ALL)
    private List<Employee> employees;

}
