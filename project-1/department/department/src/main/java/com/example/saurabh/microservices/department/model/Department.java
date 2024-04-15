package com.example.saurabh.microservices.department.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Department {
    private Long id;
    private String name;

    List<Employee> employeeList = new ArrayList<>();

}
