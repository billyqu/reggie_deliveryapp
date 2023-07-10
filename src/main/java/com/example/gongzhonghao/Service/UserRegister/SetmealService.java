package com.example.gongzhonghao.Service.UserRegister;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.gongzhonghao.Domain.Setmeal;
import com.example.gongzhonghao.dto.SetmealDto;

import java.util.List;

public interface SetmealService extends IService<Setmeal> {
    public void saveWithDish(SetmealDto setmealDto);

    public void removeWithDish(List<Long> ids);

    public SetmealDto getByIdWithFlavor(Long id);

    void updateWithId(SetmealDto setmealDto);
}
