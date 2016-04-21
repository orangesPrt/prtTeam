package com.fullhome.website.dto;

import com.fullhome.website.pojo.News;
import org.springframework.stereotype.Repository;

/**
 * 新增资讯dao层
 * @author yuanxuefeng
 * @date 2016-04-21 下午5:34
 */
@Repository
public class NewsDaoImpl extends BaseDAO implements NewsDao   {


    @Override
    public News getById(long articleId) {
        return getSqlSession().selectOne("NewsMapper.getById", articleId);
    }
}
