package com.zhangym.service;

import com.alibaba.fastjson.JSONObject;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.IService;
import com.zhangym.entity.User;

import java.util.Map;

public interface IUserService  extends IService<User> {

    Map<String, Object> getLoginUserAndMenuInfo(User user);


    Map<String,Object> checkMobileAndPasswd(JSONObject requestJson)throws Exception;


    User insertUserByAdmin(JSONObject requestJson)throws Exception;
}