package com.fullhome.website.dto;

import com.fullhome.website.pojo.UserInfo;

/**
 * 用户服务层
 * Created by yuanxuefeng on 15/11/18.
 */
public interface UserInfoDao {

   public UserInfo getById(long userId);

   public void  insertUserInfo(UserInfo userInfo);


}
