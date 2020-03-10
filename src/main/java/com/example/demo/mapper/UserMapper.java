package com.example.demo.mapper;

import com.example.demo.object.DemoUser;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.List;

@Repository
public interface UserMapper {
    int insert(DemoUser demoUser);

    int updateById(DemoUser demoUser);

    int deleteById(@Param("id") Integer id);

    DemoUser selectById(@Param("id") Integer id);

    DemoUser selectByUsername(@Param("username") String username);

    List<DemoUser> selectByIds(@Param("ids")Collection<Integer> ids);
}
