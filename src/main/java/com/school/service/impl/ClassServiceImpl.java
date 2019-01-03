package com.school.service.impl;

import com.school.mapper.ClassMapper;
import com.school.service.ClassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
* @Description: 班级serviceImpl
* @Author: Tonghuan
* @Date: 2019/1/3
*/
@Service
@Transactional
public class ClassServiceImpl implements ClassService{

    @Autowired
    private ClassMapper classMapper;
}
