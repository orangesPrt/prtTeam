package com.fullhome.website.service;

import com.fullhome.website.pojo.News;

/**
 * @author yuanxuefeng
 * @date 2016-04-25 下午11:12
 */
public interface NewsService {

    public News getById(long userId);

    public void insertNews(News news);

}
