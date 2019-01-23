package com.school.controller;

import com.school.service.RolePowerService;
import com.school.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 角色-权限
 * @author 杨德石
 * @date 2019/01/03
 */
@RestController
@RequestMapping("/api/rolePower")
public class RolePowerController {

    @Autowired
    private RolePowerService rolePowerService;

}
