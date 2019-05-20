package com.wener.blog.service;

import com.wener.blog.api.IArticleService;
import com.wener.blog.entity.Article;
import org.apache.dubbo.config.annotation.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zhangwei
 */
@Service(version = "${dubbo.version}")
public class ArticleServiceImpl implements IArticleService {
    @Override
    public List<Article> pageArticle() {
        List<Article> articles = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            articles.add(new Article("" + i));
        }
        return articles;
    }
}
