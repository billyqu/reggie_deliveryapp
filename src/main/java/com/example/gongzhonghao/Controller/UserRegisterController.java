package com.example.gongzhonghao.Controller;

import com.example.gongzhonghao.Domain.UserRegister;
import com.example.gongzhonghao.Service.UserRegister.UserRegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("user")
public class UserRegisterController {
    @Autowired
    private UserRegisterService userRegisterService;

    @RequestMapping(value = "/getall")
    public List<UserRegister> getall(){
        return userRegisterService.listall();
//        return userRegisterService.list();
    }

    @RequestMapping(value = "/register")
    //@RequestParam("id") int id,
    public String register(@RequestParam("no") String no, @RequestParam("name") String name, @RequestParam("password") String password, @RequestParam("roleId") int roleId, @RequestParam("isValid") String isValid){
        UserRegister new_user = new UserRegister();
        new_user.setNo(no);
        new_user.setName(name);
        new_user.setPassword(password);
        new_user.setRoleId(roleId);
        new_user.setIsvalid(isValid);
        return userRegisterService.register(new_user);

//        return userRegisterService.save(new_user);
    }
}
