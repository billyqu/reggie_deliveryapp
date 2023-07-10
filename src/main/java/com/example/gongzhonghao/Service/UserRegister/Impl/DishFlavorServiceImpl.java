package com.example.gongzhonghao.Service.UserRegister.Impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.gongzhonghao.Domain.DishFlavor;
import com.example.gongzhonghao.Mapper.DishFlavorMapper;
import com.example.gongzhonghao.Service.UserRegister.DishFlavorService;
import org.springframework.stereotype.Service;

@Service
public class DishFlavorServiceImpl extends ServiceImpl<DishFlavorMapper, DishFlavor> implements DishFlavorService {
}
