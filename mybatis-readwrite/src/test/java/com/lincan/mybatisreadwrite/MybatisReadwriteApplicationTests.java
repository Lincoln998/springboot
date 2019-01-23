package com.lincan.mybatisreadwrite;

import com.lincan.mybatisreadwrite.config.DataSourceContextHolder;
import com.lincan.mybatisreadwrite.config.DataSourceType;
import com.lincan.mybatisreadwrite.entity.User;
import com.lincan.mybatisreadwrite.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MybatisReadwriteApplicationTests {

    @Autowired
    private UserService userService;

    @Test
    public void contextLoads() {
    }

    @Test
    public void read() {
        User select = userService.select();
        System.out.println(select.getUserName());
        int insert = userService.insert();
        System.out.println(insert);
    }

}
