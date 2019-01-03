package com.school.service.impl;

import com.school.mapper.ItemsMapper;
import com.school.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * * @description: 学期时间serviceImpl
 * * @author: Tonghuan
 * * @create: 2019-01-03
 **/
@Service
@Transactional
public class ItemsServiceImpl implements ItemsService {

    @Autowired
    private ItemsMapper itemsmapper;
}
