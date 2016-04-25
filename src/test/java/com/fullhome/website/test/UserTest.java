package com.fullhome.website.test;

import com.fullhome.website.common.BaseTest;
import com.fullhome.website.dto.NewsDao;
import com.fullhome.website.dto.UserInfoDao;
import com.fullhome.website.pojo.News;
import com.fullhome.website.pojo.UserInfo;
import com.fullhome.website.service.NewsService;
import com.fullhome.website.service.UserInfoService;
import jdk.nashorn.internal.ir.annotations.Ignore;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;

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

    @Autowired
    private NewsService newsService;


    @Test
    @Ignore
    public  void UserTest() {
        UserInfo userInfo = new UserInfo();
        userInfo.setIdCard("420381199210196210");
        userInfo.setPassword("123456");
        userInfo.setUserName("yuanxuefeng");
        userInfoService.addUser(userInfo);
    }

    @Test
    @Ignore
    public void query() {
        UserInfo userInfo = userInfoDao.getById(1L);
        System.out.printf("us" + userInfo.getUserName() + "\n");
    }

    //======================== 新闻资讯类 测试方法 ===============================
    @Test
    @Ignore
    public void TestNews() {
        News news = new News();
        news.setArticleType("NEWS");
        news.setContent("每天一笑,未来十年笑.");
        news.setImageUrl("www.baidu.com");
        news.setTitle("内涵段子");
        news.setIsTop(0);
        news.setCreateDate(new Date());
        news.setEndTime(new Date());
        news.setIsUse(0);
        newsDao.insertNews(news);
    }

    @Test
    public void queryNews() {
        News news = newsDao.getById(2L);
        News news1 = newsService.getById(2l);
        System.out.println("title=====" + news1.getTitle());
    }



}
