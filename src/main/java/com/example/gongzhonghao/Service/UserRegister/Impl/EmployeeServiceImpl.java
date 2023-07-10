package com.example.gongzhonghao.Service.UserRegister.Impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.gongzhonghao.Domain.Employee;
import com.example.gongzhonghao.Mapper.EmployeeMapper;
import com.example.gongzhonghao.Service.UserRegister.EmployeeService;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl extends ServiceImpl<EmployeeMapper, Employee> implements EmployeeService {
}
