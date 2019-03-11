package com.springboot.chapter5.chapter5.pojo;

import com.springboot.chapter5.chapter5.enumeration.SexEnum;

public class User {

    private Long id = null;
    private String user_name = null;
    private SexEnum sex = null;
    private String note = null;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public SexEnum getSex() {
        return sex;
    }

    public void setSex(SexEnum sex) {
        this.sex = sex;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
}
