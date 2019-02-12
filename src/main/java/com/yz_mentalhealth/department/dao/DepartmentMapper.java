package com.yz_mentalhealth.department.dao;

import com.yz_mentalhealth.department.entity.Department;

import java.util.List;

public interface DepartmentMapper {

    List<Department> getDepartments();

    Department getDepartment(Department department);
}
