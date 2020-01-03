package com.example.vue.service;

import com.example.vue.entries.NewsComment;

import java.util.List;

/**
 * @author LinYongJin
 * @date 2020/1/3 16:34
 */
public interface NewsCommentService {

    List<NewsComment> getNewsList(int pageNumber);
}
