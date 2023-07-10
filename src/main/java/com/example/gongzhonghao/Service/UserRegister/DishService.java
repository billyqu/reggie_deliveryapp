package com.example.gongzhonghao.Service.UserRegister;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.gongzhonghao.Domain.Dish;
import com.example.gongzhonghao.dto.DishDto;

import java.util.List;

public interface DishService extends IService<Dish> {
    //新增菜品，插入口味数据
    public void saveWithFlavor(DishDto dishDto);

    //根据id查询菜品信息
    public DishDto getByIdWithFlavor(Long id);

    //更新
    public void updateWithFlavor(DishDto dishDto);

    void removeWithId(List<Long> ids);
}
