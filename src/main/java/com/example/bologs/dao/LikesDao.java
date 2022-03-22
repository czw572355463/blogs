package com.example.bologs.dao;

import com.example.bologs.entity.Likes;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (Likes)表数据库访问层
 *
 * @author makejava
 * @since 2020-06-29 19:57:57
 */
public interface LikesDao {

    /**
     * 通过ID查询单条数据
     *
     * @param lid 主键
     * @return 实例对象
     */
    Likes queryById(Integer lid);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<Likes> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param likes 实例对象
     * @return 对象列表
     */
    List<Likes> queryAll(Likes likes);

    /**
     * 新增数据
     *
     * @param likes 实例对象
     * @return 影响行数
     */
    int insert(Likes likes);

    /**
     * 修改数据
     *
     * @param likes 实例对象
     * @return 影响行数
     */
    int update(Likes likes);

    /**
     * 通过主键删除数据
     *
     * @param lid 主键
     * @return 影响行数
     */
    int deleteById(Integer lid);

}