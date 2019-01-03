package com.school.controller;

import com.school.service.MajorService;
import com.school.service.PowerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 权限
 * @author 杨德石
 * @date 2019/01/03
 */
@RestController
@RequestMapping("/api/power")
public class PowerController {

    @Autowired
    private PowerService powerService;

}
