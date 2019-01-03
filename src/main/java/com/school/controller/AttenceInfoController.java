package com.school.controller;

import com.school.service.AcademyService;
import com.school.service.AttenceInfoService;
import com.school.utils.SchoolResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 考勤信息
 * @author 杨德石
 * @date 2019/01/03
 */
@RestController("api/attenceInfo/")
public class AttenceInfoController {

    @Autowired
    private AttenceInfoService attenceInfoService;

    @RequestMapping("test")
    public SchoolResult test() {
        return SchoolResult.ok();
    }

}
