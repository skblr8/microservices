package com.example.saurabh.microservices.department.repository;

import com.example.saurabh.microservices.department.model.Department;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class DepartmentRepository
{
    private List<Department> departmentList = new ArrayList<Department>();

    public Department addDepartment(Department d) {
        departmentList.add(d);
        return d;
    }

    public Department findById(Long departmentId) {
        return departmentList.stream().filter(x -> x.getId().equals(departmentId)).findFirst().orElseThrow();
    }

    public List<Department> findAll() {
        return departmentList;
    }


}
