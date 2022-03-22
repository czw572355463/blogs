package com.example.bologs.entity;

import java.io.Serializable;

/**
 * (Likes)实体类
 *
 * @author makejava
 * @since 2020-06-29 19:57:57
 */
public class Likes implements Serializable {
    private static final long serialVersionUID = 662460671891040780L;
    
    private Integer lid;
    
    private Integer uid;
    
    private Integer pid;


    public Integer getLid() {
        return lid;
    }

    public void setLid(Integer lid) {
        this.lid = lid;
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