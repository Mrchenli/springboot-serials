package io.mrchenli.springboot.charpter04thymeleaf;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.RequestBuilder;



import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class Charpter04ThymeleafApplicationTests {

	private static final Logger logger = LoggerFactory.getLogger(Charpter04ThymeleafApplication.class);

	@Autowired
	private MockMvc mvc ;

	@Test
	public void testHelloWorldController() throws Exception {
		RequestBuilder request = null;
		String result = null;

		//hello
		request=get("/hello");
		result = mvc.perform(request).andReturn().getResponse().getContentAsString();
		logger.info("/hello==>{}",result);

		// /
		request = get("/");
		result = mvc.perform(request).andReturn().getResponse().getContentAsString();
		logger.info("/ ==>{}",result);

	}

}
