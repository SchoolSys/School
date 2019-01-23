package com.school.controller;

import com.school.service.CourseInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 课程信息
 * @author 杨德石
 * @date 2019/01/03
 */
@RestController
@RequestMapping("/api/courseInfo")
public class CourseInfoController {

    @Autowired
    private CourseInfoService courseInfoService;




}
