package com.example.gongzhonghao.Mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.gongzhonghao.Domain.Employee;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface EmployeeMapper extends BaseMapper<Employee> {

}
