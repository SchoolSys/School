package com.school.service.impl;

import com.school.mapper.JobMapper;
import com.school.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * * @description: 职务serviceImpl
 * * @author: Tonghuan
 * * @create: 2019-01-03
 **/
@Service
@Transactional(rollbackFor = Exception.class)
public class JobServiceImpl implements JobService {

    @Autowired
    private JobMapper jobmapper;
}
