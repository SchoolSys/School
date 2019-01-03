package com.school.controller;

import com.school.service.FollowService;
import com.school.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 职务
 * @author 杨德石
 * @date 2019/01/03
 */
@RestController
@RequestMapping("/api/job")
public class JobController {

    @Autowired
    private JobService jobService;

}
