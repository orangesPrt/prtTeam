package com.fullhome.website.dto;

import com.fullhome.website.pojo.News;

/**
 * 新增资讯dao层
 * @author yuanxuefeng
 * @date 2016-04-21 下午5:34
 */
public interface NewsDao {

    public News getById(long userId);

    public void insertNews(News news);
}
