package com.school.controller;

import com.school.service.TeachEvaluationService;
import com.school.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 教学考评
 * @author 杨德石
 * @date 2019/01/03
 */
@RestController
@RequestMapping("/api/teacherEvaluation")
public class TeacherEvaluationController {

    @Autowired
    private TeachEvaluationService teachEvaluationService;

}
