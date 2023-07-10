package com.example.gongzhonghao.Mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.gongzhonghao.Domain.Dish;
import com.fasterxml.jackson.databind.ser.Serializers;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface DishMapper extends BaseMapper<Dish> {
}
