package com.wener.blog.web.controller;

import com.wener.blog.api.IArticleService;
import com.wener.blog.entity.Article;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author zhangwei
 */
@RestController
public class IndexController {
    @Reference(version = "${dubbo.version}")
    IArticleService articleService;

    @GetMapping("/list")
    public List<Article> index() {
        List<Article> articles = articleService.pageArticle();
        return articles;
    }

}
