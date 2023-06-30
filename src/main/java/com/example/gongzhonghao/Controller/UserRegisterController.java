package com.example.gongzhonghao.Controller;

import com.example.gongzhonghao.Domain.UserRegister;
import com.example.gongzhonghao.Service.UserRegister.UserRegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("user")
public class UserRegisterController {
    @Autowired
    private UserRegisterService userRegisterService;

    @RequestMapping(value = "/register")
    public List<UserRegister> getall(){
        return userRegisterService.listall();
//        return userRegisterService.list();
    }
}
