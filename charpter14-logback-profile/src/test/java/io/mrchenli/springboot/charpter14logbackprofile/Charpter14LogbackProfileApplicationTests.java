package io.mrchenli.springboot.charpter14logbackprofile;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Charpter14LogbackProfileApplicationTests {

	private Logger logger = LoggerFactory.getLogger(getClass());

	@Test
	public void test(){
		logger.debug("输出debug");
		logger.info("输出info");
		logger.error("输出error");
	}

}
