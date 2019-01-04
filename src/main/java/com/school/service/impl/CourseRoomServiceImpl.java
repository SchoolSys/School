package com.school.service.impl;

import com.school.mapper.CourseRoomMapper;
import com.school.service.CourseRoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * * @description: 教室serviceImpl
 * * @author: Tonghuan
 * * @create: 2019-01-03
 **/
@Service
@Transactional(rollbackFor = Exception.class)
public class CourseRoomServiceImpl implements CourseRoomService {

    @Autowired
    private CourseRoomMapper courseRoommapper;
}
