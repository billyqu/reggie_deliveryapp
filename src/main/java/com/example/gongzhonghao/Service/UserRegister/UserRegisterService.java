package com.example.gongzhonghao.Service.UserRegister;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.gongzhonghao.Domain.UserRegister;
import org.springframework.stereotype.Service;

import java.util.List;

public interface UserRegisterService extends IService<UserRegister> {
    List<UserRegister> listall();

    String register(UserRegister newUser);


//    String register(String username, Integer userid);
}
