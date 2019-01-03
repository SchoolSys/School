package com.school.service.impl;

import com.school.mapper.RolePowerMapper;
import com.school.service.RolePowerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * * @description: 角色-权限serviceImpl
 * * @author: Tonghuan
 * * @create: 2019-01-03
 **/
@Service
@Transactional
public class RolePowerServiceImpl implements RolePowerService {

    @Autowired
    private RolePowerMapper rolePowermapper;
}
