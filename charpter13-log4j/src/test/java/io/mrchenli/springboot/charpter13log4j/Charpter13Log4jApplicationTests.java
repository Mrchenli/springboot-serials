package io.mrchenli.springboot.charpter13log4j;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import others.TestLog;

import java.net.URISyntaxException;


@RunWith(SpringRunner.class)
@SpringBootTest
public class Charpter13Log4jApplicationTests {

	private Logger logger =  LoggerFactory.getLogger(getClass());

	@Test
	public void test() throws URISyntaxException {
		logger.debug("输出debug");
		logger.info("输出info");
		logger.error("输出error");
		TestLog.test();
	}

}
