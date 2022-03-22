package com.example.bologs.controller;

import com.example.bologs.entity.Comments;
import com.example.bologs.service.CommentsService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (Comments)表控制层
 *
 * @author makejava
 * @since 2020-06-29 19:57:57
 */
@RestController
@RequestMapping("comments")
@CrossOrigin
public class CommentsController {
    /**
     * 服务对象
     */
    @Resource
    private CommentsService commentsService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Comments selectOne(Integer id) {
        return this.commentsService.queryById(id);
    }

}