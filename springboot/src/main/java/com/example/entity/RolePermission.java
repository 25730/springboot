package com.example.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

//@TableName("permission")
@Data
public class RolePermission {
//    @TableId(type = IdType.AUTO)
    private Integer roleId;
    private Integer permissionId;}

