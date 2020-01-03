package com.example.vue.service.impl;

import com.example.vue.entries.NewsComment;
import com.example.vue.mapper.NewsCommentMapper;
import com.example.vue.service.NewsCommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author LinYongJin
 * @date 2020/1/3 16:35
 */
@Service
public class NewsCommentServiceImpl implements NewsCommentService {

    @Autowired
    private NewsCommentMapper newsCommentMapper;

    @Override
    public List<NewsComment> getNewsList(int pageNumber) {
        return newsCommentMapper.getNewsListByPage(pageNumber);
    }
}
