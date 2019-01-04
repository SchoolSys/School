package com.school.service.impl;

import com.school.mapper.AcademyMapper;
import com.school.service.AcademyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
* @Description: 学院相关ServiceImpl
* @Author: Tonghuan
* @Date: 2019/1/3
*/
@Service
@Transactional(rollbackFor = Exception.class)
public class AcademyServiceImpl implements AcademyService{

    @Autowired
    private AcademyMapper academyMapper;
}
