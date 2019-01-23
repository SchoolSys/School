package com.school.controller;

import com.alibaba.fastjson.JSONObject;
import com.google.common.collect.Maps;
import com.school.jedis.JedisClient;
import com.school.service.UserService;
import com.school.utils.HttpClientUtil;
import com.school.utils.Result;
import com.school.utils.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * 用户
 *
 * @author 杨德石
 * @date 2019/01/03
 */
@RestController
@RequestMapping("/api/v1/user")
public class UserController {


    @Autowired
    private UserService userService;

    @Autowired
    private JedisClient jedisClient;

    @Value("${WX.APPID}")
    private String appid ;

    @Value("${WX.SECREKEY}")
    private String secretKey;

    @Value("${WX.WEXIN_USER_SEESION}")
    private String WEXIN_USER_SEESION;

    private String openid = "021WhPj11RoR3Y1Juql11XbVj11WhPjs";

    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public Result login(@RequestBody Map<String,Object> map) {

        if(map!=null) {
            String code = (String) map.get("wxCode");
            if (StringUtils.isNotBlank(code)) {
                // 通过httpClientUtil调用微信接口
                String url =
                        "https://api.weixin.qq.com/sns/jscode2session?appid=" + appid + "&secret=" +
                                secretKey + "&js_code=" + code + "&grant_type=authorization_code";
                String str = HttpClientUtil.doGet(url);
                // 解析参数
                JSONObject jsonObject = (JSONObject) JSONObject.parse(str);

                openid = jsonObject.get("openid").toString();

                String sessionKey = jsonObject.get("session_key").toString();

                System.out.println("session"+sessionKey);
                if (StringUtils.isNotBlank(openid) && StringUtils.isNotBlank(sessionKey)) {
                    // 取得需要返回的键值对
                    Map<String, Object> info = userService.login(openid);
                    String session = (String) info.get("session");
                    checkRedis(openid, session);

                    // 生成一个对象
                    HashMap<Object, Object> data = Maps.newHashMap();
                    data.put("userInfo", info);

                    return new Result(0, "ok", data);
                }
            }
        }

        return new Result(1,"error","登录失败");
    }

    @RequestMapping(value = "/checkSession",method = RequestMethod.POST)
    public Result checkSession(@RequestBody Map<String,Object> map){

        HashMap<Object, Object> data = Maps.newHashMap();

        if(map != null) {
            // 取得session
            String session = (String) map.get("session");
            if(StringUtils.isNotBlank(session)) {

                String redis = jedisClient.hget(WEXIN_USER_SEESION, session);
                // 判断是否过期 ，没有过期
                if (StringUtils.isNotBlank(redis)) {
                    boolean isBinded = userService.checkBind(session);

                    data.put("isValidity", true);
                    data.put("isBinded", isBinded);
                    return new Result(0, "ok", data);
                }
            }
        }
        // 过期
        data.put("isValidity",false);
        return new Result(0,"ok",data);

    }
    @RequestMapping(value = "/bind",method = RequestMethod.POST)
    public Result bind(@RequestBody Map<String,Object> map){
        if(map!=null) {
            // 取得键值对
            String sid = (String) map.get("sid");
            String password = (String) map.get("password");
            String identity = (String) map.get("identity");
            String session = (String) map.get("session");
            if(StringUtils.isNotBlank(sid) && StringUtils.isNotBlank(password) && StringUtils.isNotBlank(identity) && StringUtils.isNotBlank(session)) {

                String wxId = jedisClient.hget(WEXIN_USER_SEESION, session);
                try {
                    // 调用sevice去更新数据库
                    userService.updateByOpenId("021WhPj11RoR3Y1Juql11XbVj11WhPjs", sid, password, identity);
                    return new Result(0, "ok", null);
                } catch (Exception e) {
                    e.printStackTrace();
                    return new Result(1, "error", null);
                }
            }
        }
        return new Result(1,"error","错误");
    }

    private void checkRedis(String openid,String session){
        // 检查redis是否过期
        String redis = jedisClient.hget(WEXIN_USER_SEESION, session);
        // 没过期,删掉,重新设置值
        if(StringUtils.isNotBlank(redis)){
            jedisClient.hdel(WEXIN_USER_SEESION,session);
        }
        // 刷新缓存
        jedisClient.hset(WEXIN_USER_SEESION,session,openid);
        jedisClient.expire(WEXIN_USER_SEESION,7200);
    }

}
