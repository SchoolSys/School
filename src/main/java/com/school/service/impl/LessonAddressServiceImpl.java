package com.school.service.impl;

import com.school.mapper.LessonAddressMapper;
import com.school.service.LessonAddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * * @description: 课程地址serviceImpl
 * * @author: Tonghuan
 * * @create: 2019-01-03
 **/
@Service
@Transactional
public class LessonAddressServiceImpl implements LessonAddressService {

    @Autowired
    private LessonAddressMapper lessonAddressmapper;
}
