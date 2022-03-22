package com.example.bologs.service.impl;

import com.example.bologs.entity.Likes;
import com.example.bologs.dao.LikesDao;
import com.example.bologs.service.LikesService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Likes)表服务实现类
 *
 * @author makejava
 * @since 2020-06-29 19:57:57
 */
@Service("likesService")
public class LikesServiceImpl implements LikesService {
    @Resource
    private LikesDao likesDao;

    /**
     * 通过ID查询单条数据
     *
     * @param lid 主键
     * @return 实例对象
     */
    @Override
    public Likes queryById(Integer lid) {
        return this.likesDao.queryById(lid);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<Likes> queryAllByLimit(int offset, int limit) {
        return this.likesDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param likes 实例对象
     * @return 实例对象
     */
    @Override
    public Likes insert(Likes likes) {
        this.likesDao.insert(likes);
        return likes;
    }

    /**
     * 修改数据
     *
     * @param likes 实例对象
     * @return 实例对象
     */
    @Override
    public Likes update(Likes likes) {
        this.likesDao.update(likes);
        return this.queryById(likes.getLid());
    }

    /**
     * 通过主键删除数据
     *
     * @param lid 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer lid) {
        return this.likesDao.deleteById(lid) > 0;
    }
}