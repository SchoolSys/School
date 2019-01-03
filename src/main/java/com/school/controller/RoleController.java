package com.school.controller;

import com.school.service.PowerService;
import com.school.service.ResourceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 资源 -> 文章,视频
 * @author 杨德石
 * @date 2019/01/03
 */
@RestController
@RequestMapping("/api/resource")
public class ResourceController {

    @Autowired
    private ResourceService resourceService;

}
