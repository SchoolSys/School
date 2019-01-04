package com.school.controller;

import com.school.service.TeachEvaluationService;
import com.school.service.TestInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 考试信息
 * @author 杨德石
 * @date 2019/01/03
 */
@RestController
@RequestMapping("/api/testInfo")
public class TestInfoController {

    @Autowired
    private TestInfoService testInfoService;

}
