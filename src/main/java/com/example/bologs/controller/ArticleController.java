package com.example.bologs.controller;

import com.example.bologs.entity.Article;
import com.example.bologs.service.ArticleService;
import java.util.List;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (Article)表控制层
 *
 * @author makejava
 * @since 2020-07-01 13:56:33
 */
@RestController
@RequestMapping("article")
public class ArticleController {
    /**
     * 服务对象
     */
    @Resource
    private ArticleService articleService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Article selectOne(Integer id) {
        return this.articleService.queryById(id);
    }

    @RequestMapping("selectAll")
    public List<Article> selectAllById(String ptype){
        return this.articleService.queryAllByType(ptype);
    }

    @RequestMapping("showAll")
    public List<Article> showAll(String ptype,int count ,int size){
        return this.articleService.queryAllWithCount(ptype,count,size);
    }
}