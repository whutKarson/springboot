package com.springboot.chapter5.chapter5.service.impl;

import com.springboot.chapter5.chapter5.enumeration.SexEnum;
import com.springboot.chapter5.chapter5.pojo.User;
import com.springboot.chapter5.chapter5.service.JdbcTmplUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Service;

import java.sql.ResultSet;
import java.util.List;
@Service
public class JdbcTmplUserServiceImpl implements JdbcTmplUserService {

    @Autowired
    private JdbcTemplate jdbcTemplate = null;

//    获取映射关系
    private RowMapper<User> getUserMapper() {
        //使用Lamba表达式创建用户映射关系
        RowMapper<User> userRowMapper = (ResultSet rs, int rownum) -> {
            User user = new User();
            user.setId(rs.getLong("id"));
            user.setUser_name(rs.getString("user_name"));
            int sexId = rs.getInt("sex");
            SexEnum sex = SexEnum.getEnumById(sexId);
            user.setSex(sex);
            user.setNote(rs.getString("note"));
            return user;
        };
        return  userRowMapper;
    }


    //获取对象
    @Override
    public User getUser(Long id) {
        //执行的SQL
        String sql = "select id, user_name, sex, note from t_user where id = ?";
        Object[] params = new Object[] {id};
        User user = jdbcTemplate.queryForObject(sql, params, getUserMapper());
        return null;

    }

    //查询用户列表
    @Override
    public List<User> findUsers(String userName, String note) {
        //执行的SQL
        String sql = "select id, user_name, sex, note from t_user "
                + "where user_name like concat('%', ? '%') "
                + "and note like concat('%', ? '%')";
        //参数
        Object[] params = new Object[] {userName, note};
        //使用匿名类实现
        List<User> userList
                = jdbcTemplate.query(sql, params, getUserMapper());
        return null;
    }

    @Override
    public int inserUser(User user) {
        String sql = "insert into t_user (user_name, sex, note) value(?, ?, ?)";
        return jdbcTemplate.update(sql, user.getUser_name(), user.getSex(), user.getNote());
    }

    @Override
    public int updateUser(User user) {
        //执行sql
        String sql = "update t_user set user_name = ?, sex = ?, note = ? "
                + "where id = ?";
        return jdbcTemplate.update(sql, user.getUser_name(), user.getSex(), user.getNote(), user.getId());
    }

    @Override
    public int deleteUser(Long id) {
        //执行的sql
        String sql = "delete from t_user where id = ?";
        return jdbcTemplate.update(sql, id);
    }
}
