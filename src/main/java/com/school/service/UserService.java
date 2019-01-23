package com.school.service;

import java.util.Map;

/**
 * 用户Service
 * @author 杨德石
 * @date 2019/01/03
 */
public interface UserService {
    /**
     * 功能描述 用于登录功能,去向微信服务器获得session_key和openid
     * @author lth
     * @date 2019/1/19
     * @param wxCode
     * @return java.lang.String
     */
    Map<String,Object> login(String wxCode);
    /**
     *功能描述 用于检查用户是否绑定
     * @author lth
     * @date 2019/1/20
     * @param session (用户id)
     * @return boolean
     */
    boolean checkBind(String session);

/**
 *功能描述 更新学生的身份
 * @author lth
 * @date 2019/1/20
 * @param openid（用户唯一Id） , sid(学号), password(密码) identity(身份)
 * @return void
 */

    void updateByOpenId(String openid, String sid, String password, String identity);
}
