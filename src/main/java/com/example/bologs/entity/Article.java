package com.example.bologs.entity;

import java.io.Serializable;

/**
 * (Article)实体类
 *
 * @author makejava
 * @since 2020-07-01 13:56:31
 */
public class Article implements Serializable {
    private static final long serialVersionUID = 951515930065425746L;
    
    private Integer pid;
    
    private String ptitle;
    
    private String pcontent;
    
    private Integer uid;
    
    private Integer plikecount;
    
    private Integer pfavoritecount;
    
    private String ptype;
    
    private String cretime;


    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public String getPtitle() {
        return ptitle;
    }

    public void setPtitle(String ptitle) {
        this.ptitle = ptitle;
    }

    public String getPcontent() {
        return pcontent;
    }

    public void setPcontent(String pcontent) {
        this.pcontent = pcontent;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public Integer getPlikecount() {
        return plikecount;
    }

    public void setPlikecount(Integer plikecount) {
        this.plikecount = plikecount;
    }

    public Integer getPfavoritecount() {
        return pfavoritecount;
    }

    public void setPfavoritecount(Integer pfavoritecount) {
        this.pfavoritecount = pfavoritecount;
    }

    public String getPtype() {
        return ptype;
    }

    public void setPtype(String ptype) {
        this.ptype = ptype;
    }

    public String getCretime() {
        return cretime;
    }

    public void setCretime(String cretime) {
        this.cretime = cretime;
    }

}