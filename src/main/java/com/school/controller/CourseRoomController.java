package com.school.controller;

import com.school.service.CourseRoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 教室
 * @author 杨德石
 * @date 2019/01/03
 */
@RestController
@RequestMapping("/api/courseRoom")
public class CourseRoomController {

    @Autowired
    private CourseRoomService courseRoomService;

}
