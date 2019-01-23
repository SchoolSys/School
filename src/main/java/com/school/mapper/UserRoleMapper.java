package com.school.mapper;

import com.school.pojo.UserRole; /**
* @Description: 用户-角色接口
* @Author: Tonghuan
* @Date: 2019/1/3
*/
public interface UserRoleMapper {
/**
 *功能描述 添加用户角色
 * @author lth
 * @date 2019/1/22
 * @param userRole 用户角色
 * @return void
 */
    void insert(UserRole userRole);
}