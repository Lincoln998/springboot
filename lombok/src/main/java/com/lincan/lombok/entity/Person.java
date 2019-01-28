package com.lincan.lombok.entity;

import lombok.Value;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import sun.applet.resources.MsgAppletViewer;

import java.util.HashMap;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * @author: lincan
 * @since: 2018-11-12 15:11
 **/
@Value
@Slf4j
public class Person {

    private String nickname;

    private String password;



}
