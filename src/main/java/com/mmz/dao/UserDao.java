package com.mmz.dao;

import com.mmz.pojo.User;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @Classname UserDao
 * @Description TODO
 * @Date 2020/4/30 8:52
 * @Created by mmz
 */
public interface UserDao {
    //查询所有操作
    @Select("select * from user")
    List<User> findAll();
}
