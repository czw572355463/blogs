package com.example.bologs.entity;

import java.io.Serializable;

/**
 * (Reply)实体类
 *
 * @author makejava
 * @since 2020-06-29 19:57:57
 */
public class Reply implements Serializable {
    private static final long serialVersionUID = -60822933825376240L;
    
    private Integer rid;
    
    private Integer reid;
    
    private Integer rtoid;
    
    private Integer pid;
    
    private String rcontent;
    
    private String time;


    public Integer getRid() {
        return rid;
    }

    public void setRid(Integer rid) {
        this.rid = rid;
    }

    public Integer getReid() {
        return reid;
    }

    public void setReid(Integer reid) {
        this.reid = reid;
    }

    public Integer getRtoid() {
        return rtoid;
    }

    public void setRtoid(Integer rtoid) {
        this.rtoid = rtoid;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public String getRcontent() {
        return rcontent;
    }

    public void setRcontent(String rcontent) {
        this.rcontent = rcontent;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

}