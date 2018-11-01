package com.lincan.mybatisreadwrite.service.impl;

import com.lincan.mybatisreadwrite.dao.UserDAO;
import com.lincan.mybatisreadwrite.entity.User;
import com.lincan.mybatisreadwrite.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author: lincan
 * @since: 2018-11-01 14:49
 **/
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDAO userDAO;

    @Override
    public User select() {
        return userDAO.select();
    }
}
