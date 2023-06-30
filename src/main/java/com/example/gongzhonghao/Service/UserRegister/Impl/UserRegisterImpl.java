package com.example.gongzhonghao.Service.UserRegister.Impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.gongzhonghao.Domain.UserRegister;
import com.example.gongzhonghao.Mapper.UserRegisterMapper;
import com.example.gongzhonghao.Service.UserRegister.UserRegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserRegisterImpl extends ServiceImpl<UserRegisterMapper, UserRegister> implements UserRegisterService {
    @Autowired
    private UserRegisterMapper userRegisterMapper;

    @Override
    public List<UserRegister> listall() {
        return userRegisterMapper.listall();
    }

//    @Autowired
//    private UserRegisterMapper userRegisterMapper;
//    @Override
//    public String register(String username, Integer userid) {
//        System.out.println("mapper上");
//        userRegisterMapper.register(username, userid);
//        System.out.println("mapper下");
//        return "as";
//    }
}
