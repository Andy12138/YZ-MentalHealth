package com.yz_mentalhealth.department.service;

import com.yz_mentalhealth.user.entity.Department;

import java.util.Collection;

public interface DepartmentService {

    public Collection<Department> getDepartments();

    public Department getDepartment(Integer id);
}
