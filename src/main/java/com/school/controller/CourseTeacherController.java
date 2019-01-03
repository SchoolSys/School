package com.school.controller;

import com.school.service.CourseStudentService;
import com.school.service.CourseTableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 课程表
 * @author 杨德石
 * @date 2019/01/03
 */
@RestController
@RequestMapping("/api/courseTable")
public class CourseTableController {

    @Autowired
    private CourseTableService courseTableService;

}
