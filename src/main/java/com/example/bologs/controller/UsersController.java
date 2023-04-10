package com.example.bologs.controller;

import com.example.bologs.entity.Users;
import com.example.bologs.service.UsersService;
import org.springframework.web.bind.annotation.*;
import javax.annotation.Resource;

/**
 * (Users)表控制层
 *
 * @author makejava
 * @since 2020-06-29 19:57:57
 */
@RestController
@RequestMapping("users")
@CrossOrigin
public class UsersController {
    /**
     * 服务对象
     */
    @Resource
    private UsersService usersService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Users selectOne(Integer id) {
        return this.usersService.queryById(id);
    }

    @RequestMapping("login")
    public Users login(Users users){
        return this.usersService.login(users);
    }

    @RequestMapping("register")
    public Users register(Users users){return  this.usersService.register(users);};
}