package com.yz_mentalhealth.mapper.department;

import com.yz_mentalhealth.entity.department.Department;

import java.util.List;

public interface DepartmentMapper {

    List<Department> getDepartments();

    Department getDepartment(Department department);
}
