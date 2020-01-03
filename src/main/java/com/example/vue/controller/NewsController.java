package com.example.vue.controller;

import com.example.vue.entries.NewsComment;
import com.example.vue.service.NewsCommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author LinYongJin
 * @date 2020/1/3 16:39
 */
@RestController
@RequestMapping("/news")
public class NewsController {

    @Autowired
    private NewsCommentService newsCommentService;

    @RequestMapping("/getNewsCommentList")
    public List<NewsComment> getNewsCommentList(int pageNumber) {
        return newsCommentService.getNewsList((pageNumber - 1) * 10);
    }

}
