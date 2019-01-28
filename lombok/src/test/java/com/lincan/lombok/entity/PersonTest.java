package com.lincan.lombok.entity;


import lombok.Cleanup;
import org.junit.Test;

import java.io.*;

public class PersonTest {

    @Test
    public void test1(){
        Person p1 = new Person("wa","dd");
        System.out.println(p1);

    }

    @Test
    public void test2() throws IOException {
        @Cleanup InputStream is = new FileInputStream("d:/a.png");
    }
}