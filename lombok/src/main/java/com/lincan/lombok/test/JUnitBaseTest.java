package com.lincan.lombok.test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.util.StopWatch;

import lombok.extern.slf4j.Slf4j;

/**
 * <Description> <br>
 * 
 * @author xubin<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2018年9月27日 <br>
 */

@Slf4j
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
@WebAppConfiguration
public class JUnitBaseTest {

    /**
     * sw 计时器<br>
     */
    public static StopWatch sw = null;

    /**
     * Description: <br>
     * 
     * @author xubin<br>
     * @taskId <br>
     * @throws java.lang.Exception <br>
     */
    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        sw = new StopWatch();
    }

    /**
     * Description: <br>
     * 
     * @author xubin<br>
     * @taskId <br>
     * @throws java.lang.Exception <br>
     */
    @AfterClass
    public static void tearDownAfterClass() throws Exception {
        log.info("**************************************************************");
        log.info("单元测试计时统计：{}", sw.prettyPrint());
        log.info("**************************************************************");
    }

    /**
     * Description: <br>
     * 
     * @author xubin<br>
     * @taskId <br>
     * @throws java.lang.Exception <br>
     */
    @Before
    public void setUp() throws Exception {
        log.info("开始测试-----------------");
    }

    /**
     * Description: <br>
     * 
     * @author xubin<br>
     * @taskId <br>
     * @throws java.lang.Exception <br>
     */
    @After
    public void tearDown() throws Exception {
        sw.stop();
        log.info("测试结束-----------------");
    }
}