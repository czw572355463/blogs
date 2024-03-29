package com.example.bologs.service;

import com.example.bologs.entity.Favorite;
import java.util.List;

/**
 * (Favorite)表服务接口
 *
 * @author makejava
 * @since 2020-06-29 19:57:57
 */
public interface FavoriteService {

    /**
     * 通过ID查询单条数据
     *
     * @param fid 主键
     * @return 实例对象
     */
    Favorite queryById(Integer fid);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<Favorite> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param favorite 实例对象
     * @return 实例对象
     */
    Favorite insert(Favorite favorite);

    /**
     * 修改数据
     *
     * @param favorite 实例对象
     * @return 实例对象
     */
    Favorite update(Favorite favorite);

    /**
     * 通过主键删除数据
     *
     * @param fid 主键
     * @return 是否成功
     */
    boolean deleteById(Integer fid);

}