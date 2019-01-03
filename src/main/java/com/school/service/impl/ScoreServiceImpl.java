package com.school.service.impl;

import com.school.mapper.ScoreMapper;
import com.school.service.ScoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * * @description: 成绩serviceImpl
 * * @author: Tonghuan
 * * @create: 2019-01-03
 **/
@Service
@Transactional
public class ScoreServiceImpl implements ScoreService {

    @Autowired
    private ScoreMapper scoremapper;
}
