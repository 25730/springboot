package com.example.controller;

import cn.hutool.core.util.ObjectUtil;
import cn.hutool.core.util.StrUtil;
import com.example.common.Result;
import com.example.common.enums.ResultCodeEnum;
import com.example.common.enums.RoleEnum;
import com.example.entity.*;
import com.example.mapper.PermissionMapper;
import com.example.mapper.RoleMapper;
import com.example.service.AdminService;
import com.example.service.UserService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.io.PushbackReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/**
 * 基础前端接口
 */
@RestController
public class WebController {

    @Resource
    private AdminService adminService;
    @Resource
    private UserService userService;
    @Resource
    RoleMapper roleMapper;
    @Resource
    Admin admin;
    @Resource
    Account account;
    @Resource
    PermissionMapper permissionMapper;

    @GetMapping("/")
    public Result hello() {
        return Result.success("访问成功");
    }

    /**
     * 登录
     */
    @PostMapping("/login")
    public Result login(@RequestBody Account account) {
        if (ObjectUtil.isEmpty(account.getUsername()) || ObjectUtil.isEmpty(account.getPassword())
                || ObjectUtil.isEmpty(account.getRole())) {
            return Result.error(ResultCodeEnum.PARAM_LOST_ERROR);
        }
        if (RoleEnum.ADMIN.name().equals(account.getRole())) {
            account = adminService.login(account);
        }
        if (RoleEnum.USER.name().equals(account.getRole())) {
            account = userService.login(account);
        }
//        HashSet<Permission> permissionsSet =  new HashSet<>();
//        Integer adminId  = admin.getId();
//       List<AdminRole> adminRoles =  roleMapper.getAdminRoleByAdminId(adminId);
//        List<Permission> permissions = new ArrayList<>();
//        for (AdminRole adminRole : adminRoles){
//            List<RolePermission> rolePermissions = permissionMapper.getRolePermissionByRoleId(adminRole.getRoleId());
//            for (RolePermission rolePermission : rolePermissions){
//               Integer permissionId =  rolePermission.getPermissionId();
//
//             Permission permission =   permissionMapper.selectById(permissionId);
//             permissionsSet.add(permission);
//            }
//        }
//        admin.setPermissions(permissionsSet);


        return Result.success(account);
    }

    /**
     * 注册
     */
    @PostMapping("/register")
    public Result register(@RequestBody Account account) {
        if (StrUtil.isBlank(account.getUsername()) || StrUtil.isBlank(account.getPassword())
                || ObjectUtil.isEmpty(account.getRole())) {
            return Result.error(ResultCodeEnum.PARAM_LOST_ERROR);
        }
//        if (RoleEnum.ADMIN.name().equals(account.getRole())) {
//            adminService.register(account);
//        }
        userService.register(account);//只能注册普通用户
        return Result.success();
    }

    /**
     * 修改密码
     */
    @PutMapping("/updatePassword")
    public Result updatePassword(@RequestBody Account account) {
        if (StrUtil.isBlank(account.getUsername()) || StrUtil.isBlank(account.getPassword())
                || ObjectUtil.isEmpty(account.getNewPassword())) {
            return Result.error(ResultCodeEnum.PARAM_LOST_ERROR);
        }
        if (RoleEnum.ADMIN.name().equals(account.getRole())) {
            adminService.updatePassword(account);
        }
        if (RoleEnum.USER.name().equals(account.getRole())) {
            userService.updatePassword(account);
        }
        return Result.success();
    }

    public static void main(String[] args) {
        Permission permission1 = new Permission();
        permission1.setPath("/admin");

        Permission permission2 = new Permission();
        permission2.setPath("/admin");


        HashSet<Permission> permissions = new HashSet<>();
        permissions.add(permission1);
        permissions.add(permission2);

        System.out.println(permissions);
    }

}
