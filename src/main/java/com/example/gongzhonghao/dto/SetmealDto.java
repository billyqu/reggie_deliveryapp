package com.example.gongzhonghao.dto;

import com.example.gongzhonghao.Domain.Setmeal;
import com.example.gongzhonghao.Domain.SetmealDish;
import lombok.Data;
import java.util.List;

@Data
public class SetmealDto extends Setmeal {

    private List<SetmealDish> setmealDishes;

    private String categoryName;
}
