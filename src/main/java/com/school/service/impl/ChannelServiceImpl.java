package com.school.service.impl;

import com.school.mapper.ChannelMapper;
import com.school.service.ChannelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @Description: 频道相关ServiceImpl
 * @Author: Tonghuan
 * @Date: 2019/1/3
 */
@Service
@Transactional
public class ChannelServiceImpl implements ChannelService{

    @Autowired
    private ChannelMapper channelMapper;
}
