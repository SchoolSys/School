package com.school.service.impl;

import com.school.mapper.MajorMapper;
import com.school.service.MajorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * * @description: 专业serviceImpl
 * * @author: Tonghuan
 * * @create: 2019-01-03
 **/
@Service
@Transactional(rollbackFor = Exception.class)
public class MajorServiceImpl implements MajorService {

    @Autowired
    private MajorMapper majormapper;
}
