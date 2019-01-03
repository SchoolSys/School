package com.school.service.impl;

import com.school.mapper.CourseClassMapper;
import com.school.service.CourseClassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * * @description: 课程-班级serviceImpl
 * * @author: Tonghuan
 * * @create: 2019-01-03
 **/
@Service
@Transactional
public class CourseClassServiceImpl implements CourseClassService {

    @Autowired
    private CourseClassMapper courseClassmapper;
}
