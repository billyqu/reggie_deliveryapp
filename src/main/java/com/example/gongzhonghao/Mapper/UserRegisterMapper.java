package com.example.gongzhonghao.Mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.gongzhonghao.Domain.UserRegister;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserRegisterMapper extends BaseMapper<UserRegister> {
    List<UserRegister> listall();

    void register(UserRegister newUser);

}
