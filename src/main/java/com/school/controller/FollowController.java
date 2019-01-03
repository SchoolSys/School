package com.school.controller;

import com.school.service.CourseTableService;
import com.school.service.CourseTeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 课程-老师
 * @author 杨德石
 * @date 2019/01/03
 */
@RestController
@RequestMapping("/api/courseTeacher")
public class CourseTeacherController {

    @Autowired
    private CourseTeacherService courseTeacherService;

}
