package com.example.bologs.dao;

import com.example.bologs.entity.Favorite;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (Favorite)表数据库访问层
 *
 * @author makejava
 * @since 2020-06-29 19:57:57
 */
public interface FavoriteDao {

    /**
     * 通过ID查询单条数据
     *
     * @param fid 主键
     * @return 实例对象
     */
    Favorite queryById(Integer fid);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<Favorite> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param favorite 实例对象
     * @return 对象列表
     */
    List<Favorite> queryAll(Favorite favorite);

    /**
     * 新增数据
     *
     * @param favorite 实例对象
     * @return 影响行数
     */
    int insert(Favorite favorite);

    /**
     * 修改数据
     *
     * @param favorite 实例对象
     * @return 影响行数
     */
    int update(Favorite favorite);

    /**
     * 通过主键删除数据
     *
     * @param fid 主键
     * @return 影响行数
     */
    int deleteById(Integer fid);

}