package com.example.saurabh.microservices.department.model;

public record Employee(Long id, Long departmentId, String name, int age, String position) {
}
