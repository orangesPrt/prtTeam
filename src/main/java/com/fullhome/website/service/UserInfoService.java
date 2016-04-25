package com.fullhome.website.service;

import com.fullhome.website.pojo.UserInfo;

/**
 * 用户模块服务层
 * Created by yuanxuefeng on 15/11/18.
 */
public interface UserInfoService {

   public void  addUser(UserInfo userInfo);

   public UserInfo queryUserInfoById(Long uesrId);


}
