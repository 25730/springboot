package com.example.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

//@TableName("permission")
@Data
public class UserRole {
//    @TableId(type = IdType.AUTO)
    private Integer userId;
    private Integer roleId;
}
