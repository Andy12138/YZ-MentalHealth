package com.yz_mentalhealth.service.department;

import com.yz_mentalhealth.entity.department.Department;

import java.util.List;


public interface DepartmentService {

     List<Department> getDepartments();

     Department getDepartment(Department department);
}
