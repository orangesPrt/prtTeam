package com.fullhome.website.service.impl;

import com.fullhome.website.dto.NewsDao;
import com.fullhome.website.pojo.News;
import com.fullhome.website.service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 新闻资讯类服务层
 * @author yuanxuefeng
 * @date 2016-04-25 下午11:16
 */
@Service
public class NewsServiceImpl implements NewsService {

    @Autowired
    private NewsDao newsDao;

    @Override
    public News getById(long userId) {
        return newsDao.getById(userId);
    }

    @Override
    public void insertNews(News news) {
        newsDao.insertNews(news);
    }
}
