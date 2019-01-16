package com.yz_mentalhealth.department.service.impl;

import com.yz_mentalhealth.department.dao.DepartmentDao;
import com.yz_mentalhealth.department.service.DepartmentService;
import com.yz_mentalhealth.user.entity.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class DepartmentServiceImpl implements DepartmentService {

    @Autowired
    private DepartmentDao departmentDao;

    @Override
    public Collection<Department> getDepartments() {
        return departmentDao.getDepartments();
    }

    @Override
    public Department getDepartment(Integer id) {
        return departmentDao.getDepartment(id);
    }
}
