package com.example.entity;

import lombok.Data;

//@TableName("permission")
@Data
public class AdminRole {
//    @TableId(type = IdType.AUTO)
    private Integer adminId;
    private Integer roleId;
}
