package com.school.controller;

import com.school.service.ChannelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

/**
 * 教室配置
 * @author 杨德石
 * @date 2019/01/03
 */
@RestController("api/classRoomConfig/")
public class ClassRoomConfigController {

    @Autowired
    private ChannelService channelService;

}