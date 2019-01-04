package com.school.service.impl;

import com.school.mapper.SchoolMapper;
import com.school.service.SchoolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * * @description: 学校serviceImpl
 * * @author: Tonghuan
 * * @create: 2019-01-03
 **/
@Service
@Transactional
public class SchoolServiceImpl implements SchoolService {

    @Autowired
    private SchoolMapper schoolmapper;
}
