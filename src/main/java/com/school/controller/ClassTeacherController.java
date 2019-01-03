package com.school.controller;

import com.school.service.ClassRoomConfigService;
import com.school.service.ClassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 班级
 * @author 杨德石
 * @date 2019/01/03
 */
@RestController
@RequestMapping("/api/class")
public class ClassController {

    @Autowired
    private ClassService classService;

}
