package com.school.controller;

import com.school.service.UserRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 用户-角色
 * @author 杨德石
 * @date 2019/01/03
 */
@RestController
@RequestMapping("/api/userRole")
public class UserRoleController {

    @Autowired
    private UserRoleService userRoleService;

}
