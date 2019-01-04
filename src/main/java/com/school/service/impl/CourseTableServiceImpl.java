package com.school.service.impl;

import com.school.mapper.CourseTableMapper;
import com.school.service.CourseTableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * * @description: 课程表serviceImpl
 * * @author: Tonghuan
 * * @create: 2019-01-03
 **/
@Service
@Transactional(rollbackFor = Exception.class)
public class CourseTableServiceImpl implements CourseTableService {

    @Autowired
    private CourseTableMapper courseTablemapper;
}
