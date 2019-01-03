package com.school.controller;

import com.school.service.AttenceInfoService;
import com.school.service.ChannelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

/**
 * 频道
 * @author 杨德石
 * @date 2019/01/03
 */
@RestController("api/channel/")
public class ChannelController {

    @Autowired
    private ChannelService channelService;

}
