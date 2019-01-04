package com.school.service.impl;

import com.school.mapper.ClassRoomConfigMapper;
import com.school.service.ClassRoomConfigService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @Description: 教室配置相关ServiceImpl
 * @Author: Tonghuan
 * @Date: 2019/1/3
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class ClassRoomConfigServiceImpl implements ClassRoomConfigService {

    @Autowired
    private ClassRoomConfigMapper classRoomConfigMapper;

}
