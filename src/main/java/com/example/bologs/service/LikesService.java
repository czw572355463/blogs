package com.example.bologs.service;

import com.example.bologs.entity.Likes;
import java.util.List;

/**
 * (Likes)表服务接口
 *
 * @author makejava
 * @since 2020-06-29 19:57:57
 */
public interface LikesService {

    /**
     * 通过ID查询单条数据
     *
     * @param lid 主键
     * @return 实例对象
     */
    Likes queryById(Integer lid);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<Likes> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param likes 实例对象
     * @return 实例对象
     */
    Likes insert(Likes likes);

    /**
     * 修改数据
     *
     * @param likes 实例对象
     * @return 实例对象
     */
    Likes update(Likes likes);

    /**
     * 通过主键删除数据
     *
     * @param lid 主键
     * @return 是否成功
     */
    boolean deleteById(Integer lid);

}