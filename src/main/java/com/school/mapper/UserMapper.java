package com.school.mapper;

import com.school.pojo.User;

/**
* @Description: 用户接口
* @Author: Tonghuan
* @Date: 2019/1/3
*/
public interface UserMapper {


    /**
     *功能描述  通过openID查询user
     * @author lth
     * @date 2019/1/20
     * @param  openid
     * @return  用户user
     */

    User selectByOpenId(String openid);

    /**
     *功能描述  通过openID查询user
     * @author lth
     * @date 2019/1/20
     * @param  user 用户
     * @return  用户user
     */

    void insert(User user);
    /**
     *功能描述 通过id进行查询
     * @author lth
     * @date 2019/1/20
     * @param  session 用户id
     * @return com.school.pojo.User
     */
    User selectById(String session);
    /**
     *功能描述 更新用户
     * @author lth
     * @date 2019/1/20
     * @param user 用户
     * @return void
     */
    void updateByWxId(User user);
}