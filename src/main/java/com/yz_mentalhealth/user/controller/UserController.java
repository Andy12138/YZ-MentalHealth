package com.yz_mentalhealth.user.controller;

import com.yz_mentalhealth.user.entity.User;
import com.yz_mentalhealth.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Collection;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    //获取用户列表
    @GetMapping("/userList")
    public String list(Model model){
        Collection<User> userList = userService.getAll();
        //放在请求域中
        model.addAttribute("userList",userList);

        return "/user/list";

    }


}
