package com.school.controller;

import com.school.service.FriendService;
import com.school.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 学期时间
 * @author 杨德石
 * @date 2019/01/03
 */
@RestController
@RequestMapping("/api/item")
public class ItemController {

    @Autowired
    private ItemsService itemsService;

}
