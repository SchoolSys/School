package com.school.service.impl;

import com.school.mapper.FriendMapper;
import com.school.service.FriendService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * * @description: 好友serviceImpl
 * * @author: Tonghuan
 * * @create: 2019-01-03
 **/
@Service
@Transactional
public class FriendServiceImpl implements FriendService {

    @Autowired
    private FriendMapper friendmapper;
}
