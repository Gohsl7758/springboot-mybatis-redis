package com.Controller;

import com.Bean.Users;
import com.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestControl {
    @Autowired
    UserService service;
    @RequestMapping("/hello")
    public String sayHello(){
        System.out.println("wolaile");
        return "hello";
    }

    @RequestMapping("/regist")
    public String regist(){
        System.out.println("regist");
        String username="hsl";
        String password="123";
        Users users = new Users();
        users.setPassword(password);
        users.setUsername(username);
        service.regist(users);
        return "hello";
    }
}
