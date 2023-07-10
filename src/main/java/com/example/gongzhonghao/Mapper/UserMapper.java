package com.example.gongzhonghao.Mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.gongzhonghao.Domain.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper extends BaseMapper<User> {
}
