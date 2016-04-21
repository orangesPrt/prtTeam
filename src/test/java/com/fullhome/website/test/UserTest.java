package com.fullhome.website.test;

import com.fullhome.website.common.BaseTest;
import com.fullhome.website.dto.NewsDao;
import com.fullhome.website.dto.UserInfoDao;
import com.fullhome.website.pojo.UserInfo;
import com.fullhome.website.service.UserInfoService;
import jdk.nashorn.internal.ir.annotations.Ignore;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * juint 测试类
 * Created by yuanxuefeng on 15/11/18.
 */
public class UserTest extends BaseTest {

    @Autowired
    public UserInfoService userInfoService;


    @Autowired
    private UserInfoDao userInfoDao;

    @Autowired
    private NewsDao newsDao;


    @Test
    @Ignore
    public  void UserTest() {
        UserInfo userInfo = new UserInfo();
        userInfo.setIdCard("420381199210196210");
        userInfo.setPassword("123456");
        userInfo.setUserName("15221842983");
        userInfoService.addUser(userInfo);
    }

    @Test
    @Ignore
    public void query() {
        UserInfo userInfo = userInfoDao.getById(1L);
        System.out.printf("us" + userInfo.getUserName() + "\n");
    }

    @Test
    public void TestNews() {
        newsDao.getById(1L);
    }



}
