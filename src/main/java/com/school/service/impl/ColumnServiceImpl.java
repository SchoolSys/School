package com.school.service.impl;

import com.school.mapper.ColumnMapper;
import com.school.service.ColumnService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * * @description: 专栏serviceImpl
 * * @author: Tonghuan
 * * @create: 2019-01-03
 **/
@Service
@Transactional
public class ColumnServiceImpl implements ColumnService {

    @Autowired
    private ColumnMapper columnmapper;
}
