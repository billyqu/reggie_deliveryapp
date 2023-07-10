package com.example.gongzhonghao.Service.UserRegister.Impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.service.IService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.gongzhonghao.Domain.Category;
import com.example.gongzhonghao.Domain.Dish;
import com.example.gongzhonghao.Domain.Setmeal;
import com.example.gongzhonghao.Mapper.CategoryMapper;
import com.example.gongzhonghao.Service.UserRegister.CategoryService;
import com.example.gongzhonghao.Service.UserRegister.DishService;
import com.example.gongzhonghao.Service.UserRegister.SetmealService;
import com.example.gongzhonghao.common.CustomException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoryServiceImpl extends ServiceImpl<CategoryMapper, Category> implements CategoryService {
    @Autowired
    private DishService dishService;

    @Autowired
    private SetmealService setmealService;

    /**
     * 根据id删除分类
     * @param id
     */
    @Override
    public void remove(Long id) {
        LambdaQueryWrapper<Dish> dishLambdaQueryWrapper = new LambdaQueryWrapper<>();

        dishLambdaQueryWrapper.eq(Dish::getCategoryId, id);
        int count1 = dishService.count(dishLambdaQueryWrapper);

        if(count1 > 0){
            //抛异常
            throw new CustomException("当前分类下关联了菜品，无法删除");
        }

        LambdaQueryWrapper<Setmeal> setmealLambdaQueryWrapper = new LambdaQueryWrapper<>();

        setmealLambdaQueryWrapper.eq(Setmeal::getCategoryId, id);
        int count2 = setmealService.count(setmealLambdaQueryWrapper);

        if(count2 > 0){
            //抛异常
            throw new CustomException("当前分类下关联了套餐，不能删除");
        }

        super.removeById(id);
    }
}
