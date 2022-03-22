package com.example.bologs.entity;

import java.io.Serializable;

/**
 * (Users)实体类
 *
 * @author makejava
 * @since 2020-06-29 19:57:57
 */
public class Users implements Serializable {
    private static final long serialVersionUID = 379682806409421151L;
    
    private Integer uid;
    
    private String uname;
    
    private String uloginname;
    
    private String upass;
    
    private String uimg;
    
    private String urealname;
    
    private String ujobname;
    
    private String ucontact;
    
    private String uemail;
    
    private Integer ustates;


    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getUloginname() {
        return uloginname;
    }

    public void setUloginname(String uloginname) {
        this.uloginname = uloginname;
    }

    public String getUpass() {
        return upass;
    }

    public void setUpass(String upass) {
        this.upass = upass;
    }

    public String getUimg() {
        return uimg;
    }

    public void setUimg(String uimg) {
        this.uimg = uimg;
    }

    public String getUrealname() {
        return urealname;
    }

    public void setUrealname(String urealname) {
        this.urealname = urealname;
    }

    public String getUjobname() {
        return ujobname;
    }

    public void setUjobname(String ujobname) {
        this.ujobname = ujobname;
    }

    public String getUcontact() {
        return ucontact;
    }

    public void setUcontact(String ucontact) {
        this.ucontact = ucontact;
    }

    public String getUemail() {
        return uemail;
    }

    public void setUemail(String uemail) {
        this.uemail = uemail;
    }

    public Integer getUstates() {
        return ustates;
    }

    public void setUstates(Integer ustates) {
        this.ustates = ustates;
    }

}