package com.example.bologs.dao;

import com.example.bologs.entity.Reply;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (Reply)表数据库访问层
 *
 * @author makejava
 * @since 2020-06-29 19:57:57
 */
public interface ReplyDao {

    /**
     * 通过ID查询单条数据
     *
     * @param rid 主键
     * @return 实例对象
     */
    Reply queryById(Integer rid);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<Reply> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param reply 实例对象
     * @return 对象列表
     */
    List<Reply> queryAll(Reply reply);

    /**
     * 新增数据
     *
     * @param reply 实例对象
     * @return 影响行数
     */
    int insert(Reply reply);

    /**
     * 修改数据
     *
     * @param reply 实例对象
     * @return 影响行数
     */
    int update(Reply reply);

    /**
     * 通过主键删除数据
     *
     * @param rid 主键
     * @return 影响行数
     */
    int deleteById(Integer rid);

}