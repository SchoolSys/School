package com.school.controller;

import com.school.service.CourseClassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 课程-班级
 * @author 杨德石
 * @date 2019/01/03
 */
@RestController
@RequestMapping("/api/courseClass")
public class CourseClassController {

    @Autowired
    private CourseClassService courseClassService;

}
