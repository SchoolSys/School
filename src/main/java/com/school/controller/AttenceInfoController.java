package com.school.controller;

import com.school.service.AttenceInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 考勤信息
 * @author 杨德石
 * @date 2019/01/03
 */
@RestController
@RequestMapping("/api/attenceInfo")
public class AttenceInfoController {

    @Autowired
    private AttenceInfoService attenceInfoService;

}
