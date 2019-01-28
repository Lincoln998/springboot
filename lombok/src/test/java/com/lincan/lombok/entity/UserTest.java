package com.lincan.lombok.entity;

import org.junit.Test;
import org.junit.internal.runners.JUnit4ClassRunner;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.Assert.*;
public class UserTest {

    @Test
    public void testData(){
        User user = new User();
        user.setUsername("lincan");
        user.setAge(18);
        System.out.println(user.toString());
//        System.out.println(user.test(111,""));
    }
}