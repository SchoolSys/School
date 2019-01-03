package com.school.controller;

import com.school.service.ClassTeacherService;
import com.school.service.ColumnService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 专栏
 * @author 杨德石
 * @date 2019/01/03
 */
@RestController
@RequestMapping("/api/column")
public class ColumnController {

    @Autowired
    private ColumnService columnService;

}
