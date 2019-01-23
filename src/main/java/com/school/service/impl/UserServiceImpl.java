package com.school.service.impl;
import com.google.common.collect.Maps;
import com.school.mapper.RoleMapper;
import com.school.mapper.SchoolMapper;
import com.school.mapper.UserRoleMapper;
import com.school.pojo.Role;
import com.school.pojo.School;

import com.school.mapper.UserMapper;
import com.school.pojo.User;
import com.school.pojo.UserRole;
import com.school.service.UserService;
import com.school.utils.DateUtils;
import com.school.utils.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.Map;
import java.util.UUID;

/**
 * * @description: 用户serviceImpl
 * * @author: Tonghuan
 * * @create: 2019-01-03
 **/
@Service
@Transactional(rollbackFor = Exception.class)
public class UserServiceImpl implements UserService {


    @Autowired
    private UserMapper usermapper;

    @Autowired
    private RoleMapper roleMapper;

    @Autowired
    private UserRoleMapper userRoleMapper;

    private SchoolMapper schoolMapper;

    @Override
    public Map<String,Object> login(String openid) {

        Map<String,Object> stringMap = Maps.newHashMap();
        boolean isBinded = false;
        int roleId = 0;
        // 查询用户
        User user = usermapper.selectByOpenId(openid);
        // 如果查询不到,说明是新的用户
        if(user == null){
            // 创建角色对象
            Role role = new Role();
            role.setId(UUID.randomUUID().toString());
            role.setCreateBy("lth");
            role.setCreateTime(DateUtils.newDate());
            role.setUpdateBy("lth");
            role.setUpdateTime(DateUtils.newDate());
            role.setRole(" ");
            role.setDelete((byte)1);
            // 插入角色
            roleMapper.insert(role);
            // 创建学校对象
            School school = new School();
            school.setId(UUID.randomUUID().toString());
            school.setCreateBy("lth");
            school.setCreateTime(DateUtils.newDate());
            school.setUpdateBy("lth");
            school.setUpdateTime(DateUtils.newDate());
            school.setName(" ");
            school.setAddress(" ");
            school.setProvince(" ");
            school.setCity(" ");
            school.setDelete((byte)1);
            // 插入学校
            // 创建用户对象
            user = new User();
            user.setId(UUID.randomUUID().toString());
            user.setCreateBy("李");
            user.setCreateTime(DateUtils.newDate());
            user.setUpdateBy("李");
            user.setUpdateTime(DateUtils.newDate());
            user.setWxId(openid);
            user.setAccout(" ");
            user.setPassword(" ");
            user.setRoleId(role);
            user.setSchoolId(school);
            user.setNickName(" ");
            user.setSex((byte)0);
            user.setInterest(" ");
            user.setFansCount(0);
            user.setFollowCount(0);
            user.setRegdate(" ");
            user.setDelete((byte)1);
            // 插入用户对象
            usermapper.insert(user);
        }
        // 老用户
            String role = user.getRoleId().getRole();
        // 如果用户的角色不为空
            if(StringUtils.isNotBlank(role)){
                if(role.equals("student")){
                         roleId = 0;
                }else{
                    roleId =1;
                }
                // 装入map
                stringMap.put("identity",role);
                stringMap.put("idCode",roleId);
            }else{
                // 为空,则返回""
                stringMap.put("identity",null);
                stringMap.put("idCode",null);
            }
            // 查询accout
            String accout = user.getAccout();

        if(!StringUtils.EMPTY.equals(accout)) {
                isBinded = true;
            stringMap.put("sid",user.getAccout());
        }else{
            stringMap.put("sid",null);
        }

        stringMap.put("isBinded",isBinded);
        // 将userId作为session
        stringMap.put("session",user.getId());
        return stringMap;
    }

    @Override
    public boolean checkBind(String session) {
        User user = usermapper.selectById(session);
        if(user !=null){
            if("".equals(user.getAccout())){
                return false;
            }
        }
        return false;
    }

    @Override
    public void updateByOpenId(String openid, String sid, String password, String identity) {
        User user = usermapper.selectByOpenId(openid);
        if(user != null){
            user.setUpdateBy("李");
            user.setUpdateTime(DateUtils.newDate());
            Role roleId = user.getRoleId();

            if(roleId!=null){
                roleId.setRole(identity);
                roleId.setUpdateTime(DateUtils.newDate());
            }else{
                roleId = new Role();
                roleId.setId(UUID.randomUUID().toString());
                roleId.setCreateBy("lth");
                roleId.setCreateTime(DateUtils.newDate());
                roleId.setUpdateBy("lth");
                roleId.setUpdateTime(DateUtils.newDate());
                roleId.setRole(identity);
                roleId.setDelete((byte)1);
            }
            // userRole表
            UserRole userRole = new UserRole();
            userRole.setId(UUID.randomUUID().toString());
            userRole.setCreateBy("lth");
            userRole.setCreateTime(DateUtils.newDate());
            userRole.setUpdateBy("lth");
            userRole.setUpdateTime(DateUtils.newDate());
            userRole.setUserId(user);
            userRole.setRoleId(roleId);
            userRole.setDelete((byte)1);
            // 插入
            userRoleMapper.insert(userRole);

            user.setRoleId(roleId);
            user.setAccout(sid);
            user.setPassword(password);
            usermapper.updateByWxId(user);
        }
    }


}
