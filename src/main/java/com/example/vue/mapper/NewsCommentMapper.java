package com.example.vue.mapper;

import com.example.vue.entries.NewsComment;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
* @author LinYongJin
* @date 2020/1/3 16:33
*/
@Mapper
public interface NewsCommentMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(NewsComment record);

    int insertSelective(NewsComment record);

    NewsComment selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(NewsComment record);

    int updateByPrimaryKey(NewsComment record);

    List<NewsComment> getNewsListByPage(int pageNumber);
}