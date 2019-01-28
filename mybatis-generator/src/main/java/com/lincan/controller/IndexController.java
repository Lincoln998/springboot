package com.lincan.controller;

import com.lincan.mapper.RobotPoolMapper;
import com.lincan.model.RobotPool;
import com.lincan.model.RobotPoolExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: lincan
 * @since: 2018-11-23 15:56
 **/
@RestController
public class IndexController {

    @Autowired
    private RobotPoolMapper robotPoolMapper;

    @GetMapping("robot")
    public void robot(){
        RobotPoolExample robotPoolExample = new RobotPoolExample();
        robotPoolExample.or().andIdGreaterThan(1L);
        robotPoolExample.setOrderByClause("limit 1");
        RobotPool robotPool = new RobotPool();
        robotPool.setAddress("hangzhou");
        robotPoolMapper.updateByExample(robotPool,robotPoolExample);
    }
}
