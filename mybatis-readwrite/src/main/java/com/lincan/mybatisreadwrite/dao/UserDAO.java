package com.lincan.mybatisreadwrite.dao;

import com.lincan.mybatisreadwrite.entity.User;
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

    @Select("select * from user")
    User select();

}
