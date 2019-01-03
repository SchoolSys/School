package com.school.controller;

import com.school.service.AcademyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

/**
 * 基本模块|学院相关
 * @author 杨德石
 * @date 2019/01/03
 */
@RestController("api/academy/")
public class AcademyController {

    @Autowired
    private AcademyService academyService;

}
