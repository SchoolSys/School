package com.school.service.impl;

import com.school.mapper.FollowMapper;
import com.school.service.FollowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * * @description: 关注serviceImpl
 * * @author: Tonghuan
 * * @create: 2019-01-03
 **/
@Service
@Transactional
public class FollowServiceImpl implements FollowService {

    @Autowired
    private FollowMapper followmapper;
}
