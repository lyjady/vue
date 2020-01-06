package com.example.vue.controller;

import com.example.vue.entries.NewsComment;
import com.example.vue.service.NewsCommentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * @author LinYongJin
 * @date 2020/1/3 16:39
 */
@RestController
@RequestMapping("/news")
public class NewsController {

    private static final Logger log = LoggerFactory.getLogger(NewsController.class);

    @Autowired
    private NewsCommentService newsCommentService;

    @RequestMapping("/getNewsCommentList")
    public List<NewsComment> getNewsCommentList(int pageNumber) {
        return newsCommentService.getNewsList((pageNumber - 1) * 10);
    }

    @PostMapping("/insertNewsComment")
    public NewsComment insertNewsComment(@RequestBody NewsComment comment) {
        comment.setUserName("匿名");
        comment.setAddTime(new Date());
        newsCommentService.insertNewsComment(comment);
        return comment;
    }

}
