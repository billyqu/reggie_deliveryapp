package com.example.gongzhonghao.Domain;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("user")
public class UserRegister {
    private int id;
    private String no;
    private String name;
    private String password;
    @TableField("role_id")
    private int roleId;
    @TableField("isValid")
    private String isvalid;
}
