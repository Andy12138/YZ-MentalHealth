package com.yz_mentalhealth.user.controller;

import com.yz_mentalhealth.department.service.DepartmentService;
import com.yz_mentalhealth.department.entity.Department;
import com.yz_mentalhealth.user.entity.User;
import com.yz_mentalhealth.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private DepartmentService departmentService;


    //获取用户列表
    @GetMapping("/userList")
    public String list(Model model){
        Collection<User> userList = userService.getAll();
        //放在请求域中
        model.addAttribute("userList",userList);

        return "/user/userList";

    }

    //进入用户新增页面
    @GetMapping("/user")
    public String toUserAdd(Model model){
        Collection<Department> departments = departmentService.getDepartments();
        model.addAttribute("departList",departments);
        return "user/userAdd";
    }

    //新增一个用户
    @PostMapping("/user")
    public String userAdd(User user){
        userService.save(user);
        return "redirect:/userList";
    }

    //进入修改页面
    @GetMapping("/user/{id}")
    public String toUserUpdate(@PathVariable("id") Integer id,Model model){
        User user = userService.get(id);
        model.addAttribute("user",user);
        Collection<Department> departments = departmentService.getDepartments();
        model.addAttribute("departList",departments);
        return "user/userAdd";
    }

    //修改用户数据
    @PutMapping("/user")
    public String userUpdate(User user){
        userService.save(user);
        return "redirect:/userList";
    }

    //删除用户
    @DeleteMapping("/user/{id}")
    public String deleteUser(@PathVariable("id") Integer id){
        userService.delete(id);
        return "redirect:/userList";
    }

}
