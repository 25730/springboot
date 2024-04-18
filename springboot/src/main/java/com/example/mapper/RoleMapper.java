package com.example.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.entity.AdminRole;
import com.example.entity.Role;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface RoleMapper extends BaseMapper<Role> {

    @Select("select * from admin_role where admin_id = #{adminId}")
    List<AdminRole> getAdminRoleByAdminId(Integer adminId);

    @Select("select * from role where id = #{roleId}")
    List<Role> getByAdminId(Integer roleId);
}
