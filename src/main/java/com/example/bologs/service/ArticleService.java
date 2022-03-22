package com.example.bologs.service;

import com.example.bologs.entity.Article;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * (Article)表服务接口
 *
 * @author makejava
 * @since 2020-07-01 13:56:32
 */
public interface ArticleService {

    /**
     * 通过ID查询单条数据
     *
     * @param pid 主键
     * @return 实例对象
     */
    Article queryById(Integer pid);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<Article> queryAllByLimit(int offset, int limit);

    List<Article> queryAllWithCount(String ptype, @Param("count")int count, @Param("size")int size);

    /**
     * 新增数据
     *
     * @param article 实例对象
     * @return 实例对象
     */
    Article insert(Article article);

    /**
     * 修改数据
     *
     * @param article 实例对象
     * @return 实例对象
     */
    Article update(Article article);

    /**
     * 通过主键删除数据
     *
     * @param pid 主键
     * @return 是否成功
     */
    boolean deleteById(Integer pid);

    List<Article> queryAllByType(String ptype);
}