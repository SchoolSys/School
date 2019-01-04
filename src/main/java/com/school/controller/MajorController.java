package com.school.controller;

import com.school.service.LessonAddressService;
import com.school.service.MajorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 专业
 * @author 杨德石
 * @date 2019/01/03
 */
@RestController
@RequestMapping("/api/major")
public class MajorController {

    @Autowired
    private MajorService majorService;

}
