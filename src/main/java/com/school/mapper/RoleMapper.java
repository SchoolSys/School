package com.school.mapper;

import com.school.pojo.Role;

/**
* @Description: 角色接口
* @Author: Tonghuan
* @Date: 2019/1/3
*/
public interface RoleMapper {
/**
 *功能描述 取角色
 * @author lth
 * @date 2019/1/22
 * @param  roleId
 * @return com.school.pojo.Role
 */
   Role selectRoleById(String roleId);
/**
 *功能描述 插入角色
 * @author lth
 * @date 2019/1/22
 * @param  role 角色
 * @return void
 */
    void insert(Role role);
}