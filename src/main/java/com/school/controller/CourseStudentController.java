package com.school.controller;

import com.school.service.CourseStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 课程学生
 * @author 杨德石
 * @date 2019/01/03
 */
@RestController
@RequestMapping("/api/courseStudent")
public class CourseStudentController {

    @Autowired
    private CourseStudentService courseStudentService;

}
