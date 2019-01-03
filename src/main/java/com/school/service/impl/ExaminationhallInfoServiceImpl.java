package com.school.service.impl;

import com.school.mapper.ExaminationhallInfoMapper;
import com.school.service.ExaminationhallInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * * @description: 考场信息serviceImpl
 * * @author: Tonghuan
 * * @create: 2019-01-03
 **/
@Service
@Transactional
public class ExaminationhallInfoServiceImpl implements ExaminationhallInfoService {

    @Autowired
    private ExaminationhallInfoMapper examinationhallInfomapper;
}
