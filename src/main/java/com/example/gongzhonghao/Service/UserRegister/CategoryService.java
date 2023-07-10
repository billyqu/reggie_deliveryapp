package com.example.gongzhonghao.Service.UserRegister;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.gongzhonghao.Domain.Category;

public interface CategoryService extends IService<Category> {
    public void remove(Long id);
}
