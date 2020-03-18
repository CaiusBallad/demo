package com.example.demo.dao;

import com.example.demo.bean.User;
import org.apache.ibatis.annotations.*;

import java.util.Date;
import java.util.List;


public interface UserDao {
    @Select("SELECT * FROM users WHERE id = #{id}")
    User findUserById(@Param("id") Integer id);

    @Select("SELECT * FROM users")
    List<User> findAllUser();

    @Update("UPDATE users SET password = #{password} WHERE id = #{id}")
    void updateUser(@Param("password") String password, @Param("id") Integer id);

    @Insert("INSERT INTO users(username, password, create_time) VALUES(#{username},#{password},#{createTime})")
    void insertUser(@Param("username") String username, @Param("password") String Password,
                    @Param("createTime") Date createTime);

    @Delete("DELETE from users WHERE id = #{id}")
    void deleteUserById(@Param("id") Integer id);
}
