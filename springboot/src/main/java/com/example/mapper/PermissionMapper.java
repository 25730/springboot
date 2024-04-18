package com.example.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.entity.Permission;
import com.example.entity.RolePermission;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface PermissionMapper extends BaseMapper<Permission> {



    @Select("select * from role_permission where role_id = #{roleId}")
    List<RolePermission>getRolePermissionByRoleId(Integer roleId);
}
