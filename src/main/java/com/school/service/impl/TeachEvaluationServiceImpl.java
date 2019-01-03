package com.school.service.impl;

import com.school.mapper.TeachEvaluationMapper;
import com.school.service.TeachEvaluationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * * @description: 教学考评serviceImpl
 * * @author: Tonghuan
 * * @create: 2019-01-03
 **/
@Service
@Transactional
public class TeachEvaluationServiceImpl implements TeachEvaluationService {

    @Autowired
    private TeachEvaluationMapper teachEvaluationmapper;
}
