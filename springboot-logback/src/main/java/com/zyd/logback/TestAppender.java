package com.zyd.logback;

import ch.qos.logback.core.UnsynchronizedAppenderBase;
import lombok.extern.slf4j.Slf4j;

/**
 * @author: lincan
 * @since: 2018-11-20 19:31
 **/
@Slf4j
public class TestAppender extends UnsynchronizedAppenderBase {

    @Override
    protected void append(Object o) {
        System.out.println("自定义appender执行:" + o.toString());
    }
}
