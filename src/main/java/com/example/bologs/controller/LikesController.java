package com.example.bologs.controller;

import com.example.bologs.entity.Likes;
import com.example.bologs.service.LikesService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (Likes)表控制层
 *
 * @author makejava
 * @since 2020-06-29 19:57:57
 */
@RestController
@RequestMapping("likes")
@CrossOrigin
public class LikesController {
    /**
     * 服务对象
     */
    @Resource
    private LikesService likesService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Likes selectOne(Integer id) {
        return this.likesService.queryById(id);
    }

}