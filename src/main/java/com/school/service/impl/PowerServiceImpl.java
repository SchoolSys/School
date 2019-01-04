package com.school.service.impl;

import com.school.mapper.PowerMapper;
import com.school.service.PowerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * * @description: 权限serviceImpl
 * * @author: Tonghuan
 * * @create: 2019-01-03
 **/
@Service
@Transactional(rollbackFor = Exception.class)
public class PowerServiceImpl implements PowerService {

    @Autowired
    private PowerMapper powermapper;
}
