package com.yz_mentalhealth.user.dao;

import com.yz_mentalhealth.department.dao.DepartmentDao;
import com.yz_mentalhealth.department.entity.Department;
import com.yz_mentalhealth.user.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;


@Repository
public class UserDao {

	private static Map<Integer, User> user = null;
	
	@Autowired
	private DepartmentDao departmentDao;
	
	static{
		user = new HashMap<Integer, User>();

		user.put(1001, new User(1001, "E-AA", "aa@163.com", 1, new Department(101, "D-AA")));
		user.put(1002, new User(1002, "E-BB", "bb@163.com", 1, new Department(102, "D-BB")));
		user.put(1003, new User(1003, "E-CC", "cc@163.com", 0, new Department(103, "D-CC")));
		user.put(1004, new User(1004, "E-DD", "dd@163.com", 0, new Department(104, "D-DD")));
		user.put(1005, new User(1005, "E-EE", "ee@163.com", 1, new Department(105, "D-EE")));
	}
	
	private static Integer initId = 1006;
	
	public void save(User newUser){
		if(newUser.getId() == null){
			newUser.setId(initId++);
		}

		newUser.setDepartment(departmentDao.getDepartment(newUser.getDepartment().getId()));
		user.put(newUser.getId(), newUser);
	}
	
	public Collection<User> getAll(){
		return user.values();
	}
	
	public User get(Integer id){
		return user.get(id);
	}
	
	public void delete(Integer id){
		user.remove(id);
	}
}
