package com.school.service.impl;

import com.school.mapper.AttenceInfoMapper;
import com.school.service.AttenceInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @Description: 考勤相关ServiceImpl
 * @Author: Tonghuan
 * @Date: 2019/1/3
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class AttenceInfoServiceImpl implements AttenceInfoService{

    @Autowired
    private AttenceInfoMapper attenceInfoMapper;
}
