package com.example.bologs.service;

import com.example.bologs.entity.Reply;
import java.util.List;

/**
 * (Reply)表服务接口
 *
 * @author makejava
 * @since 2020-06-29 19:57:57
 */
public interface ReplyService {

    /**
     * 通过ID查询单条数据
     *
     * @param rid 主键
     * @return 实例对象
     */
    Reply queryById(Integer rid);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<Reply> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param reply 实例对象
     * @return 实例对象
     */
    Reply insert(Reply reply);

    /**
     * 修改数据
     *
     * @param reply 实例对象
     * @return 实例对象
     */
    Reply update(Reply reply);

    /**
     * 通过主键删除数据
     *
     * @param rid 主键
     * @return 是否成功
     */
    boolean deleteById(Integer rid);

}