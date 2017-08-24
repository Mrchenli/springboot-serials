package io.mrchenlispringboot.charpter02properties;

import com.alibaba.fastjson.JSONObject;
import io.mrchenlispringboot.charpter02properties.service.BlogProperties;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Charpter02PropertiesApplicationTests {

	private static final Logger logger = LoggerFactory.getLogger(Charpter02PropertiesApplicationTests.class);

	@Autowired
	private BlogProperties blogProperties;

	@Test
	public void contextLoads() {
	}

	@Test
	public void test01(){
		logger.info("blog.name==>{}",blogProperties.getName());
		logger.info("blog.title==>{}",blogProperties.getTitle());
		logger.info("blog.desc==>{}",blogProperties.getDesc());
		logger.info("blogProperties==>{}",JSONObject.toJSONString(blogProperties));
	}

}
