package com.example.bologs.entity;

import java.io.Serializable;

/**
 * (Favorite)实体类
 *
 * @author makejava
 * @since 2020-06-29 19:57:57
 */
public class Favorite implements Serializable {
    private static final long serialVersionUID = -51039269638334044L;
    
    private Integer fid;
    
    private Integer uid;
    
    private Integer pid;


    public Integer getFid() {
        return fid;
    }

    public void setFid(Integer fid) {
        this.fid = fid;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

}