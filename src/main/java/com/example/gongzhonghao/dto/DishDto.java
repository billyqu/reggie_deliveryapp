package com.example.gongzhonghao.dto;

import com.example.gongzhonghao.Domain.Dish;
import com.example.gongzhonghao.Domain.DishFlavor;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class DishDto extends Dish {

    private List<DishFlavor> flavors = new ArrayList<>();

    private String categoryName;

    private Integer copies;
}
