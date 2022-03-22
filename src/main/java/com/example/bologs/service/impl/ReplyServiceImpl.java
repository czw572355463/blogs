package com.example.bologs.service.impl;

import com.example.bologs.entity.Reply;
import com.example.bologs.dao.ReplyDao;
import com.example.bologs.service.ReplyService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Reply)表服务实现类
 *
 * @author makejava
 * @since 2020-06-29 19:57:57
 */
@Service("replyService")
public class ReplyServiceImpl implements ReplyService {
    @Resource
    private ReplyDao replyDao;

    /**
     * 通过ID查询单条数据
     *
     * @param rid 主键
     * @return 实例对象
     */
    @Override
    public Reply queryById(Integer rid) {
        return this.replyDao.queryById(rid);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<Reply> queryAllByLimit(int offset, int limit) {
        return this.replyDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param reply 实例对象
     * @return 实例对象
     */
    @Override
    public Reply insert(Reply reply) {
        this.replyDao.insert(reply);
        return reply;
    }

    /**
     * 修改数据
     *
     * @param reply 实例对象
     * @return 实例对象
     */
    @Override
    public Reply update(Reply reply) {
        this.replyDao.update(reply);
        return this.queryById(reply.getRid());
    }

    /**
     * 通过主键删除数据
     *
     * @param rid 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer rid) {
        return this.replyDao.deleteById(rid) > 0;
    }
}