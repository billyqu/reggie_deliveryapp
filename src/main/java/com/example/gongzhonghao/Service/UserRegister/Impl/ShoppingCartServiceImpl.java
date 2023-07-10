package com.example.gongzhonghao.Service.UserRegister.Impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.gongzhonghao.Domain.ShoppingCart;
import com.example.gongzhonghao.Mapper.ShoppingCartMapper;
import com.example.gongzhonghao.Service.UserRegister.ShoppingCartService;
import org.springframework.stereotype.Service;

@Service
public class ShoppingCartServiceImpl extends ServiceImpl<ShoppingCartMapper, ShoppingCart> implements ShoppingCartService {
}
