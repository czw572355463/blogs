package com.example.bologs.entity;

import java.io.Serializable;

/**
 * (Comments)实体类
 *
 * @author makejava
 * @since 2020-06-29 19:57:57
 */
public class Comments implements Serializable {
    private static final long serialVersionUID = -61943555892547888L;
    
    private Integer cid;
    
    private Integer uid;
    
    private String ccontent;
    
    private Integer pid;

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getCcontent() {
        return ccontent;
    }

    public void setCcontent(String ccontent) {
        this.ccontent = ccontent;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

}