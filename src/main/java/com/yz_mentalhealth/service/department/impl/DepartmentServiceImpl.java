package com.yz_mentalhealth.service.department.impl;

import com.yz_mentalhealth.mapper.department.DepartmentMapper;
import com.yz_mentalhealth.service.department.DepartmentService;
import com.yz_mentalhealth.entity.department.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class DepartmentServiceImpl implements DepartmentService {

    @Autowired
    private DepartmentMapper departmentMapper;

    @Override
    public List<Department> getDepartments() {
        return departmentMapper.getDepartments();
    }

    @Override
    public Department getDepartment(Department department) {
        return departmentMapper.getDepartment(department);
    }
}
