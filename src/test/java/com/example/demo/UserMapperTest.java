package com.example.demo;

import com.example.demo.mapper.UserMapper;
import com.example.demo.object.DemoUser;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = DemoApplication.class)
public class UserMapperTest {
    @Autowired
    private UserMapper userMapper;

    @Test
    public void testInsert(){
        DemoUser demoUser = new DemoUser();
        demoUser.setUsername(UUID.randomUUID().toString());
        demoUser.setPassword("000");
        demoUser.setCreateTime(new Date());

        userMapper.insert(demoUser);
    }

    @Test
    public void testUpdateById(){
        DemoUser demoUser = new DemoUser();
        demoUser.setId(4);
        demoUser.setPassword("2333");

        userMapper.updateById(demoUser);
    }

    @Test
    public void testDeleteById(){
        userMapper.deleteById(2);
    }

    @Test
    public void testSelectByTd(){
        System.out.println(userMapper.selectById(4).toString());
    }

    @Test
    public void testSelectByUsername(){
        System.out.println(userMapper.selectByUsername("none"));
    }

    @Test
    public void testSelectByIds(){
        List<DemoUser> users = userMapper.selectByIds(Arrays.asList(1,3));
        System.out.println("Users: " + users.size());
    }
}
