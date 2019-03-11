package com.springboot.chapter5.chapter5.service;

import com.springboot.chapter5.chapter5.pojo.User;

import java.util.List;

public interface JdbcTmplUserService {

    public User getUser(Long id);

    public List<User> findUsers(String userName, String note);

    public int inserUser(User user);

    public int updateUser(User user);

    public int deleteUser(Long id);


}
