package com.lincan.mybatisreadwrite.dao;

import com.lincan.mybatisreadwrite.entity.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

/**
 * @author: lincan
 * @since: 2018-11-01 14:32
 **/
@Mapper
@Repository
public interface UserDAO {

    @Select("select * from user limit 1")
    User select();

    @Insert("insert into user(user_name,age) values (\"lincan\",1)")
    int insert();
}
