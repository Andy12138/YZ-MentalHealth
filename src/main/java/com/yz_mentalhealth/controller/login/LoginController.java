package com.yz_mentalhealth.controller.login;

import com.yz_mentalhealth.service.login.LoginService;
import com.yz_mentalhealth.entity.user.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpSession;
import java.util.Map;

@Controller
public class LoginController {

    @Autowired
    private LoginService loginService;

    @PostMapping("/login/isLogin")
    public String isLogin(User user,
                          Map<String,Object> map){
        if (loginService.isLogin(user)) {
            return "redirect:/main.html";
        } else {
            map.put("msg","用户名密码错误");
            return "login";
        }


    }

//    @PostMapping("/login/isLogin")
//    public String isLogin(@RequestParam("username")String username, @RequestParam("password")String password,
//                          Map<String,Object> map,
//                          HttpSession session){
//        if ("admin".equals(username) && "123456".equals(password)) {
//            session.setAttribute("loginUser", username);
//            return "redirect:/main.html";
//        } else {
//            map.put("msg","用户名密码错误");
//            return "login";
//        }
//    }
}
