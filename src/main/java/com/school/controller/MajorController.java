package com.school.controller;

import com.school.service.ItemsService;
import com.school.service.LessonAddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 课程地址
 * @author 杨德石
 * @date 2019/01/03
 */
@RestController
@RequestMapping("/api/lessonAddress")
public class LessonAddressController {

    @Autowired
    private LessonAddressService lessonAddressService;

}
