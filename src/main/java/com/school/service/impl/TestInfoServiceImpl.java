package com.school.service.impl;

import com.school.mapper.TestInfoMapper;
import com.school.service.TestInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * * @description: 考试信息serviceImpl
 * * @author: Tonghuan
 * * @create: 2019-01-03
 **/
@Service
@Transactional
public class TestInfoServiceImpl implements TestInfoService {

    @Autowired
    private TestInfoMapper testInfomapper;
}
