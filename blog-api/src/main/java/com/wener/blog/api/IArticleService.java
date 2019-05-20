package com.wener.blog.api;

import com.wener.blog.entity.Article;

import java.util.List;

/**
 * @author zhangwei
 */
public interface IArticleService {
    List<Article> pageArticle();
}
